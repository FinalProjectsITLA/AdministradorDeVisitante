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
	
	public void ModificarVisitante(){
		
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setText("Modificar visitante"); 
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		//Main.getVentanaPrincipal().getPnlModificarVisitante().setVisible(true);
		
	}
	
	public void EliminarVisitante(){
		
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setText("Eliminar visitante");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		//Main.getVentanaPrincipal().getPnlEliminarVisitante().setVisible(true);
	}
	
	public void GuardarVisitantes(){
		
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setText("Guardar");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		//Main.getVentanaPrincipal().getPnlGuardarVisitante().setVisible(true);
	}
	
	public void EventosActuales(){
		
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Eventos Actuales");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		Main.getVentanaPrincipal().getPnlEventos().setVisible(true);
	}
	
	public void ProximosEventos(){
		
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Proximos Eventos");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		Main.getVentanaPrincipal().getPnlEventos().setVisible(true);
	}
	
	public void IngresarEvento(){
		
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Ingresar Evento");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false);
		Main.getVentanaPrincipal().getPnlOpcionesEventos().setVisible(false);
		Main.getVentanaPrincipal().getPnlEventos().setVisible(true);
		Main.getVentanaPrincipal().getPnlIngresarEventos().setVisible(true);
	}
	
	public void RegresarEventos(){
		
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Regresar");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		Main.getVentanaPrincipal().getPnlEventos().setVisible(true);
	}
	
	public void GuardarEventos(){
		
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Guardar");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		Main.getVentanaPrincipal().getPnlEventos().setVisible(true);
	}
	
	public void EliminarUsuario(){
		
		//Main.getVentanaPrincipal().getLblUsuario().setText("Eliminar");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		//Main.getVentanaPrincipal().getPnlEliminarUsuario().setVisible(true);
	}
	
	public void ModificarUsuario(){
		
		//Main.getVentanaPrincipal().getLblUsuario().setText("Modificar");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		//Main.getVentanaPrincipal().getPnlModificarUsuario().setVisible(true);
	}
	
	public void AgregarUsuario(){
		
		//Main.getVentanaPrincipal().getLblUsuario().setText("Agregar");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		//Main.getVentanaPrincipal().getPnlAgregarUsuario().setVisible(true);
		
	}
	
	public void CrearUsuario(){
		
		//Main.getVentanaPrincipal().getLblUsuario().setText("Crear");
		  Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		  //Main.getVentanaPrincipal().getPnlCrearUsuario().setVisible(true);
	}
}