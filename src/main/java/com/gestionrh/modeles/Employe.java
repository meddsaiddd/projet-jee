package com.gestionrh.modeles;

public class Employe {
	private int id;
    private String nom;
    private String prenom;
    private String numeroSecuriteSociale;
    private String adresse;
    private String telephone;
    private String email;
    private int departementId;
    private String role;
    private String motDePasse;

    public Employe(int id,String nom, String prenom, String numeroSecuriteSociale, String adresse, 
                   String telephone, String email, int departementId, String role) {
        this.id=id;
    	this.nom = nom;
        this.prenom = prenom;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.departementId = departementId;
        this.role = role;
        this.motDePasse = "password123";
    }

    public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDepartementId(int departementId) {
		this.departementId = departementId;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getMotDePasse() { return motDePasse; }

    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

	public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getNumeroSecuriteSociale() { return numeroSecuriteSociale; }
    public String getAdresse() { return adresse; }
    public String getTelephone() { return telephone; }
    public String getEmail() { return email; }
    public int getDepartementId() { return departementId; }
    public String getRole() { return role; }
}
