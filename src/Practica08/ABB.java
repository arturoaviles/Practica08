package Practica08;

/*
 * Clase ABB - Estructuras de datos
 * Autor:
 * Matricula:
 * Autor:
 * Matricula:
 */

public class ABB <T extends Comparable <? super T>> {

// Unico atributo del ABB -> su raiz
	private NodoArbol <T> raiz;
	
		
// Constructor que coloca la raiz en null indicando
// que el �rbol YA existe pero est� vac�o
	ABB () {
		this.raiz = null;
	}
	
	
       
// Verifica si el arbol esta vacio o no	
	public boolean isEmpty() {
		if (this.raiz == null)
				return true;
		else
			return false;
		
	}
	

// Elimina los datos del arbol
	public void clear() {
		this.raiz = null;
	}
	
	
	public void insertaABBiterativo(T dato){
		NodoArbol<T> noDato = new NodoArbol<T>(dato);
		int i;
		if(this.raiz == null) this.raiz = noDato;
		else{
			NodoArbol<T> temp = this.raiz; 
			i = temp.dato.compareTo(dato); 
			NodoArbol<T> pos = null; 
			if(i == 0) return;
			if(i > 0) pos = temp.izq;
			if(i < 0)  pos = temp.der;
			
			while(pos != null){
				temp = pos;
				i = temp.dato.compareTo(dato); 
				if(i == 0) return;
				if(i > 0) pos = temp.izq;
				if(i < 0)  pos = temp.der;
			}
			if(i > 0) temp.izq = noDato;
			if(i <0) temp.der = noDato;		
		}
		
	}
	
// Metodo que inserta un nuevo nodo en el ABB en forma recursiva
	public void insertaABBrecursivo (T dato) {
		if(this.raiz == null){
			NodoArbol<T> noDa = new NodoArbol<T>(dato);
			this.raiz = noDa;
		}
		else
			insertaABBUtil(this.raiz, dato);
	}
	
	
// Metodo de utileria para apoyar al metodo de insercion recursivo
	private void insertaABBUtil (NodoArbol <T> nodo, T dato) {	
		int i = nodo.dato.compareTo(dato);
		
		if(i == 0)
			return;
		
		if(i > 0){
			if(nodo.izq == null){
				NodoArbol<T> izq = new NodoArbol<T>(dato);
				nodo.izq = izq;
			}
			else
				insertaABBUtil(nodo.izq, dato);
		}
		
		else{
			if(nodo.der == null){
			NodoArbol<T> der = new NodoArbol<T>(dato);
			nodo.der = der;
			}
			else
				insertaABBUtil(nodo.der, dato);
		}
	}

	
// Metodo que regresa una cadena con el recorrido EN ORDEN del ABB		
	public String inOrden() {
		return inOrdenUtil(this.raiz, "");
	}
	
	
// Metodo de utileria para apoyar al metodo EN ORDEN 
	private String inOrdenUtil(NodoArbol <T> nodo, String s) {
		if(nodo != null){
                        
			s += inOrdenUtil(nodo.izq, "");
			s+= nodo.dato.toString() + " ";
			s += inOrdenUtil(nodo.der, "");
		}
		return s;
	}
	
	
// Metodo que regresa una cadena con el recorrido PRE ORDEN del ABB		
	public String preOrden() {		
		return preOrdenUtil(this.raiz, "");
	}
	
	
// Metodo de utileria para apoyar al metodo PRE ORDEN 
	private String preOrdenUtil(NodoArbol <T> nodo, String s) {
		if(nodo != null){
			s+= nodo.dato.toString() + " ";
			s += preOrdenUtil(nodo.izq, "");
			s += preOrdenUtil(nodo.der, "");
		}
		return s;
	}	


// Metodo que regresa una cadena con el recorrido POST ORDEN del ABB		
	public String postOrden() {	
		return postOrdenUtil(this.raiz, "");
	}
	

// Metodo de utileria para apoyar al metodo POST ORDEN 
	private String postOrdenUtil(NodoArbol <T> nodo, String s) {
		if(nodo != null){
			s += postOrdenUtil(nodo.izq, "");
			s += postOrdenUtil(nodo.der, "");
			s+= nodo.dato.toString() + " ";
		}
		return s;
	}
		
			
// Metodo que regresa el nodo predecesor al nodo que se recibe de par�metro
	private NodoArbol <T> predecesor(NodoArbol <T> nodo) {
		if(nodo == null)
			return null;
		
		NodoArbol<T> temp;
		temp = nodo.izq;
		
		while(temp.der != null){
			temp = temp.der;
		}
		return temp;
	}

    
// Metodo que regresa el nodo sucesor al nodo que se recibe de par�metro
   	private NodoArbol <T> sucesor(NodoArbol<T> nodo) {
   		if(nodo == null)
			return null;
   		
   		NodoArbol<T> temp;
		temp = nodo.der;
		
		while(temp.izq != null){
			temp = temp.izq;
		}
		return temp;
   	}    


// Metodo ITERATIVO que regresa el dato mayor del ABB
    public T getMayorABB() {
    	NodoArbol<T> temp = this.raiz;
    	if (temp == null)
    		return null;
    	while(temp.der != null){
    		temp = temp.der;
    	}
    	return temp.dato;
    }

    
// Metodo ITERATIVO que regresa el dato menor del ABB
    public T getMenorABB() {
    	NodoArbol<T> temp = this.raiz;
    	if (temp == null)
    		return null;
    	while(temp.izq != null){
    		temp = temp.izq;
    	}
    	return temp.dato;
    }


// Metodo que regresa el total de nodos HOJA en el ABB
    public int getTotalNodosTerminalesRecursivo() {
    	if(this.raiz == null)
    		return 0;
    	return getTotalNodosTerminalesUtil(this.raiz, 0);
    }
    
// Metodo de utileria para apoyar el metodo que regresa el total de 
// nodos HOJA en el ABB
    private int getTotalNodosTerminalesUtil (NodoArbol <T> nodo, int total) {
    	if(nodo != null){
    		total = getTotalNodosTerminalesUtil(nodo.izq, total);
    		total = getTotalNodosTerminalesUtil(nodo.der, total);
    		if (nodo.izq == null && nodo.der == null)
    			total++;
    	}
    	return total;
    }
    	    

// Metodo que regresa el total de nodos en el ABB
    public int contarNodosRecursivo() {
    	if(this.raiz == null)
    		return 0;
    	return contarNodosUtil(this.raiz, 0);
    }
    

// Metodo de utileria para apoyar el metodo que regresa el total de nodos en el ABB
    private int contarNodosUtil (NodoArbol <T> nodo, int total) {
    	if(nodo != null){
    		total = contarNodosUtil(nodo.izq, total);
    		total = contarNodosUtil(nodo.der, total);
    	    total++;
    	}
    	return total;
    }
    

// Metodo que regresa el hermano, en el ABB, del dato T que se recibe de par�metro    	    
    public T getHermanoABBRecursivo (T dato) {
    	if(this.raiz == null)
    		return null;
    	return(getHermanoABBUtil(this.raiz, dato));
	}
    

// Metodo de utileria para apoyar al metodo que regresa el hermano, en el ABB, 
// del dato T que se recibe de par�metro    	    
    private T getHermanoABBUtil(NodoArbol <T> nodo, T dato) {   
    	int i;
        
    	if(nodo == null || nodo.dato == null)
    		return null;
        
    	if(containsABBRecursivo(dato) == false)
    		return null;
        
    	if(dato == this.raiz.dato)
    		return null;
    	
    	if(nodo.der.dato.compareTo(dato) == 0){
    		if(nodo.izq == null)
    			return null;
    		return nodo.izq.dato;
    	}
    	if(nodo.izq.dato.compareTo(dato) == 0 ){
    		if(nodo.der == null)
    			return null;
    		return nodo.der.dato;
    	}
    	else{
    		i = nodo.dato.compareTo(dato);
    		if(i > 0)
    			return getHermanoABBUtil(nodo.izq, dato);
    		else
    			return getHermanoABBUtil(nodo.der, dato);
    	}
    }


// Metodo que regresa el padre, en el ABB, del dato T que se recibe de par�metro    	    
    public T getPadreABBRecursivo (T dato) {
    	if(this.raiz == null || this.raiz.dato.compareTo(dato)==0)
    		return null;
    	return getPadreABBUtil(this.raiz, dato);
    }
    

// Metodo de utileria para apoyar al metodo que regresa el padre, en el ABB, 
// del dato T que se recibe de par�metro    	    
    private T getPadreABBUtil (NodoArbol <T> nodo, T dato) {
    	if(nodo == null)
    		return null;
    	if( nodo.der != null && nodo.der.dato.compareTo(dato) == 0 || nodo.izq != null && nodo.izq.dato.compareTo(dato) == 0)
    		return nodo.dato;
    	
    	int i = nodo.dato.compareTo(dato);
    	
    	if(i > 0)
    		return getPadreABBUtil(nodo.izq, dato);
    	else
    		return getPadreABBUtil(nodo.der, dato);
    }


// Metodo que regresa TRUE si el dato T, del par�metro, se encuentra en el ABB
// y FALSE en caso contrario    
    public boolean containsABBRecursivo(T dato) {
    	if(this.raiz == null)
    		return false;
    	else
    		return containsABBUtil(this.raiz, dato);
	}
    

// Metodo de utileria que apoya al metodo que regresa TRUE si el dato T, 
// del par�metro, se encuentra en el ABB y FALSE en caso contrario    
    private boolean containsABBUtil(NodoArbol <T> nodo, T dato) {
    	if(nodo == null)
    		return false;
    
    	int i = nodo.dato.compareTo(dato);
    	
    	if(i == 0)
    		return true;
    	if(i > 0)
    		return containsABBUtil(nodo.izq, dato);
    	else
    		 return containsABBUtil(nodo.der, dato);
    }


// Metodo ITERATIVO que regresa TRUE si el dato T, del par�metro, 
// se encuentra en el ABB y FALSE en caso contrario    
    public boolean containsABBIterativo(T dato) {
    	NodoArbol<T> temp = new NodoArbol<T>();
    	
    	temp = this.raiz;
    	int i;
    	
    	while(temp != null){
    		if(temp.dato == dato)
    			return true;
    		
    		i= temp.dato.compareTo(dato);
    		
    		if(i > 0)
    			temp = temp.izq;
    		
    		else
    			temp = temp.der;
    	}
    	
		return false;
    }
    

// Metodo RECURSIVO que elimina un dato del �rbol 
    public boolean eliminaDatoABB(T dato){
    	//NodoArbol<T> nodo = new NodoArbol<T>(dato);
    	if(this.raiz == null)
            return false;
            
        else
            eliminaDatoABBUtil(this.raiz, dato);
        
        return false;
    }
    
    
// Metodo RECURSIVO que elimina un dato del �rbol
    private boolean eliminaDatoABBUtil(NodoArbol<T> nodo, T dato){
        NodoArbol<T> temp;
        
        if(nodo==null) return false;
        
        if(nodo.dato==null) return false;

        int i = nodo.dato.compareTo(dato);
        
        if(i==0){
            // Si es un nodo hoja
            if(nodo.izq == null && nodo.der == null){
                if(nodo==this.raiz){
                    this.raiz=null; 
                    return true;
                }
                temp = getNodoPadreABBRecursivo(dato);
                if(temp.izq.dato.compareTo(dato)==0) 
                    temp.izq = null;
                
                else 
                    temp.der = null; 
                return true;
            }
            
            else{
                if(nodo.izq != null || nodo.der!= null){
                    temp = getNodoPadreABBRecursivo(nodo.dato);
                    
                    if(nodo.izq == null && nodo.der != null){
                        // no hay papá
                        if(this.raiz.dato==nodo.dato && nodo.izq==null){
                            this.raiz=nodo.der;
                            return true;
                        }
                        
                        else{
                        // papa va a adoptar al hijo derecho
                            i = temp.dato.compareTo(nodo.dato);
                            if (i > 0){
                                temp.izq=nodo.der;
                                return true;
                            }
                        
                            else{
                                temp.der = nodo.der;
                                return true;
                            }
                        }
                    }
                    //else
                    if(nodo.izq != null && nodo.der == null){
                        // no hay papa
                        if(this.raiz.dato==nodo.dato && nodo.der==null){
                            this.raiz=nodo.izq;
                        }
                        
                        // papa va a adoptar al hijo izq
                        else{
                            i = temp.dato.compareTo(nodo.dato);
                            if (i > 0){
                                temp.izq=nodo.izq;
                                return true;
                                }
                            else{
                                temp.der = nodo.izq;
                                return true;
                            }
                        }
                    }
                    
                        //else{    
                    if(nodo.izq != null && nodo.der != null){
                        temp = sucesor(nodo);
                        T var = temp.dato;
                        eliminaDatoABB(temp.dato);
                        nodo.dato=var; 
                        return true;
                    }
                }
            }
        }
        if(i > 0)
            return eliminaDatoABBUtil(nodo.izq, dato);

        else
            return eliminaDatoABBUtil(nodo.der, dato); 
    }
     

    
    private NodoArbol <T> getNodoPadreABBRecursivo (T dato) {
    	if(this.raiz == null || this.raiz.dato.compareTo(dato)==0)
    		return null;
    	return getNodoPadre(this.raiz, dato);
    }
    
    private NodoArbol <T> getNodoPadre(NodoArbol<T> nodo, T dato){
        if(nodo == null)
    		return null;
    	if(nodo.der != null && nodo.der.dato.compareTo(dato) == 0 || nodo.izq != null && nodo.izq.dato.compareTo(dato) == 0)
    		return nodo;
    	
    	int i = nodo.dato.compareTo(dato);
    	
    	if(i > 0)
    		return getNodoPadre(nodo.izq, dato);
    	else
    		return getNodoPadre(nodo.der, dato);
            
        }
}