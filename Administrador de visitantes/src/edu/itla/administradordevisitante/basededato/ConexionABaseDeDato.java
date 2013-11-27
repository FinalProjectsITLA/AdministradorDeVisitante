package edu.itla.administradordevisitante.basededato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class ConexionABaseDeDato {
	
	private String instance;
	private Connection conexion;
	private PreparedStatement stmt;
	private ResultSet rset;
	private HashMap<Integer, Integer> IdEvento;
	private ArrayList<String> nombreVisitante;
	private ArrayList<String> apellidoVisitante;
	private ArrayList<String> sexoVisitante;
	private ArrayList<String> telefonoVisitante;
	private ArrayList<String> direccionVisitante;
	private int IdUsuario;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String usuario;
	private String claveUsuario;
	private String sexoUsuario;
	
	void ConeccionABaseDeDato(){
		
		
	}
	
	
	public void desplegarEventos(){
		
	}
	
	
	public void desplegarVisitantes(){
		
		
	}
	
	public void mostrarUsuario(){
		
		
	}
	
	public void buscadorVisitante( String categoria){
		
		
	}
	
	
}

