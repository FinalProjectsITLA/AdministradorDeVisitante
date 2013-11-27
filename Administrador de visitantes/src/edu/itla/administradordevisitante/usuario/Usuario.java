package edu.itla.administradordevisitante.usuario;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private String nombreDeUsuario;
	private String perfil;
	@SuppressWarnings("unused")
	private String clave;
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	public String getPerfil() {
		return perfil;
	}

}
