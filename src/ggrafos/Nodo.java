package ggrafos;

public class Nodo {
    int dato;
    ListaAdy lista;
    Nodo siguiente;
    
    public Nodo(int x){
    dato = x;
    lista = new ListaAdy();
    siguiente = null;
    }
}
