package Builder;

public class ExCasaImpl {
    public static void main(String[] args) {
        Casa c = new Casa.Builder()
                        .setAdresa("Bd. Timisoara")
                        .setEtaje(1)
                        .setUsi(2)
                        .build();

        System.out.println(c);
    }
}
