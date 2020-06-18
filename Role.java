public class Role {
    private String nom;
    private String text;

    public Role(String nom, String text) {
        this.nom = nom;
        this.text = text;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return this.nom + " : " + this.text;
    }
}