package com.mycompany.ipc1_02_2023;

import com.mycompany.ipc1_02_2023.objects.articulos.Articulo;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Crear un juego de buscaminas simplificado. Al iniciar el juego, se elige la
 * cantidad de minas a colocar en el tablero, el tablero siempre sera de 5x5.
 * Hay tres niveles (cantidad de minas) 1. facil = 3 minas 2. medio = 6 minas 3.
 * dificil = 12 minas
 *
 * El juego consite en que el usuario debe desactivad minas al inidica la
 * casilla donde supone que exite una mina, teniendo una cantida definida de
 * intentos. 1. facil = 25 intentos 2. medio = 20 intentos 3. dificl = 15
 * intentos
 *
 * El juego se gana cuando se desactivan todas las minas
 *
 *
 * @author jose
 */
public class Buscaminas {

    public static final int MINAS_NIVEL_FACIL = 3;
    public static final int MINAS_NIVEL_MEDIO = 6;
    public static final int MINAS_NIVEL_DIFICIL = 12;
    public static final int INTENTOS_NIVEL_FACIL = 25;
    public static final int INTENTOS_NIVEL_MEDIO = 20;
    public static final int INTENTOS_NIVEL_DIFICIL = 15;

    static int minas;
    static int minasDescubiertas;
    static int intentosDisponibles;
    static int intentos;

    public static void main(String[] args) {
        System.out.println("arguments:");
        System.out.println(Arrays.toString(args));
        int nivel;
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[5][5];
        Articulo articulo = new Articulo();
        //articulo.costoBase = 55;
        
        if (args.length > 0) {
            nivel = Integer.valueOf(args[0]);
        } else {
            // Pedir que se ingrese el nivel:
            System.out.println("Seleccione el nivel:");
            System.out.println("1. Facil");
            System.out.println("2. Medio");
            System.out.println("3. Dificil");
            nivel = Integer.valueOf(scanner.nextLine());

        }

        registrarNivel(nivel);
        colocarMinas(tablero);
        do {
            mostrarTablero(tablero);
            recibirCoordenadas(tablero);
        } while (minasDescubiertas < minas && intentosDisponibles > 0);

        avisarResultadoFinal();
    }

    public static void registrarNivel(int nivel) {
        // voy a definir la cantidad de minas y la cantidad de intentos
        switch (nivel) {
            case 1:
                minas = MINAS_NIVEL_FACIL;
                intentosDisponibles = INTENTOS_NIVEL_FACIL;
                intentos = INTENTOS_NIVEL_FACIL;
                break;
            case 2:
                minas = MINAS_NIVEL_MEDIO;
                intentosDisponibles = INTENTOS_NIVEL_MEDIO;
                intentos = INTENTOS_NIVEL_MEDIO;
                break;
            case 3:
                minas = MINAS_NIVEL_DIFICIL;
                intentosDisponibles = INTENTOS_NIVEL_DIFICIL;
                intentos = INTENTOS_NIVEL_DIFICIL;
            default:
                throw new AssertionError();
        }

    }

    public static void colocarMinas(char[][] tablero) {
        // aleatoriamente voy a distribuir minas en el tablero
        inicializarTablero(tablero);
        int fila;
        int columna;
        int minasColocadas = 0;

        do {
            Random random = new Random();
            fila = random.nextInt(5);
            columna = random.nextInt(5);
            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = 'a';
                minasColocadas++;
            }
        } while (minasColocadas < minas);
    }

    public static void mostrarTablero(char[][] tablero) {
        // no mostrar cuando el caracter es 'a'
        // mostrar X cuando no le atinamos
        // mostrar M cuando marcamos una mina correcta
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("|");
                if (tablero[fila][columna] == 'a') {
                    System.out.print(" ");
                } else {
                    System.out.print(tablero[fila][columna]);
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    public static void recibirCoordenadas(char[][] tablero) {
        boolean esCoordenadaValida;
        Scanner scanner = new Scanner(System.in);
        int fila;
        int columna;
        do {
            System.out.println("Ingrese la fila de la celda a marcar");
            fila = Integer.valueOf(scanner.nextLine());

            System.out.println("Ingrese la columna de la celda a marcar");
            columna = Integer.valueOf(scanner.nextLine());

            esCoordenadaValida = validarCoordenada(tablero, fila, columna);
        } while (!esCoordenadaValida);

        verificarMina(tablero, fila, columna);
    }

    public static boolean validarCoordenada(char[][] tablero, int fila, int columna) {
        // si (x esta fuera de rango || y esta fuera de rango || posicion marcada)
        if (fila < 0 || fila > 5) {
            System.out.println("Fila fuera de rango");
            return false;
        }
        if (columna < 0 || columna > 5) {
            System.out.println("Columna fuera de rango");
            return false;
        }

        if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'M') {
            System.out.println("Celda ya marcada");
            return false;
        }

        return true;
    }

    public static void verificarMina(char[][] tablero, int fila, int columna) {
        // si tablero[x][y] es mina entonces aumentar minas descubiertas y marcarla en el tablero
        // avisar que se descubrio una mina 

        if (tablero[fila][columna] == 'a') {
            minasDescubiertas++;
            tablero[fila][columna] = 'M';
            System.out.println("Ha descubierto una mina");
        } else if (tablero[fila][columna] == ' ') {
            tablero[fila][columna] = 'X';
            System.out.println("Fallo.");
        }

        // reducir los intentos y avisar intentos disponibles
        intentosDisponibles--;
        System.out.println("Aun le quedan " + intentosDisponibles + " intentos disponibles");
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                tablero[fila][columna] = ' ';
            }
        }
    }

    public static void avisarResultadoFinal() {
        if (minasDescubiertas == minas) {
            int intentosUsados = intentos - intentosDisponibles;
            System.out.format("Felicidades, usted descubrio todas las minas en %d intentos", intentosUsados);
        }
    }
}
