/*
 * Quintero Garcia Kevin Fermin
 * 9-3
 * Programacion Móvil
 */
package practica.pkg1;

/**
 *
 * @author MM09
 */
public class boletos {
    
    private int noBoleto;
    private char nomCliente;
    private char destino;
    private char tipoViaje;
    private float precio;
    
    public boletos(){
    
    }
    public boletos(int noBoleto,char nomCliente, char destino, char tipoViaje,float precio){
        
    }
    public boletos(boletos boletos){
        
    }

    /**
     * @return the noBoleto
     */
    public int getNoBoleto() {
        return noBoleto;
    }

    /**
     * @param noBoleto the noBoleto to set
     */
    public void setNoBoleto(int noBoleto) {
        this.noBoleto = noBoleto;
    }

    /**
     * @return the nomCliente
     */
    public char getNomCliente() {
        return nomCliente;
    }

    /**
     * @param nomCliente the nomCliente to set
     */
    public void setNomCliente(char nomCliente) {
        this.nomCliente = nomCliente;
    }

    /**
     * @return the destino
     */
    public char getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(char destino) {
        this.destino = destino;
    }

    /**
     * @return the tipoViaje
     */
    public char getTipoViaje() {
        return tipoViaje;
    }

    /**
     * @param tipoViaje the tipoViaje to set
     */
    public void setTipoViaje(char tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
