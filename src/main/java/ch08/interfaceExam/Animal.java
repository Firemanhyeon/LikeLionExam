package ch08.interfaceExam;

public interface Animal {
    public void speak();

    default void punch() {
        System.out.println(123);
    }
}
