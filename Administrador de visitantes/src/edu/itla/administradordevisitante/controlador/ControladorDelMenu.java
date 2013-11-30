package edu.itla.administradordevisitante.controlador;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ControladorDelMenu implements ChangeListener{
	
	JTabbedPane menu;
	AccionDeBoton subMenu;
	@Override
	public void stateChanged(ChangeEvent e) {
		
		menu = (JTabbedPane) e.getSource();
		subMenu = new AccionDeBoton();
		
		int seleccionado = menu.getSelectedIndex();
		
		if(seleccionado == 0){
			
		}
		if(seleccionado == 1){
			subMenu.menuVisitante();
		}
		if(seleccionado == 2){
			subMenu.menuEvento();
		}
		if(seleccionado == 3){
			subMenu.menuUsuario();
		}
		if(seleccionado == 4){
			subMenu.menuInvitaciones();
		}
	}

}
