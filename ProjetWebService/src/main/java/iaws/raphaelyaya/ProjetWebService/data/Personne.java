package iaws.raphaelyaya.ProjetWebService.data;

public class Personne {
	
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private double latitude;
	private double longitude;

	public Personne(String nom, String prenom, String mail, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
	}
	
	
	
	public Personne(String nom, String prenom, String mail, String adresse,
			double latitude, double longitude) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.latitude = latitude;
		this.longitude = longitude;
	}



	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude2) {
		this.latitude = latitude2;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude2) {
		this.longitude = longitude2;
	}
	

}
