package Practica08;
/*
 *Clase de prueba
 *Agenda de contactos
 */
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AgendaAPP {
	
	public static void main (String [] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new FileReader("contactos.txt"));
		TreeSet<Contacto> contactos = new TreeSet<Contacto>();
		while (scan.hasNextLine()){
			String linea = scan.nextLine();
			String[] sep = linea.split("-");
			String nombre = sep[0];
			String apellido = sep[1];
			String direccion = sep[2];
			ArrayList<String> tel = new ArrayList<String>();
			tel.add(sep[3]);
			ArrayList<String> email = new ArrayList<String>();
		
			email.add(sep[4]);
			
			Contacto contacto = new Contacto (nombre, apellido, tel, email);
			contacto.setDireccion(direccion);
			
			contactos.add(contacto);		
		}
		scan.close();
		
		
		AgendaTreeSet agenda = new AgendaTreeSet(contactos);
		System.out.println("******Imprimiendo todos los contactos******\n\n");
		System.out.print(agenda.contactos());
		 
		
		//Agregando un contacto existente
		System.out.println("\n\n*****Agregando un contacto ya existente******\n");
		System.out.println("Agregando a Peter Parker...");
		if (agenda.addContacto(new Contacto("Peter", "Parker" , null ,null))){
			System.out.println("El contacto fue agregado");
		}else{
			System.out.println("El contacto ya existe");
		}
		
		//Eliminando contactos
		System.out.println("\n\n*****Borrando un contacto ya existente*****\n");
		System.out.println("Borrando a Diego Garcia...");
		if(agenda.eliminaContacto(new Contacto("Diego", "Garcia", null, null))){
			System.out.println("El contacto fue borrado ;) (Thank God)");
		}else{
			System.out.println("El contacto no existe");
		}
		System.out.println("\n\n*****Borrando un contacto no existente*****\n");
		System.out.println("Borrando a Diego Garcia...");
		if(agenda.eliminaContacto(new Contacto("Diego", "Garcia", null, null))){
			System.out.println("El contacto fue borrado");
		}else{
			System.out.println("El contacto no existe");
		}
		
		//Actualizar direccion de un contacto ya existente
		System.out.println("\n\n*****Actualizando la direccion de un contacto ya existente*****\n");
		System.out.println("Actualizando la direccion de Saul Damaris...");
		if(agenda.actualizarDir(new Contacto ("Saul" , "Damaris", null, null), "Lomas Verdes")){
			System.out.println("La direccion ha sido actualizada");
		}else{
			System.out.println("El contacto no existe");
		}
		System.out.println("\n\n*****Actualizando la direccion de un contacto no existente*****\n");
		System.out.println("Actualizando la direccion de Diego Garcia...");
		if(agenda.actualizarDir(new Contacto ("Diego" , "Garcia", null, null), "Satelite")){
			System.out.println("La dirección ha sido actualizada");
		}else{
			System.out.println("El contacto no existe");
		}
		
		//Agregando un telefono a un contacto existente
		System.out.println("\n\n*****Agregando telefono a un contacto ya existente*****\n");
		System.out.println("Agregando un telefono a Diego Marquez...");
		if(agenda.agregarTelefono(new Contacto("Diego","Marquez", null, null), "987654321")){
			System.out.println("EL numero ha sido agregado");
		}else{
			System.out.println("El contacto no existe");
		}
		//Agregando un telefono a un contacto no existente
		System.out.println("\n\n*****Agregando telefono a un contacto no existente*****\n");
		System.out.println("Agregando un telefono a David Monroy...");
		if(agenda.agregarTelefono(new Contacto("David","Monroy", null, null), "987654321")){
			System.out.println("EL numero ha sido agregado");
		}else{
			System.out.println("El contacto no existe");
		}
		
		//Agregando un email a un contacto existente
		System.out.println("\n\n*****Agregando un email a un contacto ya existente*****\n");
		System.out.println("Agregando un email a Tony Stark...");
		if(agenda.agregarEmail(new Contacto("Tony","Stark", null, null), "reina_de-la-noche@gmail.com")){
			System.out.println("EL mail ha sido agregado");
		}else{
			System.out.println("El contacto no existe");
		}
		
		//Agregando un email a un contacto no existente
		System.out.println("\n\n*****Agregando un email a un contacto no existente*****\n");
		System.out.println("Agregando un email a Debora Quins...");
		if(agenda.agregarEmail(new Contacto("Debora","Quins", null, null), "reina@gmail.com")){
			System.out.println("EL mail ha sido agregado");
		}else{
			System.out.println("El contacto no existe");
		}
		
		//Borrando telefono de un contacto existente
		System.out.println("\n\n*****Borrando el telefono de un contacto existente*****\n");
		System.out.println("Borrando el telefono de Jacob Resendiz...");
		if(agenda.borrarTelefono(new Contacto("Jacob","Resendiz", null, null), "55000007")){
			System.out.println("EL telefono ha sido eliminado");
		}else{
			System.out.println("El contacto no existe");
		}
		
		//Borrando telefono de un contacto no existente
		System.out.println("\n\n*****Borrando el telefono de un contacto no existente*****\n");
		System.out.println("Borrando el telefono de Juan Resendisz...");
		if(agenda.borrarTelefono(new Contacto("Juan","Resendisz", null, null), "55000007")){
			System.out.println("EL telefono ha sido eliminado");
		}else{
			System.out.println("El contacto no existe");
		}
		
		//Borrando mail de un contacto existente
		System.out.println("\n\n*****Borrando el mail de un contacto existente*****\n");
		System.out.println("Borrando el telefono de Patricio Estrella...");
		if(agenda.borrarTelefono(new Contacto("Patricio","Estrella", null, null), "patrickstar@gmail.com")){
			System.out.println("El mail ha sido eliminado");
		}else{
			System.out.println("El contacto no existe");
		}
		
		//Borrando mail de un contacto no existente
		System.out.println("\n\n*****Borrando el mail de un contacto no existente*****\n");
		System.out.println("Borrando el telefono de Eduardo ROdriguez...");
		if(agenda.borrarTelefono(new Contacto("Eduardo","ROdriguez", null, null), "patrickstar@gmail.com")){
			System.out.println("El mail ha sido eliminado");
		}else{
			System.out.println("El contacto no existe");
		}
		
		System.out.println("\n\nIMPRIMIENDO CONTACTOS CON MODIFICACIONES\n\n");
		System.out.println(agenda.contactos());
		
		
		System.out.println("\n\nConsultando un contacto existente\n"
				+ "Consultando el contacto Bruce Wayn...\n");
			System.out.println(agenda.consultarContacto("Bruce", "Wayn"));
			
			System.out.println("\n\nConsultando un contacto no existente");
			System.out.println("Consultando a Diego Garcia : ");
			System.out.println(agenda.consultarContacto("Diego", "Garcia"));	
		
	}
	
}
