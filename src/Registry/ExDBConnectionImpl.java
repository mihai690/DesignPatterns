package Registry;

import static Registry.DBConnection.Database.*;

public class ExDBConnectionImpl {
    public static void main(String[] args) {
        DBConnection con1 = DBConnection.getInstance(DB_1);
        DBConnection con2 = DBConnection.getInstance(DB_2);
        DBConnection con3 = DBConnection.getInstance(DB_1);
        //nu se mai apeleaza inca o data constructorul pt DB_1 la conex 3 pt ca o avem deja in registru

    }
}
