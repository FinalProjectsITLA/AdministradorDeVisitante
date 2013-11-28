package edu.itla.administradordevisitante.controlador;

import javax.swing.JOptionPane;

import edu.itla.administradordevisitante.basededato.ConexionAbaseDeDato;
import edu.itla.administradordevisitante.main.Main;
import edu.itla.administradordevisitante.usuario.PerfilUsuario;

public class AccionDeBoton {
	
	ConexionAbaseDeDato baseDeDato = ConexionAbaseDeDato.getInstance();
	PerfilUsuario perfil = new PerfilUsuario();
	ControladorDeVentana ventana = new ControladorDeVentana();
	
	public void salir(){
		System.exit(0);
	}
	
	public void AgregarVisitante(){
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setText("Agregar nuevo visitante"); // Subtitulo de la ventana Fijo
        Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); // Se concateno el nombre de la ventana Opciones visitante
        Main.getVentanaPrincipal().getPnlAgregarVisitante().setVisible(true);// Se concateno el nombre de la ventana Agregar Visitante visitante
     }
	
	public void login(){
		
		
		String usuario = Main.getLoggin().getTxtNombreUsuario().getText(); // Usuario de la ventana login
		String clave = Main.getLoggin().getTxtClaveUsuario().getText(); // Clave de la ventana login
		
		if(usuario.matches("([a-zA-Z]+[0-9]*)") && clave.length() > 5){
			int estado = baseDeDato.login(usuario, clave); // Comprobar si son correcto los datos del login
			String perfil = this.perfil.permisoDeUsuario(baseDeDato.getPerfil());
			
			switch(estado){
				case 0:
					ventana.acceso(perfil);
					Main.getVentanaPrincipal().getLblSustituloBienvenida().setText(baseDeDato.getNombreUsuario());
					break;
				case 1:
					JOptionPane.showMessageDialog(Main.getLoggin().getContentPane(), "Usuario Incorrecto.");
					Main.getLoggin().getTxtNombreUsuario().setText("");
					Main.getLoggin().getTxtClaveUsuario().setText(""); 
					Main.getLoggin().getTxtNombreUsuario().requestFocus();
					break;
				case 2:
					JOptionPane.showMessageDialog(Main.getLoggin().getContentPane(), "La clave es incorreta.");
					Main.getLoggin().getTxtClaveUsuario().setText(""); 
					Main.getLoggin().getTxtClaveUsuario().requestFocus();
					break;
				case 3:
					JOptionPane.showMessageDialog(Main.getLoggin().getContentPane(), "El usurio no existe.");
					Main.getLoggin().getTxtNombreUsuario().setText("");
					Main.getLoggin().getTxtClaveUsuario().setText(""); 
					Main.getLoggin().getTxtNombreUsuario().requestFocus();
					break;
			}
		}else if(!usuario.matches("([a-zA-Z]+[0-9]*)") && clave.length() > 5){
			JOptionPane.showMessageDialog(Main.getLoggin().getContentPane(), "Asegurese de que el nombre de usuario este correto. Ej. Usuario999 o Ej. Usuario");
			Main.getLoggin().getTxtNombreUsuario().requestFocus();
		}else if(usuario.matches("([a-zA-Z]+[0-9]*)") && clave.length() <= 5){
			JOptionPane.showMessageDialog(Main.getLoggin().getContentPane(), "La contra\u00f1a debe de ser de 6 caracteres minimo.");
			Main.getLoggin().getTxtClaveUsuario().requestFocus();
		}else if(!usuario.matches("([a-zA-Z]+[0-9]*)") && clave.length() <= 5){
			JOptionPane.showMessageDialog(Main.getLoggin().getContentPane(), "Debe de llenar los campos correctamente.");
			Main.getLoggin().getTxtNombreUsuario().requestFocus();
		}
		
	}
}