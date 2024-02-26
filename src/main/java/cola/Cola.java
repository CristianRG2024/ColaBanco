
package cola;

import java.util.LinkedList;

/**
 *
 * @author CRISTIANR
 */
public class Cola <T extends Base> {
    
        
    private LinkedList<T> tope;
    
    public Cola(){
        tope = new LinkedList<>();
    }
    
    public void encolar(T persona){
        tope.addLast(persona);
    }
    
    public T desencolar() {
        return tope.removeFirst();
    }
    
    public boolean estaVacia() {
        return tope.isEmpty();
    }
    @Override
    public String toString(){
        String cad = "[";
        for (T e: tope){
            cad+=" " + e.toString();
        }
        return cad + "]";
    }
}

    

