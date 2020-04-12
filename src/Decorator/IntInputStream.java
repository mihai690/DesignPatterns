package Decorator;

public class IntInputStream {

    private ByteInputStream bis;

    public IntInputStream(ByteInputStream bis) {
        this.bis = bis;
    }
    //creez o noua functionalitate folosind o alta deja existenta (o decorez)
    public int read() {
        bis.read();
        bis.read();
        bis.read();
        bis.read();

        System.out.println("Reconstitui int-ul");

        return 0;
    }
}
