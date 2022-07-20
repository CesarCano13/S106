package n1exercici1;

public class NoGenericMethods {

	private int i = 0;
	private Object[]datosElemento;

	public NoGenericMethods(int e) {
		datosElemento = new Object[e];
	}
	
	public Object get(int i) {
		return datosElemento[i];
	}
	
	public void add(Object o) {
		datosElemento[i] = o;
		i++;
	}

	

}
