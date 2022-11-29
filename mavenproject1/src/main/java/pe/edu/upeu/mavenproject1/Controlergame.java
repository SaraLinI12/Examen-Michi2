/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.mavenproject1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 *
 * @author INGTEC
 */
public class Controlergame {
    private VewGame view;
    private Mavenproject1 model;
    private JLabel [][] casillas;
    public Controlergame(VewGame view,Mavenproject1 model ){
        this.view= view;
        this.model= model;
       casillas= view.getCasillas();
       agregarListeners();
    }

    
    private void agregarListeners() {
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                agregarEventoMouse(i,j);
            }
            
        }
   }

    private void agregarEventoMouse(int i, int j) {
        JLabel casillaActual= casillas [i][j];
        casillaActual.addMouseListener(new MouseAdapter() {
            public void mouseCliked(MouseEvent e) {
                model.marcarCasilla(i,j,casillas);
            }
        });
    }
    
}
