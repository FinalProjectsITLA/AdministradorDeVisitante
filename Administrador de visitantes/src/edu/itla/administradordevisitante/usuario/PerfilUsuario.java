package edu.itla.administradordevisitante.usuario;

import edu.itla.administradordevisitante.controlador.ControladorDeVentana;

public class PerfilUsuario extends Usuario{
	
	private static String perfil; // Almacenar tipo de perfil
	enum roll  { // Tipos de perfil
			Administrador, Portero
	};
	
	public String permisoDeUsuario(String perfil) {
		
		for(Object verificar : roll.values()){
			if(verificar.toString().equals(perfil)){
				PerfilUsuario.perfil = perfil;
			}
		}
		return perfil;
	}
	
	
	public String getPerfil() {
		return perfil;
	}


	public static void setPerfil(String perfil) {
		PerfilUsuario.perfil = perfil;
	}
	
}