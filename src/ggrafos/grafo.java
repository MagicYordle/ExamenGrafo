package ggrafos;
 
public class grafo {
    private Nodo primero;
    private Nodo ultimo;
    
    public grafo(){
        primero = null;
        ultimo = null;
    }
    
    public boolean grafoVacio(){
    return primero == null;
    }
    
    public boolean existVertice(int dato){
        boolean existe = false;
        if(!grafoVacio()){
            Nodo temporal = primero;
            while(temporal !=null && !existe){
                if(temporal.dato == dato){
                        existe = true;
                    }
            temporal = temporal.siguiente;
        }
    }
    return existe;
}
    public void nuevaArista(int origen, int destino){
        if(existVertice(origen) && existVertice (destino)){
            Nodo position = primero;
            while(position.dato!= origen){
                position = position.siguiente;
            }
            position.lista.nuevaAdy(destino);
        }
    }
    
    public void nuevoNodo(int dato){
    if(!existVertice(dato)){
        Nodo nodo= new Nodo (dato);
        if(grafoVacio()){
        primero = nodo;
        ultimo = nodo;
        }else{
            if(dato != primero.dato){
                nodo.siguiente= primero;
                primero = nodo;
            }else if(dato != ultimo.dato){
            ultimo.siguiente= nodo;
            ultimo = nodo;
            }else{
                Nodo temporal = primero;
                while(dato != temporal.dato){
                temporal = temporal. siguiente;
                }
               nodo.siguiente = temporal.siguiente;
               temporal.siguiente = nodo;
            }
        }
    }    
}
    public String mostrar(){
        String valores = "   ";
        Nodo temp = primero;
        while(temp != null){
            valores += temp.dato+" ";
            temp = temp.siguiente;
        }
        valores+= "\n";
        temp = primero;
        while (temp != null){            
            valores += temp.dato +"->"+ temp.lista.mostrar(primero)+"\n";
            temp = temp.siguiente;
        }
        return valores;
    }
}