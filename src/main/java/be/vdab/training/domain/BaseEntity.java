package be.vdab.training.domain;

public class BaseEntity {
    private static int counter;
    private int id;

    public BaseEntity() {
        counter += 1;
        id = counter;
    }

    public int getId() {
        return id;
    }

    public static void resetCounter() {
        counter = 0;
    }
}
