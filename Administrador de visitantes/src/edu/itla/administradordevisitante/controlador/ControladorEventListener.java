package edu.itla.administradordevisitante.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEventListener implements ActionListener{
	
	AccionDeBoton boton = new AccionDeBoton();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("LoginUsuario")){
			boton.login();
			
		}
		if(e.getActionCommand().equals("Salir")){
			boton.salir();
		}
		
		if(e.getActionCommand().equals("AgregarVisitante")){
			boton.agregarVisitante(); 
		}
		if(e.getActionCommand().equals("ModificarVisitante")){
			boton.modificarVisitante();
		}
		
		if(e.getActionCommand().equals("EliminarVisitante")){
			boton.eliminarVisitante();
		}
		
		if(e.getActionCommand().equals("GuardarVisitanes")){
			//boton.eliminarVisitante();
		}
		
		if(e.getActionCommand().equals("RegresarMenuVisitante")){
			boton.menuVisitante();
		}
		
		if(e.getActionCommand().equals("EventosActuales")){
			boton.eventosActuales();
		}
		
		if(e.getActionCommand().equals("ProximosEventos")){
			boton.proximosEventos();
		}
		if(e.getActionCommand().equals("AgregarEvento")){
			boton.agregarEvento();
		}
		if(e.getActionCommand().equals("ModicarEvento")){
			boton.modificarEvento();
		}
		if(e.getActionCommand().equals("EliminarOpcionEvento")){
			boton.eliminarOpcionEvento();
		}
		if(e.getActionCommand().equals("RegresarMenuEventos")){
			boton.menuEvento();
		}
		if(e.getActionCommand().equals("GuardarEventos")){
			
		}
		if(e.getActionCommand().equals("EliminarOpcionUsuario")){
			boton.eliminarUsuario();
		}
		if(e.getActionCommand().equals("ModificarUsuario")){
			boton.modificarUsuario();
		}
		
		if(e.getActionCommand().equals("AgregarUsuario")){
			boton.agregarUsuario();
		}
		if(e.getActionCommand().equals("RegresarUsuario")){
			boton.menuUsuario();
		}
		if(e.getActionCommand().equals("RegresarInvitaciones")){
			boton.menuInvitaciones();
		}
		if(e.getActionCommand().equals("CrearInvitaciones")){
			boton.crearInvitacion();
		}
		if(e.getActionCommand().equals("ModificarInvitaciones")){
			boton.modificarInvitacion();
		}
		if(e.getActionCommand().equals("EliminarOpcionInvitaciones")){
			boton.EliminarOpcionInvitacion();
		}
	}
}
