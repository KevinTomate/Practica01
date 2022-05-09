package com.example.practica01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/*
 * Quintero Garcia Kevin Fermin
 * 9-3
 * Programacion Móvil
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
    public double calcularSubTotal(){
        double subTotal = 0.0;
        if(this.tipoViaje==1){ subTotal = this.precio; }
        else if(this.tipoViaje==2){ subTotal = this.precio * 1.80; }
        return subTotal;
    }

    public double calcularImpuesto(){
        double impuesto = 0.0;
        impuesto = this.calcularSubTotal() * 0.16;
        return impuesto;
    }

    public double calcularDescuento(int edad){
        double descuento = 0.0;
        if(edad>=60){ descuento = this.calcularSubTotal() * 0.50; }
        return descuento;
    }

    public double calcularTotal(int edad){
        double total = 0.0;
        total = this.calcularSubTotal() + this.calcularImpuesto() - this.calcularDescuento(edad);
        return total;
    }
}


}