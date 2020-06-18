public class Test {
    public static void main(String[] args) {
        ListeFilms liste = new ListeFilms();

        Realisateur real = new Realisateur("LABOUTEILLE", "Franck", 2);

        Acteur acteur1 = new Acteur("JEAN", "Bernard");
        Acteur acteur2 = new Acteur("MOULINEAU", "Patrick");

        Film f1 = new Film("Babou", 1, 54, 23);
        Film f2 = new Film("Le Banc", 0, 12, 42);
        Film f3 = new Film("Les Groseilles", 4, 32, 0);

        Role r1 = new Role("Le Chauffeur", "Il conduit");
        Role r2 = new Role("Le Tracteur", "Il laboure");

        f1.ajouterActeur(acteur1, r2);
        f1.ajouterFigurant(acteur2);

        f2.ajouterActeur(acteur1, r1);
        f2.ajouterFigurant(acteur2);

        liste.ajouterFilm(f1);
        liste.ajouterFilm(f2);
        liste.ajouterFilm(f3);

        real.ajouterFilm(f1);

        liste.chercheActeur(acteur1);
        liste.chercheActeur(acteur2);
    }
}