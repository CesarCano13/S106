package n1exercici1;

public class Main {

	public static void main(String[] args) {
		//Asiganmos el valor del array a través del constructor
		NoGenericMethods archivos = new NoGenericMethods(3);
		
		archivos.add("César");
		archivos.add("Ikki");
		archivos.add("Ana");
		//Obtenemos el nombre y lo casteamos
		String nombre = (String) archivos.get(2);
		System.out.println(nombre);

	}

}
