package com.krakedev.herencia;

public class Perro extends Animal {
	
	
	
	
	public void ladrar() {
		System.out.println("Perro Ladrando");
	}

	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Perro Durmiendo");
	}
	
	
}
