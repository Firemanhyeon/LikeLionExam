package ch14.lamda;

public class FinalVariableExam {
    public static void main(String[] args) {
         int x = 10;
        System.out.println("람다에서 파이널로 사용");

        Runnable r = ()->{
            System.out.println(x);
        };
        //x=20;

        r.run();
    }
}
