/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.mavenproject1;

import javax.swing.JLabel;

/**
 *
 * @author INGTEC
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    void marcarCasilla(int i, int j, JLabel[][] casillas) {
        casillas [i][j].setText("x");
    }
}
