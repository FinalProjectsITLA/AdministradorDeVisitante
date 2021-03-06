package edu.itla.administradordevisitante.modelo;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import edu.itla.administradordevisitante.evento.Evento;

public class ModeloTablaEventosActuales extends AbstractTableModel{
	
	private static final long serialVersionUID = -1409579478263587874L;
	//ResultadosBD resultados;
	private ArrayList<Evento> eventos;
	
	private String[] nombreDeColumna = {
			"Nombre" , "Ubicacion", "Fecha"
	};

	public ModeloTablaEventosActuales(){
		eventos = new ArrayList<Evento>();
	}
	
	@Override
	public int getRowCount() {
		
		return eventos.size();
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
}
