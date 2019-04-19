package fr.eni.javaee.TpPrisedeNotes;


import java.io.Serializable;
import java.util.Date;

 

 
public class Note implements Serializable {
	
private static final long serialVersionUID = 1L;
   

    private static int idClasse=0;
	private int id;
	private String texte;
	private Date date;
	 
	
	 
	public Note( int id, String texte, Date date) {
		super();
		 
		this.id = idClasse;
		idClasse++;
		this.texte = texte;
		this.date = date;
	}
	public Note(String texte, Date date) {
		super();
		this.texte = texte;
		this.date = date;
	}
	public Note(String texte) {
		super();
		this.texte = texte;
		this.id = idClasse;
		idClasse++;
	}
	/**
	 * @return the idClasse
	 */
	public int getIdClasse() {
		return idClasse;
	}
	/**
	 * @param idClasse the idClasse to set
	 */
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the texte
	 */
	public String getTexte() {
		return texte;
	}
	/**
	 * @param texte the texte to set
	 */
	public void setTexte(String texte) {
		this.texte = texte;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Note [id=" + id + ", texte=" + texte + ", date=" + date + "]";
	}


}

