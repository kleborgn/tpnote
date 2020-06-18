import java.util.ArrayList;

public class ListeFilms {
    private ArrayList<Film> liste;

    public ListeFilms() {
        liste = new ArrayList<Film>();
    }

    public void ajouterFilm(Film f) {
        liste.add(f);
    }

    public void chercheActeur(Acteur a) {
        for (Film film : liste) {
            if (film.acteurFigure(a)) {
                System.out.println(film.getTitre() + "\n");
            }
            if (film.acteurJoue(a)) {
                System.out.println(film.getTitre() + "(" + film.getRole(a).getNom() + ")\n");
            }
        }
    }
}