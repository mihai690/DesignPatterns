package Registry;

public class ExRegistryImpl {
    public static void main(String[] args) {
        Produs p1 = ProdusRegistry.getInstance(ProdusRegistry.ProdusType.DULCE);
        //ia tipul dulce din enumerarea de tipuri, care se afla in Registry.ProdusRegistry si returneaza o instanta de produs

        Produs p2 = ProdusRegistry.getInstance(ProdusRegistry.ProdusType.DULCE);
        Produs p3 = ProdusRegistry.getInstance(ProdusRegistry.ProdusType.SARAT);

        p1.nume = "BISCUITI";

        System.out.println(p1.nume + " " + p2.nume + " " + p3.nume);
        //p1 si p2 sunt de fapt aceeasi instanta
        //va returna null pt p3 pt ca nu avem instanta de tipul "sarat"

        p3.nume = "PLACINTA";
        System.out.println(p1.nume + " " + p2.nume + " " + p3.nume);

    }
}
