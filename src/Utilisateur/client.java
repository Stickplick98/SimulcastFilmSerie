package Utilisateur;

import java.util.ArrayList;
public class client extends Personne
{
    private String Telephone;
    private ArrayList<String> Preference =  new ArrayList<String>();
    private ArrayList<ListeFavoris> oeuvreFavorite;

    public client()
    {
        String Telephone = " ";

    }
    public client(String nomPersonne, String prenomPersonne, String login, String motDePasse, String telephone , String preference, ArrayList<ListeFavoris> l)
    {
        super(nomPersonne, prenomPersonne, login, motDePasse);
        Telephone = telephone;
        Preference.add(preference);
        oeuvreFavorite = l;
    }

    public String getTelephone()
    {
        return Telephone;
    }

    public void setTelephone(String telephone)
    {
        Telephone = telephone;
    }

    public ArrayList<String> getPreference()
    {
        return Preference;
    }

    public void setPreference(ArrayList<String> preference)
    {
        Preference = preference;
    }

    public void setFavoris ()
    {

    }

    public void ajoutFavoris(int test)
    {
        ListeFavoris Test = new ListeFavoris(test);
        oeuvreFavorite.add(Test);
        System.out.println(this.toString());
    }

    public void ResetMotDePasse()
    {
        if(MotDePasse != null)
        {
            MotDePasse = null;
        }
    }

    @Override
    public String toString() {
        return "client{" +
                "Telephone='" + Telephone + '\'' +
                ", Preference=" + Preference +
                ", oeuvreFavorite=" + oeuvreFavorite +
                ", Nompersonne='" + Nompersonne + '\'' +
                ", PrenomPersonne='" + PrenomPersonne + '\'' +
                ", Login='" + Login + '\'' +
                ", MotDePasse='" + MotDePasse + '\'' +
                '}';
    }


    @Override
    public  void affiche()
    {

        System.out.println(toString());

    }

    public static void main(String[] args)
    {
        ArrayList<ListeFavoris> test1 = new ArrayList<>();
        ListeFavoris test2 = new ListeFavoris(9);
        ListeFavoris test3 = new ListeFavoris(45);
        ListeFavoris test4 = new ListeFavoris(36);
        test1.add(test2);
        test1.add(test3);
        test1.add(test4);
        client client1= new client("Castellani", "Josue", "Sparkwillo", "Jcast05","0479/044211" ,"Horreur", test1);
        //System.out.println(client1.toString());
        client1.ajoutFavoris(200);
    }
}
