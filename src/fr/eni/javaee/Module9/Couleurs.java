package fr.eni.javaee.Module9;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path ("/couleurs")
public class Couleurs {
	
	
	private static List<String> listeCouleurs;
	
	static {
		listeCouleurs= new ArrayList<String>();
		listeCouleurs.add("Rouge");
		listeCouleurs.add("vert");
		listeCouleurs.add("bleu");
		listeCouleurs.add("jaune");
	}
	
	
	
	@GET
	public String getCouleur() {
		
		return listeCouleurs.toString();
	}
	
	@GET
	@Path("/{id : \\d+}")
	public String getCouleur(@PathParam ("id")int id) {
		
		return "le id"+id+"est la couleur"+listeCouleurs.get(id);
	}

}
