package n1exercici2;

public class Persona {

	private String nom;
	private String apell;
	private int edad;

	public Persona(String nom, String apell, int edad) {
		this.nom = nom;
		this.apell = apell;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona " + nom + " " + apell + " y tiene " + edad + " años";
	}

}
