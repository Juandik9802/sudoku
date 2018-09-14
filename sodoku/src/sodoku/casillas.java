/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodoku;

/**
 * @author 
 * @author Juan Diego Pachón
 */
public class casillas {
    
    private int columna;
    private int fila;
    private int numeroFijo;
    private boolean editar;
    private sector sector;
    
    /**
     * 
     * @param columna
     * @param fila
     * @param numeroFijo
     * @param editar 
     */
    public casillas(int columna, int fila, int numeroFijo,sector sector, boolean editar) {
        this.columna = columna;
        this.fila = fila;
        this.numeroFijo = numeroFijo;
        this.sector=sector;
        this.editar = editar;
    }

    public casillas() {
    }
        
    /**
 * ubicar el sector 
     */
    public void establecerSectorSegunPosicion() {
		switch(fila) {
		
		case 0:
		case 1:
		case 2:
			switch(columna) {
			case 0:
			case 1:
			case 2:
				this.setSector(sector.PRIMERO);
				break;
			case 3:
			case 4:
			case 5:
				this.setSector(sector.SEGUNDO);
				break;
			case 6:
			case 7: 
			case 8:
				this.setSector(sector.TERCERO);
				break;
			default:
				break;
			}
			break;
		case 3:
		case 4:
		case 5:
			switch(columna) {
			case 0:
			case 1:
			case 2:
				this.setSector(sector.CUARTO);
				break;
			case 3:
			case 4:
			case 5:
				this.setSector(sector.QUINTO);
				break;
			case 6:
			case 7: 
			case 8:
				this.setSector(sector.SEXTO);
				break;
			default:
				break;
			}
			break;
		case 6:
		case 7:
		case 8:
			switch(columna) {
			case 0:
			case 1:
			case 2:
				this.setSector(sector.SEPTIMO);
				break;
			case 3:
			case 4:
			case 5:
				this.setSector(sector.OCTAVO);
				break;
			case 6:
			case 7: 
			case 8:
				this.setSector(sector.NOVENO);
				break;
			default:
				break;
			}
			break;
		}
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

    public boolean isEditar() {
        return editar;
    }

    public void setNumeroFijo(int numeroFijo) {
        this.numeroFijo = numeroFijo;
    }
    
    public void setSector(sector sector) {
		this.sector = sector;
	}

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }
    
}
