package com.krakedev.sobrecarga;

import com.krakedev.herencia.Persona;

public class Bienvenida {
	public void saludar (String nombre) {
		System.out.println("Hola" + nombre);
	};
	
	public void saludar (String nombre,String apellido) {
		System.out.println("Hola" + nombre + " " + apellido);
	};

}
