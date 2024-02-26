package modelo;

import java.util.Random;

/**
 *
 * @author yefri
 */
public class Cajero {

    private boolean ocupado;
    private int tiempoTransaccion;
    private int tiempoRestante;

    public Cajero(int tiempoMinimo, int tiempoMaximo){
        Random random= new Random();
        this.tiempoTransaccion= random.nextInt(tiempoMaximo - tiempoMinimo+ 1)+ tiempoMinimo ;
        this.ocupado= false;
        this.tiempoRestante= 0;
    }
    public void atenderCliente(){
        if(!ocupado){
            ocupado= true;
            tiempoRestante= tiempoTransaccion;
        }
    }
    public void avanzarTiempo(){
        if(ocupado){
            tiempoRestante--;
            if(tiempoRestante== 0){
                ocupado=false;
            }
        }
    }
    
    public boolean estaOcupado(){
        return ocupado;
    }
    
    public int getTiempoRestante(){
        return tiempoRestante;
    }
    
    public int getTiempoTransaccion(){
        return tiempoTransaccion;
    }
    
}
