package ch05;

public class RecursiveTest {
    //재귀함수
    //n을 입력받아 1~n 까지 출력하고싶다
    static void recursive(int n){
        if(n>0){
            recursive(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        recursive(5);
    }
}
