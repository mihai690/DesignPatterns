package Registry;

import java.util.HashMap;
import java.util.Map;

//Registry Pattern = singleton extins
//putem crea o sg instanta pentru fiecare tip/categorie
public class ProdusRegistry {
    public static enum ProdusType {
        DULCE, SARAT;
    }

    private static Map<ProdusType, Produs> registry = new HashMap<>();

    public static Produs getInstance(ProdusType type) {
        if (!registry.containsKey(type)) {
            registry.put(type, new Produs());
        }
        return registry.get(type);
    }
}
