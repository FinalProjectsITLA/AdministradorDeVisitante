package edu.itla.administradordevisitante.controlador;

import edu.itla.administradordevisitante.usuario.PerfilUsuario;
import edu.itla.administradordevisitante.main.Main;

public class ControladorDeVentana {
	
	//PerfilUsuario perfil = new PerfilUsuario(); // perfil para obtener el tipo roll almacenado en sistema
	static boolean  ventanaPrincipal = false;
	static boolean ventanaLogin = true;
	
	public void acceso(String perfil){
            
        if(perfil.equals("Administrador")){
        	// Ventana de login
        	Main.getLoggin().setVisible(false);
        	Main.getVentanaPrincipal().getTabbedPane().setEnabledAt(3, true); // Abilitar pestaña de usuario
        	//Evento
        	Main.getVentanaPrincipal().getBtnIngresarEvento().setVisible(true);
        	//Visitante
			Main.getVentanaPrincipal().getBtnEliminarVisitante().setVisible(true);
			Main.getVentanaPrincipal().getBtnModificarVisitante().setVisible(true);
			// Ventana principal
			Main.getVentanaPrincipal().setVisible(true);
		}
		if(perfil.equals("Portero")){
			// Ventana de login
			Main.getLoggin().setVisible(false);
			Main.getVentanaPrincipal().getTabbedPane().setEnabledAt(3, false); // Desabilitar Pestaña de usuario
			//Evento
			Main.getVentanaPrincipal().getBtnIngresarEvento().setVisible(false);
			//Visitante
			Main.getVentanaPrincipal().getBtnEliminarVisitante().setVisible(false);
			Main.getVentanaPrincipal().getBtnModificarVisitante().setVisible(false);
			// Ventana Principal
			Main.getVentanaPrincipal().setVisible(true);
		}
	}

	public static boolean isVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public static boolean isVentanaLogin() {
		return ventanaLogin;
	}

	public static void setVentanaPrincipal(boolean ventanaPrincipal) {
		ControladorDeVentana.ventanaPrincipal = ventanaPrincipal;
	}

	public static void setVentanaLogin(boolean ventanaLogin) {
		ControladorDeVentana.ventanaLogin = ventanaLogin;
	}
	
}
