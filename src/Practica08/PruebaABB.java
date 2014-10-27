/*
 * Clase de prueba de Arboles de búsqueda binaria
 * Autor: Angeles Junco
 */
 
public class PruebaABB {
 
     public static void main (String args[]) {
     
     	ABB <Integer> p = new ABB <Integer> ();
    	int i;
    	
    	System.out.println("Insertando nodos recursivamente.");    	    

      	p.insertaABBrecursivo(60);
      	p.insertaABBrecursivo(13);
      	p.insertaABBrecursivo(85);
     	p.insertaABBrecursivo(75);
      	p.insertaABBrecursivo(19);
      	p.insertaABBrecursivo(2);
      	p.insertaABBrecursivo(94);
      	p.insertaABBrecursivo(16);
		p.insertaABBrecursivo(10);
		p.insertaABBrecursivo(5);
      	p.insertaABBrecursivo(0);
		p.insertaABBrecursivo(34);
      	p.insertaABBrecursivo(78);
		p.insertaABBrecursivo(110);
      	p.insertaABBrecursivo(99);
		p.insertaABBrecursivo(5);
      	p.insertaABBrecursivo(50);
		p.insertaABBrecursivo(150);
		p.insertaABBrecursivo(3);
		p.insertaABBrecursivo(42);
		p.insertaABBrecursivo(57);
		p.insertaABBrecursivo(142);
		p.insertaABBrecursivo(4);
		p.insertaABBrecursivo(38);
		p.insertaABBrecursivo(130);	
		p.insertaABBrecursivo(99);
      	p.insertaABBrecursivo(50);
		
		
		System.out.println("\n***  Arbol con inserciones RECURSIVAS  *** \n");
    	    	
    	System.out.println("\nRecorrido en inOrden: " + p.inOrden());
    	System.out.println("\nRecorrido en preOrden: " + p.preOrden());
    	System.out.println("\nRecorrido en postOrden: " + p.postOrden());
    			

		p.insertaABBiterativo(20);
		p.insertaABBiterativo(5);
		p.insertaABBiterativo(35);
		p.insertaABBiterativo(2);
		p.insertaABBiterativo(32);
		p.insertaABBiterativo(27);
		p.insertaABBiterativo(10);
		p.insertaABBiterativo(14);	
		p.insertaABBiterativo(7);
		p.insertaABBiterativo(40);
		p.insertaABBiterativo(6);
		p.insertaABBiterativo(142);
		p.insertaABBiterativo(30);
		p.insertaABBiterativo(36);
		p.insertaABBiterativo(46);
		p.insertaABBiterativo(11);
		p.insertaABBiterativo(22);
		p.insertaABBiterativo(5);
				


		System.out.println("\n\n***  Arbol con inserciones ITERATIVAS  *** \n");
    	    	
    	System.out.println("\nRecorrido en inOrden: " + p.inOrden());
    	System.out.println("\nRecorrido en preOrden: " + p.preOrden());
    	System.out.println("\nRecorrido en postOrden: " + p.postOrden());
    	  	
	
		System.out.println("\n\n***  Probando metodos CONTIENE  *** \n");    	    	
    	System.out.println("\nContiene el arbol el dato 42 (Iterativo)?: " + (p.containsABBIterativo(42)? "SI" : "NO"));
    	System.out.println("\nContiene el arbol el dato 34 (Recursivo)?: " + (p.containsABBRecursivo(34)? "SI" : "NO"));
		System.out.println("\nContiene el arbol el dato 18 (Iterativo)?: " + (p.containsABBIterativo(18)? "SI" : "NO"));
    	System.out.println("\nContiene el arbol el dato 84 (Recursivo)?: " + (p.containsABBRecursivo(84)? "SI" : "NO"));
	
    	System.out.println("\nEl arbol tiene " + p.contarNodosRecursivo() + " nodos y " + p.getTotalNodosTerminalesRecursivo() + " hojas.");


		System.out.println("\n\n***  Probando metodo HERMANO  *** \n");    	    	    	
      	System.out.println("\nEl hermano de 75 es: " + p.getHermanoABBRecursivo(75));
		System.out.println("\nEl hermano de 60 es: " + p.getHermanoABBRecursivo(60));
		System.out.println("\nEl hermano de 175 es: " + p.getHermanoABBRecursivo(175));
		System.out.println("\nEl hermano de 57 es: " + p.getHermanoABBRecursivo(57));
		System.out.println("\nEl hermano de 5 es: " + p.getHermanoABBRecursivo(5));

		System.out.println("\n\n***  Probando metodo PADRE  *** \n");    	    	    	
    	System.out.println("\nEl padre de 75 es: " + p.getPadreABBRecursivo(75));
    	System.out.println("\nEl padre de 60 es: " + p.getPadreABBRecursivo(60));
    	System.out.println("\nEl padre de 175 es: " + p.getPadreABBRecursivo(175));
    	System.out.println("\nEl padre de 57 es: " + p.getPadreABBRecursivo(57));
    	System.out.println("\nEl padre de 5 es: " + p.getPadreABBRecursivo(5));
    	
		System.out.println("\n\n***  Probando metodos MAYOR y MENOR  *** \n");    	    	    	    	
    	System.out.println("\nEl mayor dato del arbol es: " + p.getMayorABB());
    	System.out.println("\nEl menor dato del arbol es: " + p.getMenorABB());
    	
		System.out.println("\n\n***  Probando metodo ELIMINA  *** \n");    	    	    	    	
	   	p.eliminaDatoABB(38);
    	System.out.println("\nBorrando el 38 (nodo hoja): " + p.inOrden());
    	
	   	p.eliminaDatoABB(57);
    	System.out.println("\nBorrando el 57 (nodo hoja): " + p.inOrden());
    	
    	p.eliminaDatoABB(130);
    	System.out.println("\nBorrando el 130 (nodo hoja): " + p.inOrden());

    	p.eliminaDatoABB(34);
    	System.out.println("\nBorrando el 34 (nodo con un hijo): " + p.inOrden());
 
     	p.eliminaDatoABB(100);
    	System.out.println("\nBorrando el 100 (nodo inexistente): " + p.inOrden());
   	
    	p.eliminaDatoABB(85);
    	System.out.println("\nBorrando el 85 (nodo con dos hijos): " + p.inOrden());
    	
    	p.eliminaDatoABB(60);
    	System.out.println("\nBorrando el 60 (nodo raiz): " + p.inOrden());
    	

		System.out.println("\n\n***  Probando metodo CLEAR  *** \n");    	    	    	    	
    	System.out.println("\nBorrando todos los datos del arbol... ");
    	p.clear();
    	
    	System.out.println("\n\nInsertando el 85 (nodo raiz)... ");
    	p.insertaABBiterativo(85);
		System.out.println("\nRecorrido en inOrden: " + p.inOrden());
    	p.eliminaDatoABB(85);
    	System.out.println("\nBorrando el 85 (nodo raiz SIN hijos): " + p.inOrden());
    	

    	System.out.println("\nBorrando todos los datos del arbol... ");
    	p.clear();
    	
    	System.out.println("\n\nInsertando el 36 (nodo raiz)... ");
    	p.insertaABBiterativo(36);
    	
    	System.out.println("\nInsertando el 74 ... ");
    	p.insertaABBiterativo(74);
		System.out.println("\nRecorrido en inOrden: " + p.inOrden());
		
    	p.eliminaDatoABB(36);
    	System.out.println("\nBorrando el 36 (nodo raiz con hijo derecho): " + p.inOrden());
    	
    	System.out.println("\nBorrando todos los datos del arbol... ");
    	p.clear();
    	
    	System.out.println("\nInsertando el 54 (nodo raiz)... ");
    	p.insertaABBiterativo(54);
    	System.out.println("\nInsertando el 22 ... ");
    	p.insertaABBiterativo(22);
		System.out.println("\nRecorrido en inOrden: " + p.inOrden());
    	p.eliminaDatoABB(54);
    	System.out.println("\nBorrando el 54 (nodo raiz con hijo izquierdo): " + p.inOrden());
   

    	System.out.println("\n\n");
    	   
     }     
}
