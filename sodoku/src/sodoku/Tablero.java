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
public class Tablero {
    /// PROPIEDADES 
	
	private casillas[][] casillas;
	
	/// CONSTRUCTOR
	
	/**
	 * Genera un tablero de sudoku bÃ¡sico de 9x9
	 */
	public Tablero() {
		this.casillas = new casillas[9][9];
	}
	
	/// METODOS
	
	/**
	 * Devuelve las casillas del tablero
	 * @return
	 */
	public casillas[][] getCasillas() {
		return this.casillas;
	}
	
	/**
	 * Inicializa el tablero estableciendo por defecto los valores:
	 * Valor 	= 0
	 * PosX 	= i
	 * PosY 	= j
	 * Editable = true
	 * Sector 	= SegÃºn posiciÃ³n
	 */
	public void inicializarTablero() {
		
		for (int i = 0; i < this.casillas.length; i++) {
			for (int j = 0; j < this.casillas[i].length; j++) {
				casillas casilla = new casillas();
				casilla.setNumeroFijo(0);
				casilla.setFila(i);
				casilla.setColumna(j);
				casilla.setEditar(true);
				casilla.establecerSectorSegunPosicion();
				
				this.casillas[i][j] = casilla;
			}
		}
	}
	
	/**
	 * Establece una nueva casilla en la posiciÃ³n que tenga configurada la misma
	 * @param casilla
	 */
	public void editarCasilla(casillas casilla) {
		this.casillas[casilla.getFila()][casilla.getColumna()] = casilla;
	}
	
	/**
	 * Reestablece el valor de la casilla segÃºn su posiciÃ³n
	 * @param x PosiciÃ³n horizontal
	 * @param y PosiciÃ³n vertical
	 */
	public void reestablecerCasillaPorPosicion(int x, int y) {
		this.casillas[x][y].setNumeroFijo(0);
	}
	
	/**
	 * Inserta los valores de la matriz en la misma casilla respecto a su posiciÃ³n
	 * Ha tenido que inicializarse la matriz de casillas previamente
	 * @param matriz Matriz de enteros entre 0 y 9
	 */
	public void insertarValores(int[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != 0) {
					this.casillas[i][j].setEditar(false);
				}
				this.casillas[i][j].setNumeroFijo(matriz[i][j]);
			}
		}
	}

}
