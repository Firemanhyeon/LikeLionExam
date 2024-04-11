package ch09.exam;

public class Account {
    String number;
    String name;
    int left;

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLeft() {
        return left;
    }
    public void setLeft(int left) {
        this.left = left;
    }




    public Account(String number, String name, int left) throws MyException{
        this.number = number;
        this.name = name;
        this.left = left;
    }
    public void input(int money){
        left = left+money;
    }
    public void output(int money ) throws MyException {
        if(left-money<0){
            throw new MyException("잔액이 부족합니다");
        }
        left = left-money;
        System.out.println("출금이 완료되었습니다 남은 잔액은 "+getLeft()+" 원 입니다");
    }
    public void checkNumber(String number) throws MyException {
        if(!number.equals(this.number)){
            throw new MyException("잘못된 계좌번호입니다");
        }
    }
}
