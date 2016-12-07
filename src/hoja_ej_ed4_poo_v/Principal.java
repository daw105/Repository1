/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_ej_ed4_poo_v;

/**
 *
 * @author DAW105
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 

        /**
         ******** PRUEBA CLASS HIPOTECA ********* int cont = 10; Hipoteca
         * MiHipoteca = new Hipoteca(6000, 3.5, 20);
         * System.out.println("CAPITAL: " + MiHipoteca.getCapital() + " " +
         * "REDITO: " + MiHipoteca.getRedito() + "%");
         *
         * System.out.println("Tiempo\tCuota"); while (cont <= 20) { Hipoteca
         * MiHipoteca1 = new Hipoteca(6000, 3.5, cont); System.out.println(cont
         * + "\t" + MiHipoteca1.Cuota()); cont++; }
         *
         *
         */
        /**
         *******Prueba Class Usuario*******
         *
         * Usuario MiUsuario = new Usuario ("Carla", "Anton","942082899");
         *
         * System.out.println(MiUsuario.generalEmail());
         * System.out.println(MiUsuario.ContieneLetra("n")); }
         *
         */
        /* Prueba Class Rectangulo
         Rectangulo MiRectangulo = new Rectangulo(3, 3);

         System.out.println(MiRectangulo.esAlargado());
         MiRectangulo.Dibuja();
         */
        
//        reloj mireloj = new reloj (17,0,0);
//        
//        if (mireloj.horavalida()) {
//            System.out.println("La hora es valida");
//        } else {
//            System.out.println("La hora no es valida");
//        }
        
//        mireloj.horamas();
//        
//        System.out.println(mireloj);
//        mireloj.horamenos();
//        System.out.println(mireloj);
//
//        mireloj.mostrar12();
//        System.out.println(mireloj);
        
//        mireloj.mostrar24();
        
        criptar micriptar = new criptar ("Carla");
        
 micriptar.cifrar();
        
    }
    
}
