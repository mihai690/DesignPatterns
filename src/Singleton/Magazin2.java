package Singleton;

public class Magazin2 {
    //implementare singleton de tip inner static care este thread-safe (nu exista pb de concurenta)
    private String nume;

    private Magazin2() {
    }

    private static class Magazin2Holder {
        private static final Magazin2 instance = new Magazin2(); //locul in care creez instanta de Singleton.Magazin (o sg data)
    }


    public static Magazin2 getInstance() {
       return Magazin2Holder.instance;
    }
}
