package fr.eni.javaee.Module9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path ("/crayons")
public class WScrayons {

	private static List<Crayon> listeCrayons= new ArrayList <>();
	
	
	static {
		listeCrayons.add(new Crayon (1, "bille","bleu"));
		listeCrayons.add(new Crayon (1, "plum","vert"));
	}
	//afficher
	@GET
	public List <Crayon> getCrayons(){
		return listeCrayons;	
	}
	
	@POST
	public Crayon ajouterCrayon (@FormParam("type") String type,@FormParam("couleur")String couleur) {
		
		Crayon crayon = new Crayon(type,couleur);
		crayon.setId(new Random().nextInt(100));
		listeCrayons.add(crayon);
		
		return crayon;
		
		
		
		
		
	}
	
}
