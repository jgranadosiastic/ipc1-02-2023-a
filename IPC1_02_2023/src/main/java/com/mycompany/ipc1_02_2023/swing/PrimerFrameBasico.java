/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.swing;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author jose
 */
public class PrimerFrameBasico {

    private static final String PATH_ARCHIVO_TEXTO = "/home/jose/algo.txt";

    public void crearFrameBasico() {
        JFrame primerFrame = new JFrame("Primer Frame");
        primerFrame.getContentPane().setLayout(new BoxLayout(primerFrame.getContentPane(), BoxLayout.Y_AXIS));
        primerFrame.setSize(200, 200);
        primerFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextField texto1 = new JTextField();
        texto1.setSize(100, 30);
        texto1.setPreferredSize(new Dimension(100, 30));
        primerFrame.add(texto1);

        JLabel etiqu1 = new JLabel("Label 1");
        etiqu1.setSize(100, 30);

        primerFrame.add(etiqu1);

        JButton boton = new JButton();
        boton.setSize(100, 30);
        boton.setPreferredSize(new Dimension(100, 30));
        boton.setText("Agregar");

        boton.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                File archivoText = new File(PATH_ARCHIVO_TEXTO);
                try (FileWriter fileWrite = new FileWriter(archivoText, true);) {

                    fileWrite.append(texto1.getText());
                    fileWrite.append("\n");
                    fileWrite.close();
                } catch (IOException ex) {
                    // manejar el error
                    ex.printStackTrace();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        primerFrame.add(boton);

        primerFrame.setVisible(true);
    }

}
