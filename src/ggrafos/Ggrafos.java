package ggrafos;


public class Ggrafos {
    static grafo grafo = new grafo();
    static grafo grafo2 = new grafo();
    static grafo grafo3 = new grafo();
    static grafo grafo4 = new grafo();
    static grafo grafo5 = new grafo();

    public static void main(String[] args) {
       //----------UNO-----------------
        grafo.nuevoNodo(1);
        grafo.nuevoNodo(2);
        grafo.nuevoNodo(3);
        grafo.nuevoNodo(4);
        origenDestino(1, 1);
        origenDestino(1, 4);
        origenDestino(1, 2);
        origenDestino(2, 1);
        origenDestino(2, 3);
        origenDestino(2, 4);
        origenDestino(3, 2);
        origenDestino(4, 1);
        origenDestino(4, 2);
        System.out.println(grafo.mostrar());
        System.out.println("---------------DOS---------------");
        
        //---------------DOS---------------
        grafo2.nuevoNodo(1);
        grafo2.nuevoNodo(2);
        grafo2.nuevoNodo(3);
        grafo2.nuevoNodo(4);
        origenDestino2(1, 3);
        origenDestino2(1, 2);
        origenDestino2(1, 4);
        origenDestino2(2, 1);
        origenDestino2(2, 3);
        origenDestino2(3, 1);
        origenDestino2(3, 2);
        origenDestino2(3, 4);
        origenDestino2(4, 1);
        origenDestino2(4, 3);
        origenDestino2(4, 4);
        System.out.println(grafo2.mostrar());
        System.out.println("---------------TRES---------------");
        
       //---------------TRES---------------
        grafo3.nuevoNodo(1);
        grafo3.nuevoNodo(2);
        grafo3.nuevoNodo(3);
        grafo3.nuevoNodo(4);
        origenDestino3(1, 2);
        origenDestino3(1, 4);
        origenDestino3(2, 3);
        origenDestino3(2, 1);
        origenDestino3(3, 4);
        origenDestino3(3, 2);
        origenDestino3(4, 1);
        origenDestino3(4, 3);
       
        System.out.println(grafo3.mostrar());
        System.out.println("---------------CUATRO---------------");
        
         //---------------CUATRO---------------
        grafo4.nuevoNodo(1);
        grafo4.nuevoNodo(2);
        grafo4.nuevoNodo(3);
        grafo4.nuevoNodo(4);
        origenDestino4(1, 2);
        origenDestino4(1, 3);
        origenDestino4(1, 4);
        origenDestino4(2, 1);
        origenDestino4(2, 3);
        origenDestino4(2, 4);
        origenDestino4(3, 2);
        origenDestino4(3, 1);
        origenDestino4(3, 4);
        origenDestino4(4, 1);
        origenDestino4(4, 2);
        origenDestino4(4, 3);
        System.out.println(grafo4.mostrar());
        System.out.println("---------------CINCO---------------");
        
       //---------------CINCO---------------
        grafo5.nuevoNodo(1);
        grafo5.nuevoNodo(2);
        grafo5.nuevoNodo(3);
        grafo5.nuevoNodo(4);
        origenDestino5(1, 3);
        origenDestino5(1, 4);
        origenDestino5(2, 3);
        origenDestino5(3, 1);
        origenDestino5(3, 2);
        origenDestino5(4, 1);
        
        System.out.println(grafo5.mostrar());
    }
    public static void origenDestino (int origen, int destino){
        if (grafo.existVertice(origen) && grafo.existVertice(destino)) {
            grafo.nuevaArista(origen, destino);
        }
    }
    public static void origenDestino2 (int origen, int destino){
        if (grafo2.existVertice(origen) && grafo2.existVertice(destino)) {
            grafo2.nuevaArista(origen, destino);
        }
    }
    public static void origenDestino3 (int origen, int destino){
        if (grafo3.existVertice(origen) && grafo3.existVertice(destino)) {
            grafo3.nuevaArista(origen, destino);
        }
    }
    public static void origenDestino4 (int origen, int destino){
        if (grafo4.existVertice(origen) && grafo4.existVertice(destino)) {
            grafo4.nuevaArista(origen, destino);
        }
    }
    public static void origenDestino5 (int origen, int destino){
        if (grafo5.existVertice(origen) && grafo5.existVertice(destino)) {
            grafo5.nuevaArista(origen, destino);
        }
    }
            
    }
    