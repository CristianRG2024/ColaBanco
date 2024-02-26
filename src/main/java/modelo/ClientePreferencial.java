
package modelo;

import cola.Base;

/**
 *
 * @author CRISTIANR
 */
public class ClientePreferencial extends Base{
      private String edadCliente;
    private String tiempoCliente;

    public ClientePreferencial() {
    }

    public ClientePreferencial(String edadCliente, String tiempoCliente) {
        this.edadCliente = edadCliente;
        this.tiempoCliente = tiempoCliente;
    }
    
    
    

    /**
     * Get the value of tiempoCliente
     *
     * @return the value of tiempoCliente
     */
    public String getTiempoCliente() {
        return tiempoCliente;
    }

    /**
     * Set the value of tiempoCliente
     *
     * @param tiempoCliente new value of tiempoCliente
     */
    public void setTiempoCliente(String tiempoCliente) {
        this.tiempoCliente = tiempoCliente;
    }

    /**
     * Get the value of edadCliente
     *
     * @return the value of edadCliente
     */
    public String getEdadCliente() {
        return edadCliente;
    }

    /**
     * Set the value of edadCliente
     *
     * @param edadCliente new value of edadCliente
     */
    public void setEdadCliente(String edadCliente) {
        this.edadCliente = edadCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" + "edadCliente=" + edadCliente + ", tiempoCliente=" + tiempoCliente + '}';
    }

    @Override
    public Base copy() {
        return new Clientes(edadCliente, tiempoCliente);
    }
}
