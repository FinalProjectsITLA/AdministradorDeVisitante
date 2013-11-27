package edu.itla.administradordevisitante.evento;

public class Evento {
	
	private String nombre;
	private String fecha;
	private String ubicacion;
	
	public Evento(String nombre, String fecha, String ubicacion) {

		this.nombre = nombre;
		this.fecha = fecha;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public String getUbicacion() {
		return ubicacion;
	}

}
