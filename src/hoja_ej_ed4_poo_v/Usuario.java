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
public class Usuario {
  private String Nombre;
  private String Apellido;
  private String Telefono;

    public Usuario(String Nombre, String Apellido, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
  
  public boolean esDeCantabria (){
      String Pree ="942";
      if (Telefono.substring(0, 2).compareToIgnoreCase(Pree)==0){
          return true;
      }else {
          return false;
      }
  }
  public String generalEmail () {
      String Email;
      Email = this.Nombre.concat("_")+this.Apellido+this.Telefono.substring(8)+"@javamail.com";
      return Email.toLowerCase();
  }
  public int ContieneLetra (String letra) {
      int aux = this.Apellido.length();
      String Letraapellido;
      int cont =0;
      int nletras=0;
      while (cont<aux) {
          int cont1=1;
          Letraapellido = this.Apellido.substring(0,1);
          System.out.println(Letraapellido);
          
          if (Letraapellido.compareToIgnoreCase(letra)==0) {             

          }

      }
      
      return nletras;
  }
}
