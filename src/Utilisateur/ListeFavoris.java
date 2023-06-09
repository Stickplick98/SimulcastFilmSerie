package  Utilisateur;

import java.util.ArrayList;
import Interface.AUnIdentifiant;

public class ListeFavoris implements AUnIdentifiant
{
    protected int identifiantFilm;
    public ListeFavoris(int idFilm)
    {
        setIdentifiant(idFilm);
    }
    @Override
    public int getIdentifiant()
    {
        return identifiantFilm;
    }

    @Override
    public void setIdentifiant(int i)
    {
        identifiantFilm = i;
    }

    @Override
    public String toString() {
        return "ListeFavoris{" +
                "identifiantFilm=" + identifiantFilm +
                '}';
    }
}
