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
		
		if(e.getActionCommand().equals("AgregarVisitante")){ // Comprueba que boton es.
			boton.AgregarVisitante(); //Se ejecuta la accion del boton
		}
		if(e.getActionCommand().equals("ModificarVisitante")){
			boton.ModificarVisitante();
		}
		
		if(e.getActionCommand().equals("EliminarVisitante")){
			boton.EliminarVisitante();
		}
		
		if(e.getActionCommand().equals("GuardarVisitanes")){
			boton.EliminarVisitante();
		}
		
		if(e.getActionCommand().equals("EventosActuales")){
			boton.EventosActuales();
		}
		
		if(e.getActionCommand().equals("PróximosEventos")){
			boton.ProximosEventos();
		}
		
		if(e.getActionCommand().equals("IngresarEvento")){
			boton.IngresarEvento();
		}
		
		if(e.getActionCommand().equals("RegresarEventos")){
			boton.RegresarEventos();
		}
		
		if(e.getActionCommand().equals("GuardarEventos")){
			boton.GuardarEventos();
		}
		
		if(e.getActionCommand().equals("EliminarUsuario")){
			boton.EliminarUsuario();
		}
		
		if(e.getActionCommand().equals("ModificarUsuario")){
			boton.ModificarUsuario();
		}
		
		if(e.getActionCommand().equals("Agregarusuario")){
			boton.AgregarUsuario();
		}
		
		if(e.getActionCommand().equals("CrearUsuario")){
			boton.CrearUsuario();
		}
	}
}
