package edu.itla.administradordevisitante.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import edu.itla.administradordevisitante.controlador.ControladorDeVentana;
import edu.itla.administradordevisitante.ventana.Login;
import edu.itla.administradordevisitante.ventana.VentanaPrincipal;

public class Main {
	
	private static VentanaPrincipal ventanaPrincipal;
	private static Login loggin;
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
		loggin = new Login();
		
		loggin.setVisible(ventana.isVentanaLogin());
		ventanaPrincipal.setVisible(ventana.isVentanaPrincipal());
		
	}

	public static VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public Login getLoggin() {
		return loggin;
	}
	
}
