package ch02;

public class Test {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        for(int i=0; i<num.length/2;i++){
            int temp = num[i];
            num[i] = num[num.length-i-1];
            num[num.length-i-1] = temp;
        }
    }
}
