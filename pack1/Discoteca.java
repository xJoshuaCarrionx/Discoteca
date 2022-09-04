package pack1;

import java.util.Scanner; 

public class Discoteca {
	
	public static void main (String [] args) { 
	
	String resultado1;
	int resultado2;
	String Genero;
	Scanner Lector = new Scanner(System.in);
	
	
	resultado2 = 18;
		
	{
	System.out.println("Favor ingrese su genero (Masculino o Femenino)");
	resultado1 = Lector.next();
    System.out.println("------------------------------------");
    }
	
	
	{
	System.out.println("Ingrese su edad");
	resultado2 = Lector.nextInt();
	System.out.println("------------------------------------");
	}
	
	
	System.out.println("Sus datos son:");
	System.out.println("Su genero es:" + resultado1);
	System.out.println("Su edad es: " + resultado2);
	
	
	if(resultado2 >= 18){
	System.out.println("Usted puede entrar. BIENVENIDO!!!");
	}else {	
		System.out.println("Usted no puede entrar. VAYA A ESTUDIAR!!!!!");
	}
	
	}	

    }