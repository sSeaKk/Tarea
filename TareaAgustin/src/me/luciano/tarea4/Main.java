package me.luciano.tarea4;

public class Main {
	private static Programa programa;
	
	public static void main(String[] args) {
		programa = new Programa();
		new Ventana();
	}
	
	public static Programa getPrograma() {
		return programa;
	}
}