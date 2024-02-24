/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

import java.util.LinkedList;

/**
 *
 * @author CRISTIANR
 */
public class Cola <T extends Base> {
    
        
    private LinkedList<T> personas;
    
    public Cola(){
        personas = new LinkedList<>();
    }
    
    public void encolar(T elemento){
        personas.addLast(elemento);
    }
    
    public T desencolar() {
        return personas.removeFirst();
    }
    
    public boolean estaVacia() {
        return personas.isEmpty();
    }
    @Override
    public String toString(){
        String cad = "[";
        for (T e: personas){
            cad+=" " + e.toString();
        }
        return cad + "]";
    }
}

    

