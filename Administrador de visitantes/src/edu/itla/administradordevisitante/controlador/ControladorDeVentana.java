package edu.itla.administradordevisitante.controlador;

import edu.itla.administradordevisitante.usuario.PerfilUsuario;

public class ControladorDeVentana {
	
	PerfilUsuario perfil; // perfil para obtener el tipo roll almacenado en sistema
	boolean ventanaPrincipal = true;
	boolean ventanaLogin = false;
	
	public ControladorDeVentana() {
		
		perfil = new PerfilUsuario();
		permiso(perfil.permisoDeUsuario());
	}
	
	public void permiso(String permiso){
		
		// Habilitando las visitas determinadas
		if(permiso.equals(perfil.getRoll()[0])){
			// Acceso a todo
			
		}
		if(permiso.equals(perfil.getRoll()[1])){
			//Desabilitar Mantenimiento
			
		}
	}

	public boolean isVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public boolean isVentanaLogin() {
		return ventanaLogin;
	}

	public void setVentanaPrincipal(boolean ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public void setVentanaLogin(boolean ventanaLogin) {
		this.ventanaLogin = ventanaLogin;
	}
	
}
