package Listas;

public class Nodo {
private int cantidad;
private String tipo;
private Nodo siguiente;
public Nodo(int cantidad, String tipo){
	this.setCantidad(cantidad);
	this.setTipo(tipo);
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public Nodo getSiguiente() {
	return siguiente;
}

public void setSiguiente(Nodo siguiente) {
	this.siguiente = siguiente;
}

}
