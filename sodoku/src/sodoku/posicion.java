/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodoku;

/**
 *
 * @author Juan Diego Pachón
 */
public class posicion {
    
    private int columna;
    private int fila;
    private int numeroFijo;

    public posicion(int columna, int fila, int numeroFijo) {
        this.columna = columna;
        this.fila = fila;
        this.numeroFijo = numeroFijo;
    }

    public int getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }

    public int getNumeroFijo() {
        return numeroFijo;
    }
    
    
}
