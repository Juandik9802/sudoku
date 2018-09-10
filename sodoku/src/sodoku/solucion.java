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
    
    private int fila,columna,numero;
    private int soduku[];
    private posicion listaPociciciones[];

    public solucion() {
        
        bienvenida();
        posicion();
    }
    
    private void bienvenida(){
        System.out.println("Bienvenidos al solucionador del sudoku");
    }
    
    private void posicion(){
        Scanner entrada =new Scanner(System.in);
        System.out.println("Por favor digite el número de la columna donde desea poner el numero");
        fila= entrada.nextInt();
        System.out.println("Por favor digite el número de la fila donde desea poner el numero");
        columna= entrada.nextInt();
        System.out.println("Por favor digite el número  a colocar el sudoku");
        numero= entrada.nextInt();
    }   
}
