package Builder;

public class Casa {
    private String adresa;
    private int suprafata;
    private int usi;
    private int etaje;

    public Casa(String adresa, int suprafata, int usi, int etaje) {
        this.adresa = adresa;
        this.suprafata = suprafata;
        this.usi = usi;
        this.etaje = etaje;
    }

    public Casa() {}

    public static class Builder {
        private Casa casa = new Casa();

        public Builder setUsi(int usi) {
            casa.usi = usi;
            return this; //avand mereu o instanta de Builder, putem face apoi o inlantuire de apel de metode
        }

        public Builder setEtaje(int etaje) {
            casa.etaje = etaje;
            return this;
        }

        //builder.setUsi(2)
        //       .setEtaje(1)

        //in loc de

        //builder.setUsi(2);
        //builder.setEtaje(1);

        public Builder setAdresa(String adresa) {
            casa.adresa = adresa;
            return this;
        }

        public Builder setSuprafata(int suprafata) {
            casa.suprafata = suprafata;
            return this;
        }

        public Casa build() {
            return casa;
        }

    }

    @Override
    public String toString() {
        return "Casa{" +
                "adresa='" + adresa + '\'' +
                ", suprafata=" + suprafata +
                ", usi=" + usi +
                ", etaje=" + etaje +
                '}';
    }
}
