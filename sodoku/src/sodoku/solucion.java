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
    private boolean continuar= true;
    private boolean ciclo= false;//ciclo para romper el for
    private int fila,columna,numero,cantidadNumeros;
    private int sudoku[][]=new int[9][9];
    private posicion listaPosiciones[]=null;
/**
 *  menu principal
 */
    public solucion() {
        Scanner entrada =new Scanner(System.in);
        do{
            bienvenida();
            posicion listaPosiciones[] = new posicion[cantidadNumeros];
            for (int i=0;i<cantidadNumeros;i++){
                posicion();
                listaPosiciones[i]=new posicion(fila,columna,numero);
                System.out.println("////////////////////////////////////////////////////////////////////////////");
                if (this.ciclo==true){
                    break;
                }
            }try{
                System.out.println("Desea continuar");
                System.out.println("1. continuar");
                System.out.println("2. salir");
                int seguir = entrada.nextInt();
                if (seguir != 1){
                    continuar= false;
                }
            }catch(Exception error){
                System.out.println("ERROR");
            }
            
        }while(continuar);
            
        
    }
    
            
        
    /**
     * mensaje de bienvenida
     */
    private void bienvenida(){        
        Scanner entrada =new Scanner(System.in);
        System.out.println("Bienvenidos al solucionador del sudoku");
        System.out.println("cuantos numeros fijos desea poner");
        this.cantidadNumeros=entrada.nextInt();
     }
    
    /**
     *  tomar los valores predeterminados 
     */
    private void posicion(){
        try{
            Scanner entrada =new Scanner(System.in);
            System.out.println("Por favor digite el número de la columna donde desea poner el numero");
            fila= entrada.nextInt();
            System.out.println("Por favor digite el número de la fila donde desea poner el numero");
            columna= entrada.nextInt();
            System.out.println("Por favor digite el número  a colocar el sudoku");
            numero= entrada.nextInt();
            if (validarfilaColumna(fila,columna)== true){
                this.ciclo= true;
            }
           
        }catch(Exception error){
            System.out.println("Error de asignacion");            
            this.ciclo= true;
        }
        
    }
    /**
     * 
     * @param fila
     * @param columna
     * @return retorna verdadero si numero de la fila o columna esta entre 0 y 8
     *         delo contrario es falso
     */
    private boolean validarfilaColumna(int fila, int columna){
        boolean verificacion=false;
        if (fila>8 || fila<-1){
            System.out.println("Error la fila no exixte");
            verificacion=true;
        }
        if (columna>8 || columna<-1){
            System.out.println("Error la columna no existe");
            verificacion=true;
        } return verificacion;
    }

    public int[][] getSudoku() {
        return sudoku;
    }

    public void setSudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }

    public posicion[] getListaPosiciones() {
        return listaPosiciones;
    }

    public void setListaPosiciones(posicion[] listaPosiciones) {
        this.listaPosiciones = listaPosiciones;
    }
}