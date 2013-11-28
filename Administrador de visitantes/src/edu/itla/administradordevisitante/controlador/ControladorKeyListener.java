package edu.itla.administradordevisitante.controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import edu.itla.administradordevisitante.main.Main;

public class ControladorKeyListener implements KeyListener{
	
	AccionDeBoton boton = new AccionDeBoton();
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		char c = e.getKeyChar();
		if(e.getSource() == Main.getLoggin().getTxtNombreUsuario()){
			if(c == KeyEvent.VK_ENTER){
				Main.getLoggin().getTxtClaveUsuario().requestFocus();
			}
			if(c == KeyEvent.VK_ESCAPE){
				System.exit(0);
			}
		}
		
		if(e.getSource() == Main.getLoggin().getTxtClaveUsuario()){
			if(c == KeyEvent.VK_ENTER){
				boton.login();
			}
			if(c == KeyEvent.VK_ESCAPE){
				System.exit(0);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
