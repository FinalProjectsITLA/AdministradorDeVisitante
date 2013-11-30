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

	public void agregarVisitante(){
		
		Main.getVentanaPrincipal().getTxtIDvisitante().setEditable(false); // ID
		Main.getVentanaPrincipal().getBtnBuscadorIDvisitante().setEnabled(false); // Buscador
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setVisible(true); // Label Subtitulo
		Main.getVentanaPrincipal().getTxtNombreVisitante().setEditable(true); // TextField Nombre
		Main.getVentanaPrincipal().getTxtApellidoVisitante().setEditable(true); // TextField Apellido
		Main.getVentanaPrincipal().getTxtDireccionVisitante().setEditable(true); // TextField Direccion
		Main.getVentanaPrincipal().getTxtTelefonoVisitante().setEditable(true); // TextField Telefono
		Main.getVentanaPrincipal().getCbbSexoVisitante().setEnabled(true); // Combox Sexo
		Main.getVentanaPrincipal().getBtnGuardarVisitantes().setEnabled(true); // Boton Guarduar
		Main.getVentanaPrincipal().getBtnGuardarCambiosVisitante().setEnabled(false); // Boton Guardar cambios
		Main.getVentanaPrincipal().getBtnEliminarEditorVistante().setEnabled(false); // butnon Eliminar visitante
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setText("Agregar nuevo visitante"); // Subtitulo de la ventana Fijo
        Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); // Opciones del menu visitante
        Main.getVentanaPrincipal().getPnlEditorDeVisitante().setVisible(true);// Se concateno el nombre de la ventana Agregar Visitante visitante
     }
	
	public void modificarVisitante(){
		
		Main.getVentanaPrincipal().getTxtIDvisitante().setEditable(true); // ID
		Main.getVentanaPrincipal().getBtnBuscadorIDvisitante().setEnabled(true); // Buscador
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setVisible(true); // Label Subtitulo
		Main.getVentanaPrincipal().getTxtNombreVisitante().setEditable(true); // TextField Nombre
		Main.getVentanaPrincipal().getTxtApellidoVisitante().setEditable(true); // TextField Apellido
		Main.getVentanaPrincipal().getTxtDireccionVisitante().setEditable(true); // TextField Direccion
		Main.getVentanaPrincipal().getTxtTelefonoVisitante().setEditable(true); // TextField Telefono
		Main.getVentanaPrincipal().getCbbSexoVisitante().setEnabled(true); // Combox Sexo
		Main.getVentanaPrincipal().getBtnGuardarVisitantes().setEnabled(false); // Boton Guardar
		Main.getVentanaPrincipal().getBtnGuardarCambiosVisitante().setEnabled(true); // Boton guardar cambios
		Main.getVentanaPrincipal().getBtnEliminarEditorVistante().setEnabled(false); // Boton Eliminar visitante
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setText("Actualiar datos del visitante"); // Subtitulo de la ventana Fijo
        Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); // Opciones del menu visitante
        Main.getVentanaPrincipal().getPnlEditorDeVisitante().setVisible(true);// 
		
	}
	
	public void eliminarVisitante(){
		
		Main.getVentanaPrincipal().getTxtIDvisitante().setEditable(true); // ID
		Main.getVentanaPrincipal().getBtnBuscadorIDvisitante().setEnabled(true); // Buscador
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setVisible(true); // Subtitulo
		Main.getVentanaPrincipal().getTxtNombreVisitante().setEditable(false); // TextField Nombre
		Main.getVentanaPrincipal().getTxtApellidoVisitante().setEditable(false); // TextField Apellido
		Main.getVentanaPrincipal().getTxtDireccionVisitante().setEditable(false); // TextField Direccion
		Main.getVentanaPrincipal().getTxtTelefonoVisitante().setEditable(false); // TextField Telefono
		Main.getVentanaPrincipal().getCbbSexoVisitante().setEnabled(false); // Combox Sexo
		Main.getVentanaPrincipal().getBtnGuardarVisitantes().setEnabled(false); // Boton Guarduar
		Main.getVentanaPrincipal().getBtnGuardarCambiosVisitante().setEnabled(false); // Boton Guardar cambios
		Main.getVentanaPrincipal().getBtnEliminarEditorVistante().setEnabled(true); // butnon Eliminar visitante
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setText("Eliminar Visitante"); // Subtitulo de la ventana Fijo
        Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); // Opciones del menu visitante
        Main.getVentanaPrincipal().getPnlEditorDeVisitante().setVisible(true); // Panel de Visitante
	}
	
	public void guardarVisitantes(){
		
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setText("Guardar");
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(false); 
		//Main.getVentanaPrincipal().getPnlGuardarVisitante().setVisible(true);
	}
	
	public void eventosActuales(){
		
		Main.getVentanaPrincipal().getPnlOpcionesEventos().setVisible(false); // Jpanel Opciones de Evento
		Main.getVentanaPrincipal().getLblSubTituloEvento().setVisible(true); // Label Subtitulo
		Main.getVentanaPrincipal().getPnlEventosActuales().setVisible(true); // JPanel de Eventos Actuales
		Main.getVentanaPrincipal().getPnlDesplegarVisitantesEvento().setVisible(false); // JPanel Desplegar Visitante
		Main.getVentanaPrincipal().getPnlEditorEventos().setVisible(false); // JPanel Ingresar Evento
		Main.getVentanaPrincipal().getPnlProximosEventos().setVisible(false); // Jpanle Proximos eventos
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Eventos actuales"); // Label Subtitulos de Evento
	}
	
	public void proximosEventos(){
		
		Main.getVentanaPrincipal().getPnlOpcionesEventos().setVisible(false); // Jpanel Opciones de Evento
		Main.getVentanaPrincipal().getLblSubTituloEvento().setVisible(true); // Label Subtitulo
		Main.getVentanaPrincipal().getPnlEventosActuales().setVisible(false); // JPanel de Eventos Actuales
		Main.getVentanaPrincipal().getPnlDesplegarVisitantesEvento().setVisible(false); // JPanel Desplegar Visitante
		Main.getVentanaPrincipal().getPnlEditorEventos().setVisible(false); // JPanel Ingresar Evento
		Main.getVentanaPrincipal().getPnlProximosEventos().setVisible(true); // Jpanle Proximos eventos
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Proximos eventos"); // Label Subtitulos de Evento
	}
	
	public void agregarEvento(){
		
		Main.getVentanaPrincipal().getPnlOpcionesEventos().setVisible(false); // Jpanel Opciones de Evento
		Main.getVentanaPrincipal().getLblSubTituloEvento().setVisible(true); // Label Subtitulo
		Main.getVentanaPrincipal().getPnlEventosActuales().setVisible(false); // JPanel de Eventos Actuales
		Main.getVentanaPrincipal().getPnlDesplegarVisitantesEvento().setVisible(false); // JPanel Desplegar Visitante
		Main.getVentanaPrincipal().getPnlEditorEventos().setVisible(true); // JPanel Ingresar Evento
		Main.getVentanaPrincipal().getPnlProximosEventos().setVisible(false); // Jpanle Proximos eventos
		Main.getVentanaPrincipal().getBtnGuardarEvento().setEnabled(true); // Btn Guardar evento
		Main.getVentanaPrincipal().getBtnGuardarCambiosEvento().setEnabled(false); // Btn Guardar cambios de evento
		Main.getVentanaPrincipal().getBtnEliminarEvento().setEnabled(false); // Btb Eliminar Evento
		Main.getVentanaPrincipal().getBtnBuscarIDevento().setEnabled(false); // Btn Buscador de Evento
		Main.getVentanaPrincipal().getTxtIDevento().setEnabled(false); // TextField Buscador de Evento
		Main.getVentanaPrincipal().getTxtNombreEvento().setEditable(true); // TextField Nombre de evento
		Main.getVentanaPrincipal().getTxtUbicacionEvento().setEditable(true); // TextField Ubicacion del evento
		Main.getVentanaPrincipal().getTxtHoraEvento().setEnabled(true); // TextField Hora
		Main.getVentanaPrincipal().getCbbHoraEventos().setEnabled(true); // Combox hora
		Main.getVentanaPrincipal().getCalendario().setEnabled(true); // Calendario 
		Main.getVentanaPrincipal().getBtnFechaEvento().setEnabled(true); // Btn del calendario
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Agregar nuevo evento"); // Label Subtitulos de Evento
	}
	
	public void modificarEvento(){
		
		Main.getVentanaPrincipal().getPnlOpcionesEventos().setVisible(false); // Jpanel Opciones de Evento
		Main.getVentanaPrincipal().getLblSubTituloEvento().setVisible(true); // Label Subtitulo
		Main.getVentanaPrincipal().getPnlEventosActuales().setVisible(false); // JPanel de Eventos Actuales
		Main.getVentanaPrincipal().getPnlDesplegarVisitantesEvento().setVisible(false); // JPanel Desplegar Visitante
		Main.getVentanaPrincipal().getPnlEditorEventos().setVisible(true); // JPanel Ingresar Evento
		Main.getVentanaPrincipal().getPnlProximosEventos().setVisible(false); // Jpanle Proximos eventos
		Main.getVentanaPrincipal().getBtnGuardarEvento().setEnabled(false); // Btn Guardar evento
		Main.getVentanaPrincipal().getBtnGuardarCambiosEvento().setEnabled(true); // Btn Guardar cambios de evento
		Main.getVentanaPrincipal().getBtnEliminarEvento().setEnabled(false); // Btb Eliminar Evento
		Main.getVentanaPrincipal().getBtnBuscarIDevento().setEnabled(true); // Btn Buscador de Evento
		Main.getVentanaPrincipal().getTxtIDevento().setEnabled(true); // TextField Buscador de Evento
		Main.getVentanaPrincipal().getTxtNombreEvento().setEditable(true); // TextField Nombre de evento
		Main.getVentanaPrincipal().getTxtUbicacionEvento().setEditable(true); // TextField Ubicacion del evento
		Main.getVentanaPrincipal().getTxtHoraEvento().setEnabled(true); // TextField Hora
		Main.getVentanaPrincipal().getCbbHoraEventos().setEnabled(true); // Combox hora
		Main.getVentanaPrincipal().getCalendario().setEnabled(true); // Calendario 
		Main.getVentanaPrincipal().getBtnFechaEvento().setEnabled(true); // Btn del calendario
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Actualizar evento"); // Label Subtitulos de Evento
	}
	
	public void eliminarOpcionEvento(){
		
		Main.getVentanaPrincipal().getPnlOpcionesEventos().setVisible(false); // Jpanel Opciones de Evento
		Main.getVentanaPrincipal().getLblSubTituloEvento().setVisible(true); // Label Subtitulo
		Main.getVentanaPrincipal().getPnlEventosActuales().setVisible(false); // JPanel de Eventos Actuales
		Main.getVentanaPrincipal().getPnlDesplegarVisitantesEvento().setVisible(false); // JPanel Desplegar Visitante
		Main.getVentanaPrincipal().getPnlEditorEventos().setVisible(true); // JPanel Ingresar Evento
		Main.getVentanaPrincipal().getPnlProximosEventos().setVisible(false); // Jpanle Proximos eventos
		Main.getVentanaPrincipal().getBtnGuardarEvento().setEnabled(false); // Btn Guardar evento
		Main.getVentanaPrincipal().getBtnGuardarCambiosEvento().setEnabled(false); // Btn Guardar cambios de evento
		Main.getVentanaPrincipal().getBtnEliminarEvento().setEnabled(true); // Btb Eliminar Evento
		Main.getVentanaPrincipal().getBtnBuscarIDevento().setEnabled(true); // Btn Buscador de Evento
		Main.getVentanaPrincipal().getTxtIDevento().setEnabled(true); // TextField Buscador de Evento
		Main.getVentanaPrincipal().getTxtNombreEvento().setEditable(false); // TextField Nombre de evento
		Main.getVentanaPrincipal().getTxtUbicacionEvento().setEditable(false); // TextField Ubicacion del evento
		Main.getVentanaPrincipal().getTxtHoraEvento().setEnabled(false); // TextField Hora
		Main.getVentanaPrincipal().getCbbHoraEventos().setEnabled(false); // Combox hora
		Main.getVentanaPrincipal().getCalendario().setEnabled(false); // Calendario 
		Main.getVentanaPrincipal().getBtnFechaEvento().setEnabled(false); // Btn del calendario
		Main.getVentanaPrincipal().getLblSubTituloEvento().setText("Eliminar evento"); // Label Subtitulos de Evento
	}
	
	public void GuardarEventos(){
		
		
	}

	public void agregarUsuario(){
		
		Main.getVentanaPrincipal().getPnlOpcionUsuario().setVisible(false); // Pnl de opciones
		Main.getVentanaPrincipal().getPnlEditorUsuario().setVisible(true); // Pnl editor de usuario
		Main.getVentanaPrincipal().getTxtIDusuario().setEditable(false); // Txt ID usuario
		Main.getVentanaPrincipal().getBtnBuscarUsuario().setEnabled(false); // Btn Buscador de usuario
		Main.getVentanaPrincipal().getTxtNombreUsuario().setEditable(true); // txt Nombre de usuario
		Main.getVentanaPrincipal().getTxtApellidoUsuario().setEditable(true); // txt apellido de usuario
		Main.getVentanaPrincipal().getTxtUsuarioUsuario().setEditable(true); // txt usuario de usuario
		Main.getVentanaPrincipal().getTxtClaveUsuario().setEditable(true); // txt clave de usuario
		Main.getVentanaPrincipal().getCmxPerfil().setEnabled(true); // Combox de usuario
		Main.getVentanaPrincipal().getLblSubtituloUsuarios().setVisible(true); // Label Subtitulo usuario
		Main.getVentanaPrincipal().getBtnGuardarUsuario().setEnabled(true); // Btn de guardar usuario
		Main.getVentanaPrincipal().getBtnGuardarCambiosUsuario().setEnabled(false); // Btn Guardar cambios usaurio
		Main.getVentanaPrincipal().getBtnEliminarUsuario().setEnabled(false); // Btn Eliminar usuario
		Main.getVentanaPrincipal().getLblSubtituloUsuarios().setText("Nuevo Usuario"); // Label subtitulo
	}
	
	public void modificarUsuario(){
		
		Main.getVentanaPrincipal().getPnlOpcionUsuario().setVisible(false); // Pnl de opciones
		Main.getVentanaPrincipal().getPnlEditorUsuario().setVisible(true); // Pnl editor de usuario
		Main.getVentanaPrincipal().getTxtIDusuario().setEditable(true); // Txt ID usuario
		Main.getVentanaPrincipal().getBtnBuscarUsuario().setEnabled(true); // Btn Buscador de usuario
		Main.getVentanaPrincipal().getTxtNombreUsuario().setEditable(true); // txt Nombre de usuario
		Main.getVentanaPrincipal().getTxtApellidoUsuario().setEditable(true); // txt apellido de usuario
		Main.getVentanaPrincipal().getTxtUsuarioUsuario().setEditable(true); // txt usuario de usuario
		Main.getVentanaPrincipal().getTxtClaveUsuario().setEditable(true); // txt clave de usuario
		Main.getVentanaPrincipal().getCmxPerfil().setEnabled(true); // Combox de usuario
		Main.getVentanaPrincipal().getLblSubtituloUsuarios().setVisible(true); // Label Subtitulo usuario
		Main.getVentanaPrincipal().getBtnGuardarUsuario().setEnabled(false); // Btn de guardar usuario
		Main.getVentanaPrincipal().getBtnGuardarCambiosUsuario().setEnabled(true); // Btn Guardar cambios usaurio
		Main.getVentanaPrincipal().getBtnEliminarUsuario().setEnabled(false); // Btn Eliminar usuario
		Main.getVentanaPrincipal().getLblSubtituloUsuarios().setText("Modifar Usuario"); // Label subtitulo
	}
	
	public void eliminarUsuario(){
		
		Main.getVentanaPrincipal().getPnlOpcionUsuario().setVisible(false); // Pnl de opciones
		Main.getVentanaPrincipal().getPnlEditorUsuario().setVisible(true); // Pnl editor de usuario
		Main.getVentanaPrincipal().getTxtIDusuario().setEditable(true); // Txt ID usuario
		Main.getVentanaPrincipal().getBtnBuscarUsuario().setEnabled(true); // Btn Buscador de usuario
		Main.getVentanaPrincipal().getTxtNombreUsuario().setEditable(false); // txt Nombre de usuario
		Main.getVentanaPrincipal().getTxtApellidoUsuario().setEditable(false); // txt apellido de usuario
		Main.getVentanaPrincipal().getTxtUsuarioUsuario().setEditable(false); // txt usuario de usuario
		Main.getVentanaPrincipal().getTxtClaveUsuario().setEditable(false); // txt clave de usuario
		Main.getVentanaPrincipal().getCmxPerfil().setEnabled(false); // Combox de usuario
		Main.getVentanaPrincipal().getLblSubtituloUsuarios().setVisible(true); // Label Subtitulo usuario
		Main.getVentanaPrincipal().getBtnGuardarUsuario().setEnabled(false); // Btn de guardar usuario
		Main.getVentanaPrincipal().getBtnGuardarCambiosUsuario().setEnabled(false); // Btn Guardar cambios usaurio
		Main.getVentanaPrincipal().getBtnEliminarUsuario().setEnabled(true); // Btn Eliminar usuario
		Main.getVentanaPrincipal().getLblSubtituloUsuarios().setText("Eliminar Usuario"); // Label subtitulo
		
	}
	
	public void menuVisitante(){
		
		Main.getVentanaPrincipal().getTxtNombreVisitante().setText("");
		Main.getVentanaPrincipal().getTxtApellidoVisitante().setText("");
		Main.getVentanaPrincipal().getTxtTelefonoVisitante().setText("");
		Main.getVentanaPrincipal().getTxtDireccionVisitante().setText("");
		Main.getVentanaPrincipal().getTxtIDvisitante().setText("");
		Main.getVentanaPrincipal().getCbbSexoVisitante().setSelectedIndex(0);
		Main.getVentanaPrincipal().getLblSubTitutoVisitante().setVisible(false);
		Main.getVentanaPrincipal().getPnlEditorDeVisitante().setVisible(false);
		Main.getVentanaPrincipal().getPnlOpcionesVisitantes().setVisible(true);
	}
	
	public void menuEvento(){
		
		Main.getVentanaPrincipal().getPnlOpcionesEventos().setVisible(true); // Jpanel Opciones de Evento
		Main.getVentanaPrincipal().getLblSubTituloEvento().setVisible(false); // Label Subtitulo
		Main.getVentanaPrincipal().getPnlEventosActuales().setVisible(false); // JPanel de Eventos Actuales
		Main.getVentanaPrincipal().getPnlDesplegarVisitantesEvento().setVisible(false); // JPanel Desplegar Visitante
		Main.getVentanaPrincipal().getPnlProximosEventos().setVisible(false); // Jpanle Proximos eventos
		Main.getVentanaPrincipal().getPnlEditorEventos().setVisible(false); // JPanel Ingresar Evento
		
		Main.getVentanaPrincipal().getTxtIDevento().setText(""); // TextField Buscador de Evento
		Main.getVentanaPrincipal().getTxtNombreEvento().setText(""); // TextField Nombre de evento
		Main.getVentanaPrincipal().getTxtUbicacionEvento().setText("");  // TextField Ubicacion del evento
		Main.getVentanaPrincipal().getTxtHoraEvento().setText("");  // TextField Hora
		Main.getVentanaPrincipal().getCbbHoraEventos().setSelectedIndex(0); // Combox hora
	}
	
	public void menuUsuario(){
		
		Main.getVentanaPrincipal().getPnlOpcionUsuario().setVisible(true); // Pnl de opciones
		Main.getVentanaPrincipal().getPnlEditorUsuario().setVisible(false); // Pnl editor de usuario
		Main.getVentanaPrincipal().getLblSubtituloUsuarios().setVisible(false); // Label Subtitulo usuario
		Main.getVentanaPrincipal().getTxtIDusuario().setText(""); // Txt ID usuario
		Main.getVentanaPrincipal().getTxtNombreUsuario().setText(""); // txt Nombre de usuario
		Main.getVentanaPrincipal().getTxtApellidoUsuario().setText(""); // txt apellido de usuario
		Main.getVentanaPrincipal().getTxtUsuarioUsuario().setText(""); // txt usuario de usuario
		Main.getVentanaPrincipal().getTxtClaveUsuario().setText(""); // txt clave de usuario
		Main.getVentanaPrincipal().getCmxPerfil().setSelectedIndex(0); // Combox de usuario
		
	}
}