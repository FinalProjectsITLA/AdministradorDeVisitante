package edu.itla.administradordevisitante.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import edu.itla.administradordevisitante.controlador.ControladorDeVentana;
import edu.itla.administradordevisitante.ventana.Login;
import edu.itla.administradordevisitante.ventana.VentanaPrincipal;

public class Main {
	
	private static VentanaPrincipal ventanaPrincipal;
	private static Login login;
	private static ControladorDeVentana ventana;
	
	public static void main(String[] args){
		
		ventana = new ControladorDeVentana();
		com.jtattoo.plaf.aluminium.AluminiumLookAndFeel.setTheme("");
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ventanaPrincipal = new VentanaPrincipal();
		login = new Login();
		
		ventanaPrincipal.setVisible(ventana.isVentanaPrincipal());
		login.setVisible(ventana.isVentanaLogin());
		login.getTxtNombreUsuario().requestFocus();
	}

	public static VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public static Login getLoggin() {
		return login;
	}
	
}
