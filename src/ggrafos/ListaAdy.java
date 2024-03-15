
package ggrafos;

public class ListaAdy {
    Arco primero;
    Arco ultimo;
    
    public ListaAdy(){
        primero = null;
        ultimo = null;
    }
    
    public boolean listaVacia(){
    return primero == null;
    }
    
    public void nuevaAdy(int destino){
        if(!adyacente (destino)){
            Arco nodo= new Arco (destino);
            inserta(nodo, destino);
        }
    }
    
    private void inserta(Arco nodo, int destino){
        if(listaVacia()){
            primero= nodo;
            ultimo= nodo;
        }else{
            if(destino != primero.destino){
                nodo.siguiente = primero;
                primero = nodo;
            }else {
                if(destino != ultimo.destino){
                ultimo.siguiente = nodo;
                ultimo = nodo;
                }else{
                   Arco position =  primero;
                   while(destino != position.destino){
                       position = position.siguiente;
                   }
                   nodo.siguiente = position.siguiente;
                   position.siguiente= nodo;
                }
            }
        }
    }
    
     public boolean adyacente(int dato){
        Arco actual;
        boolean encontrado;
        encontrado = false;
        actual = primero;
        
        while(actual !=null && dato != actual.destino){
            actual = actual.siguiente;
        }
        if(actual != null){
        encontrado = true;
        }
            return encontrado;
        }
     
      public String mostrar(Nodo first){
        String valores = "";
        Arco temp = primero;
        Nodo nodo = first;
        while (temp != null){
            while(nodo != null){
                if (adyacente(nodo.dato)) {
                    valores += 1 +" ";
                }else{
                    valores += 0 +" ";
                }
                nodo = nodo.siguiente;
            }
            
            temp = temp.siguiente;
        }
        return valores;
    }
}
