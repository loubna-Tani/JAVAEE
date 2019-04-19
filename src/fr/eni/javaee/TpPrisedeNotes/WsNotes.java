package fr.eni.javaee.TpPrisedeNotes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import fr.eni.javaee.Module9.Crayon;


@Path ("/note")
public class WsNotes {
	
		private static List<Note> listeNote= new ArrayList <>();
	 
		//afficher
 @GET
 public List <Note> getNote(){
	return listeNote;	
}
		
 @POST
 public Note ajouterNote (@FormParam("texte") String texte) {
	
	
	 
	 Note note = new Note(texte);
	
	listeNote.add(note);
	for(Note n: listeNote) {
		
		System.out.println(n.toString());
	}
	return note;

}
 public Note deletNote (@FormParam("texte") String texte) {
		
		Note note = new Note(texte);
		
		listeNote.remove(note);
		
		return note;

	}

}
