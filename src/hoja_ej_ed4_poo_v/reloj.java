package hoja_ej_ed4_poo_v;

/**
 *
 * @author DAW105
 */
public class reloj {

    private int hora;
    private int minuto;
    private int segundo;

    reloj() {

    }

    reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public boolean horavalida() {
        boolean flag = false;

        if (((this.hora <= 23 && this.hora >= 0) && (this.minuto >= 0 && this.minuto < 60)) && (this.segundo >= 0 && this.segundo < 60)) {
                      
            flag = true;
        }

        return flag;
    }

    public void horamas () {
    if (this.segundo +1 == 60){
        if (this.minuto +1 ==60 ) {
            if (this.hora +1 ==24) {
                this.hora= 0;
                this.minuto= 0;
                this.segundo = 0;
            } else {
                this.hora+=1;
                this.minuto =0;
                this.segundo =0;
            } 
        } else {
            this.minuto+=1;
            this.segundo = 0;
                    }
    } else {
        this.segundo +=1;
    }
    }
 public void horamenos () {
    if (this.segundo -1 == -1){
        if (this.minuto -1 == -1 ) {
            if (this.hora -1 ==-1) {
                this.hora= 23;
                this.minuto= 59;
                this.segundo = 59;
            } else {
                this.hora-=1;
                this.minuto =59;
                this.segundo =59;
            } 
        } else {
            this.minuto-=1;
            this.segundo = 59;
                    }
    } else {
        this.segundo -=1;
    }
    }

    @Override
    public String toString() {
        return "reloj{" + "hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + '}';
    }
    public void mostrar12 () {
        if (this.hora <12){
            this.hora = this.hora;
        }else{
            this.hora = this.hora -12;
        }
    }
    public void mostrar24 () {
        System.out.println("reloj{" + "hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + '}');
    }
    
    
}
