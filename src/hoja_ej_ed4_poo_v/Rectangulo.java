/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_ej_ed4_poo_v;

import javax.swing.JOptionPane;

/**
 *
 * @author DAW105
 */
public class Rectangulo {
    private int Largo;
    private int Ancho;

    public Rectangulo() {
         String x = JOptionPane.showInputDialog("Dame el largo del rectangulo");
        this.Largo = Integer.parseInt(x);
        String y = JOptionPane.showInputDialog("Dame el ancho del rectangulo");
        this.Ancho = Integer.parseInt(y);
            }

    public Rectangulo(int Largo, int Ancho) {
        this.Largo = Largo;
        this.Ancho = Ancho;
    }
    public boolean esAlargado () {
        if (this.Largo < this.Ancho *2){
            return false; 
        } else {
            return true;
        }
          
}
    public void Dibuja () {
      
         for (int i=0;i<Largo;i++) {
             
             for (int e =0;e<Ancho;e++) {
                 System.out.print(" * ");
             }
             System.out.println(" ");
         }
    }
    
    
     
}
