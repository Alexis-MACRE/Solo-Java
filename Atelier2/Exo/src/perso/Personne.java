package perso;

import java.util.*;
import perso.util.Adresse;


public class Personne{
    protected static final Adresse ADRESSE_INCONNUE = null;
    private static int nbPersonne = 0;

    protected String nom;
    protected String prenom;
    protected final GregorianCalendar dateNaissance;
    protected Adresse adresse=ADRESSE_INCONNUE;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		nbPersonne++;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le n° de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}

		/**
	 * Constructeur de Personne
	 * @param personne l'objet personne dont on fait la copie
	 */
	public Personne(Personne personne){
		this.nom = personne.getNom();
		this.prenom= personne.getPrenom();
		this.dateNaissance = personne.getDateNaissance();
		this.adresse = personne.getAdresse();
		nbPersonne++;
	}

	/**
	 * Accesseur
	 * @return retourne le nombre de personne
	 */
	public static int getNbPersonne(){
		return nbPersonne;
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le pr�nom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Prénom : "+prenom+"\n"+
		"Né(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}

	/**
	 * Méthode
	 * Compare l'âge de l'objet et de la personne passée en paramètre.
	 * compareTo renvoie un nombre négatif si la date en parametre est plus récente
	 * @param retourne le résultat du test	 
	 */
	public boolean plusAgee(Personne p) {
		return(Personne.plusAgee(this, p));
	}

	public String afficheDate(){
		String anneeNaissance = Integer.toString(this.dateNaissance.get(GregorianCalendar.YEAR));
		String moisNaissance = Integer.toString(this.dateNaissance.get(GregorianCalendar.MONTH));
		String jourNaissance = Integer.toString(this.dateNaissance.get(GregorianCalendar.DAY_OF_MONTH));
  
		return jourNaissance + "/" + moisNaissance + "/" + anneeNaissance;
	}

	/**
	 * Méthode statique
	 * Compare l'âge de l'objet et de la personne passée en paramètre.
	 * compareTo renvoie un nombre négatif si la date en parametre est plus récente
	 * @param retourne le résultat du test	 
	 */
	public static boolean plusAgee(Personne a,Personne b) {
		return(a.getDateNaissance().compareTo(b.getDateNaissance()) < 0);
	}

	/** Redéfintion de equals
	 * @see java.lang.Object#equals()
	 */
	@Override
	public boolean equals(Object obj) {
		return(obj instanceof Personne && this.nom.equals(((Personne)obj).getNom()) && this.prenom.equals(((Personne)obj).getPrenom()) && this.dateNaissance.compareTo(((Personne)obj).getDateNaissance())==0);
	}
}

    
   
   