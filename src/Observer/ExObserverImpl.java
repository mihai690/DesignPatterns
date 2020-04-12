package Observer;

public class ExObserverImpl {
    public static void main(String[] args) {

        //facem chat ul
        Chat chat = new Chat();

        //facem user ii
        User ion = new User("ion");
        User costel = new User("costel");
        User mihai = new User("mihai");

        chat.addListener(ion);
        chat.addListener(costel);
        chat.addListener(mihai);

        chat.notifyListeners("hello de la gigel");
    }
}
