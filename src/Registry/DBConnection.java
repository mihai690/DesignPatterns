package Registry;

import com.sun.source.tree.BreakTree;

import java.util.HashMap;
import java.util.Map;

public class DBConnection {
    enum Database {
        DB_1, DB_2
    }

    private static Map<Database, DBConnection> registry = new HashMap<>();
    //registru in care unei BD ii am asociata o conexiune

    private DBConnection(Database db) {
        System.out.println("Ne-am conectat la " + db);
    }

    public static DBConnection getInstance(Database db) {
        registry.computeIfAbsent(
                db,
                database -> new DBConnection(database)
        );
        //computeIfAbsent ma lasa sa pun si un bloc de instr care la final imi returneaza conexiune
        //registry.putIfAbsent(db, new DBConnection());

        return registry.get(db);
    }
}
