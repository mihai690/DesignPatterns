package Decorator;

import java.io.InputStream;

public class ExDecoratorImpl {
    public static void main(String[] args) {
        ByteInputStream bis = new ByteInputStream();
        IntInputStream iis = new IntInputStream(bis);

        System.out.println(iis.read());
    }
}
