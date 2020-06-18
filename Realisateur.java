import java.util.ArrayList;

public class Realisateur {
    private String nom;
    private String prenom;
    private int nbFilmsRealises;
    private ArrayList<Film> listeFilms;

    public Realisateur(String nom, String prenom, int nbFilmsRealises) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbFilmsRealises = nbFilmsRealises;
        listeFilms = new ArrayList<Film>();
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

    /**
     * @return the nbFilmsRealises
     */
    public int getNbFilmsRealises() {
        return nbFilmsRealises;
    }

    public void ajouterFilm(Film f) {
        this.listeFilms.add(f);
        nbFilmsRealises++;
    }

    public void afficherFilms() {
        System.out.println(this.nbFilmsRealises + " réalisés par " + this.nom + " " + this.prenom + " :\n");
        for (Film film : listeFilms) {
            System.out.println("\t" + film.toString() + "\n");
        }
    }
}