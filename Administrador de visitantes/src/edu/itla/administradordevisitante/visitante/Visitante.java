package edu.itla.administradordevisitante.visitante;

public class Visitante {
	
	private String nombre;
	private String apellido;
	private String sexo;
	private String telefono;
	private String direccion;
	
	public Visitante(String nombre, String apellido, String sexo,
			String telefono, String direccion) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}
	
}
