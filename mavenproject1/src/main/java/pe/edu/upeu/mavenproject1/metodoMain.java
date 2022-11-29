/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.mavenproject1;

/**
 *
 * @author INGTEC
 */
public class metodoMain {
    public static void main(String args[]){
        Mavenproject1 model=new Mavenproject1();
        VewGame view=new VewGame();
        Controlergame controlador=new Controlergame(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
       
    }
}
