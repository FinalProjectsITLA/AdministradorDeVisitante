package edu.itla.administradordevisitante.modelo;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import edu.itla.administradordevisitante.visitante.Visitante;

public class ModeloTablaVisitante extends AbstractTableModel{

	private static final long serialVersionUID = 2763123826563801093L;
	//ResultadosBD resultados;
	private ArrayList<Visitante> visitantes;
	private String[] nombreDeColumna = {
			"Nombre" , "Apellido", "Sexo"
	};
	
	public ModeloTablaVisitante(){
		
	}

	@Override
	public int getRowCount() {
		
		return visitantes.size();
	}
	
	@Override
	public String getColumnName(int x) {
		
		return nombreDeColumna[x];
	}

	@Override
	public int getColumnCount() {
		
		return nombreDeColumna.length;
	}

	@Override
	public Object getValueAt(int x, int y) {
		
		String mostrar = "";
		
		switch(y){
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		}
		
		return mostrar;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		
		return true;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		
	}
	
	public void agregar(){
		
	}
	
	public void eliminar(){
		
	}
}
