package Listas;

public class Lista {
private Nodo cabeza;

public Lista(){
	cabeza=null;
}

public void Agregar(int cantidad, String tipo){
	Nodo nodo1= new Nodo(cantidad, tipo);
	if (getCabeza()==null){
		setCabeza(nodo1);
	}else{
		Nodo nuevo=cabeza;
		while(nuevo.getSiguiente()!=null){
			nuevo=nuevo.getSiguiente();
			
		}
		nuevo.setSiguiente(nodo1);
		nodo1.setSiguiente(new Nodo(0,"4"));
		
	}
		
}

public void Agregar(int posicion){

}

public void EliminarInicial(){
	
}

public void EliminarFinal(){
	
}

//eliminar posición
public void Eliminar(){
	Nodo tmp=cabeza;
	Nodo nuevo=cabeza;
	if (tmp!=null){
		tmp.setSiguiente(nuevo.getSiguiente().getSiguiente());		
	}else{
		System.out.println("No hay vagones");
	}	
}
//elimina los elementos de la lista
public void eliminar(){
cabeza = null;
}

public void Imprimir(){
	Nodo imprimir;
	for(imprimir=getCabeza(); imprimir != null; imprimir=imprimir.getSiguiente()){
		System.out.println("Cantidad " + imprimir.getCantidad()+ " tipo " + imprimir.getTipo());
	}
}

//regresa el total de elementos de la lista
public int Tamano(){
	Nodo imprimir;
	int dartamano=0;
	
	for(imprimir=getCabeza(); imprimir != null; imprimir=imprimir.getSiguiente()){
		dartamano++;
		
	}	return dartamano;
	
}

private Nodo getCabeza() {
	return cabeza;
}

private void setCabeza(Nodo cabeza) {
	this.cabeza = cabeza;
}

}
