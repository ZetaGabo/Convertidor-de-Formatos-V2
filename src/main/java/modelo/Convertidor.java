/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jev
 */
public class Convertidor {

    public static final int FORMATO_ENTRADA = 0;
    public static final int FORMATO_SALIDA = 1;
    public static final int RUTA_ENTRADA = 2;
    public static final int RUTA_SALIDA = 3;
    public static int NUM_DATOS;

    private String[] datos;

    public Convertidor(String[] datos) {
        this.datos = datos;
    }
    
    

}
