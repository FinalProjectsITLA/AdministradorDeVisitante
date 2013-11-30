package edu.itla.administradordevisitante.basededato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class ConexionAbaseDeDato {
	
	private static ConexionAbaseDeDato instance;
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
	private String usuarioUsuario = "Demo";
	private String claveUsuario = "123456";
	private String perfil;
	private String sexoUsuario;
	
	enum estadoDelLogin{
		CORRECTO(0), USUARIO(1), CLAVE(2), NOeXISTE(3);
		
		private int codigo;
		
		private estadoDelLogin(int c){
			codigo = c;
		}
		
		private int getEstadoDelLogin(){
			return codigo;
		}
	}
	private ConexionAbaseDeDato(){
		
	}
	
	public static ConexionAbaseDeDato getInstance(){
		
		if (instance == null){
			instance = new ConexionAbaseDeDato();
		}
		
		return instance;
	}
	
	public Connection getConexion(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/administradorvisitantes?user=root&password=edc598094785");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conexion;
	}
	public int login(String usuario, String clave){
		
		int estado = 0;
		if(usuarioUsuario.equals(usuario) && claveUsuario.equals(clave)){
			perfil = "Administrador";
			//perfil = "Portero";
			nombreUsuario = "Proyecto Final";
			estado = estadoDelLogin.CORRECTO.getEstadoDelLogin();
		}
		if(!usuarioUsuario.equals(usuario) && claveUsuario.equals(clave)){
			estado = estadoDelLogin.USUARIO.getEstadoDelLogin();
		}
		if(usuarioUsuario.equals(usuario) && !claveUsuario.equals(clave)){
			estado = estadoDelLogin.CLAVE.getEstadoDelLogin();
		}
		if(!usuarioUsuario.equals(usuario) && !claveUsuario.equals(clave)){
			estado = estadoDelLogin.NOeXISTE.getEstadoDelLogin();
		}
		return estado;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getUsuarioUsuario() {
		return usuarioUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public void setUsuarioUsuario(String usuarioUsuario) {
		this.usuarioUsuario = usuarioUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
}

