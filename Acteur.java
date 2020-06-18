public class Acteur {
    private String nom;
    private String prenom;

    public Acteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }
}