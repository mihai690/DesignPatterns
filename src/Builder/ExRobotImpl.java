package Builder;

public class ExRobotImpl {
    public static void main(String[] args) {
        Robot r1 = new Robot.Builder().setMaterial("aluminiu").build();
        Robot r2 = new Robot.Builder()
                            .setMaterial("titan")
                            .setGreutate(1400)
                            .setDefect(true)
                            .build(); //un fel de operatie terminala pe stream
        System.out.println(r1.material + " " + r2.material + " " );
    }
}
