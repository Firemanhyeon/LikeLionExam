package ch02;

public class Dog {
    //접근제한자 생략가능한데 생략하면 패키지영역에서만 접근가능하다.
    //필드
    public String breed;
    public int age;
    public String color;

    //메소드
    //접근제한자 리턴타입 메소드명(매개변수들){구현}

    void bark(){
        System.out.println("월월");
    }
    void displayInfo(){
        System.out.println("displayinfo");
    }

}
