package Factory;

import static Factory.Paths.*;

public class ExFactoryImpl {
    public static void main(String[] args) {
        Path p1 = get(OS.LINUX);
        Path p2 = get(OS.WINDOWS);

        System.out.println(p1.getRoot());
        System.out.println(p2.getRoot());
    }
}
