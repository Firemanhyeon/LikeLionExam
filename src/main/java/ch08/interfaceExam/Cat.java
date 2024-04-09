package ch08.interfaceExam;

public class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("야옹");
    }
    @Override
    public void punch(){
        System.out.println("냥냥펀치");
    }
}
