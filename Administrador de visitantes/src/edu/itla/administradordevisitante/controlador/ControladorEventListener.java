package edu.itla.administradordevisitante.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEventListener implements ActionListener{
	
	AccionDeBoton boton = new AccionDeBoton();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Salir")){
			boton.salir();
		}
		
		if(e.getActionCommand().equals("AgregarVisitante")){ // Comprueba que boton es.
			boton.AgregarVisitante(); //Se ejecuta la accion del boton
		}
		
	}

}
