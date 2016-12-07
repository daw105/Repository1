
package hoja_ej_ed4_poo_v;

/**
 *
 * @author DAW105
 */
public class criptar {

    
   private String cadena;

    public criptar(String cadena) {
        this.cadena = cadena;
    }
   
    public void cifrar () {
        char cifrar = 'a';
        char aux ='a';
        int aux2 = 'a';
        char aux3 ='a';
        char aux4 ='a';
        for (int i=0;i<this.cadena.length();i++){
            cifrar = this.cadena.charAt(i);
            aux = this.cadena.charAt(i++);
            aux2 = cifrar+aux;
            aux3 = (char) aux2;
            System.out.println(aux+" = "+aux2+ " = "+aux3);
        }
        
        
    }
}
