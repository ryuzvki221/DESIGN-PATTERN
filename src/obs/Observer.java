package obs;

/**
 * interface qui doit etre implement√© par
 * tout Objet qui souhaite observer d'autres Objets .
 */
public interface Observer {
    void update(Observable observable);
    //    void update (double state);//push
}
