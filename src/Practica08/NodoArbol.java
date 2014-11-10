package Practica08;
/*
 * Clase NodoArbol
 * Autor: Angeles Junco
 */

public class NodoArbol <T>  {
     public T dato;
     public NodoArbol <T> der;
     public NodoArbol <T> izq;
     
     NodoArbol () {
    	 dato = null;
    	 der = null;
    	 izq = null;
     }
     
     NodoArbol(T d) {
    	 dato = d;
    	 der = null;
    	 izq = null;
     }
}
