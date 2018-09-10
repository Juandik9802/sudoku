/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodoku;

import java.util.Scanner;

/**
 *
 * @author Juan Diego Pachón
 */
public class solucion {
    
    private int fila,columna,numero,cantidadNumeros;
    private int soduku[];
    private posicion listaPociciciones[];
/**
 *  menu principal
 */
    public solucion() {        
        bienvenida();
        cantidadNumeros-=1;
        sodoku.posicion listaPocicicione = listaPociciciones[cantidadNumeros];
        for (int i=0;i<=cantidadNumeros;i++){
            posicion(i);
        }
        
    }
    /**
     * mensaje de bienbenida
     */
    private void bienvenida(){
        Scanner entrada =new Scanner(System.in);
        System.out.println("Bienvenidos al solucionador del sudoku");
        System.out.println("cuantos numeros fijos desea poner");
        cantidadNumeros=entrada.nextInt();
     }
    
    /**
     *  tomar los valores predeterminados 
     */
    private void posicion(int localisacion){
        Scanner entrada =new Scanner(System.in);
        System.out.println("Por favor digite el número de la columna donde desea poner el numero");
        fila= entrada.nextInt();
        System.out.println("Por favor digite el número de la fila donde desea poner el numero");
        columna= entrada.nextInt();
        System.out.println("Por favor digite el número  a colocar el sudoku");
        numero= entrada.nextInt();
        
        listaPociciciones[localisacion](fila,columna,numero);
    }   
}
