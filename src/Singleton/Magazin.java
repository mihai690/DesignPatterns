package Singleton;

public class Magazin {
    //lazy singleton
    private String nume;
    private static Magazin SINGLETON;

    private Magazin() {

    }

    public static Magazin getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Magazin();
        }
        return SINGLETON;

    }
}
