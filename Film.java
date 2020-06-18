import java.util.ArrayList;
import java.util.HashMap;

public class Film {
    private String titre;
    private Hours duree;
    private ArrayList<Acteur> listeFigurants;
    private HashMap<Acteur, Role> casting;

    public Film(String titre, int h, int m, int s) {
        this.duree = new Hours(h, m, s);
        this.titre = titre;
        listeFigurants = new ArrayList<Acteur>();
        casting = new HashMap<Acteur, Role>();
    }

    /**
     * @return the duree
     */
    public Hours getDuree() {
        return duree;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return this.titre + "(" + duree.toString() + ")";
    }

    public void ajouterActeur(Acteur a, Role r) {
        casting.put(a, r);
    }

    public void ajouterFigurant(Acteur a) {
        listeFigurants.add(a);
    }

    public boolean acteurJoue(Acteur a) {
        return casting.containsKey(a);
    }

    public boolean acteurFigure(Acteur a) {
        return listeFigurants.contains(a);
    }

    public Role getRole(Acteur a) {
        return casting.get(a);
    }
}