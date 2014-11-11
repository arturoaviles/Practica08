package Practica08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
/**
 *
 * @author arturoavilescastellanos
 */
public class AgendaTreeSet {
    public TreeSet<Contacto> agenda; 

	public  AgendaTreeSet(TreeSet<Contacto> arbol){
		//this.agenda = arbol;
                agenda = new TreeSet<Contacto>();
		
		Iterator<Contacto> iter = arbol.iterator();
		Contacto c;

		while(iter.hasNext()){
			c = iter.next();
                       
			if(c != null)
                                agenda.add(c);       
		}
	}
	
	public String contactos(){
		String s= "";
		Iterator<Contacto> iter = this.agenda.iterator();
		          
		while(iter.hasNext()){
			s+= iter.next().toString() + " \n";
                        
		}
		return s;
	}
	
	public boolean addContacto(Contacto c){		
		if(agenda.contains(c))
			return false;
		else{
			agenda.add(c);
			return true;
		}
	}
	
	public boolean eliminaContacto(Contacto c){
		Iterator<Contacto> iter = this.agenda.iterator();

		if(agenda.contains(c)){
			while(iter.hasNext()){
				if(iter.next().compareTo(c) == 0)
					iter.remove();
			}
			return true;
		}
		return false;
	}	
	
	public boolean actualizarDir(Contacto c, String d){
		Iterator<Contacto> iter = this.agenda.iterator();
		Contacto co;

		if(this.agenda.contains(c)){
			while(iter.hasNext()){
				co= iter.next();
				if(co.compareTo(c) == 0)
					co.setDireccion(d);
			}
			return true;
		}
		return false;
	}

	public boolean agregarTelefono(Contacto c, String string) {
		Iterator<Contacto> iter = this.agenda.iterator();
		Contacto co;

		if(this.agenda.contains(c)){
			while(iter.hasNext()){
				co= iter.next();
				if(co.compareTo(c) == 0)
					co.addTelefono(string);
			}
			return true;
		}
		return false;
	}

	public boolean agregarEmail(Contacto c, String string) {
		Iterator<Contacto> iter = this.agenda.iterator();
		Contacto co;

		if(this.agenda.contains(c)){
			while(iter.hasNext()){
				co= iter.next();
				if(co.compareTo(c) == 0)
					co.addEmail(string);
			}
			return true;
		}
		return false;
	}

	public boolean borrarTelefono(Contacto c, String string) {
		Iterator<Contacto> iter = this.agenda.iterator();
		Contacto co;

		if(this.agenda.contains(c)){
			while(iter.hasNext()){
				co= iter.next();
				if(co.compareTo(c) == 0)
					co.deleteTelefono(string);
			}
			return true;
		}
		return false;
	}

	public String consultarContacto(String string, String string2) {
		Iterator<Contacto> iter = this.agenda.iterator();
		Contacto co, c;
		String s = "";
		
		c = new Contacto(string, string2, null, null);

		if(this.agenda.contains(c)){
			while(iter.hasNext()){
				co= iter.next();
				if(co.compareTo(c) == 0)
					s = co.toString();
			}
			return s;
		}
		return null;
	}

	public boolean borrarMail(Contacto c, String string) {
		Iterator<Contacto> iter = this.agenda.iterator();
		Contacto co;

		if(this.agenda.contains(c)){
			while(iter.hasNext()){
				co= iter.next();
				if(co.compareTo(c) == 0)
					co.deleteEmail(string);
			}
			return true;
		}
		return false;
	}

	public int longitud() {
		Iterator<Contacto> iter = this.agenda.iterator();
		int n = 0;
		
		while(iter.hasNext()){
			n++;
			iter.next();
		}	
		
		return n;
	}
}
