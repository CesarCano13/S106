package n1exercici2;

public class Main {

	public static void main(String[] args) {

		// Creamos el objeto persona
		Persona persona1 = new Persona("César", "Cano", 27);

		// Creamos el objeto que va a recibir persona, un String y un int, para pasarlo
		// a la clase GenericMethods como parámetro
		GenericMethods generic = new GenericMethods();
		generic.mostrar(persona1, "Mollete con jamón", 69);

	}

}
