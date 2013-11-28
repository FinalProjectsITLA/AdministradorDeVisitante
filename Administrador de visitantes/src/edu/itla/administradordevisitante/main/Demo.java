package edu.itla.administradordevisitante.main;

public class Demo {
	/*
	public enum UserStatus {
		PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D");
	 
		private String statusCode;
	 
		private UserStatus(String s) {
			statusCode = s;
		}
	 
		public String getStatusCode() {
			return statusCode;
		}
	 
	}
	
	enum roll {
		Administrador, Portero
	}*/
	
	public static void main(String[] args) {
		
		String a = "Hol";
		
		if(a.matches("([a-zA-Z]+[0-9]*)")){
			System.out.println("BN");
		}else{
			System.out.println("--");
		}
	}

}
