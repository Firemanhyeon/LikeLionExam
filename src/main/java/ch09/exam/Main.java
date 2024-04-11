package ch09.exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Account ac = new Account("1111" , "정호현" , 10000);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.입금하기 2.출금하기");
            int bank = sc.nextInt();
            if(bank==1){
                System.out.println("입금하실 계좌번호를 입력해주세요");
                String num = sc.next();
                try{
                    ac.checkNumber(num);
                }catch (MyException e){
                    System.out.println("오류");
                    System.out.println(e.getMessage());
                    continue;
                }
                System.out.println("입금할 금액을 입력하세요");
                int money = sc.nextInt();
                ac.input(money);
                System.out.println("입금 완료되었습니다 남은 잔액은 "+ac.getLeft()+" 원 입니다");
                continue;
            }
            if (bank==2) {
                System.out.println("출금하실 계좌번호를 입력해주세요");
                String num = sc.next();
                try{
                    ac.checkNumber(num);

                }catch (MyException e){
                    System.out.println("오류");
                    System.out.println(e.getMessage());
                    continue;
                }

                System.out.println("출금할 금액을 입력하세요");
                int money = sc.nextInt();
                try{
                    ac.output(money);

                }catch (MyException e){
                    System.out.println("오류");
                    System.out.println(e.getMessage());
                }


            }else{
                System.out.println("잘못입력하셨습니다 다시 입력하세요");
            }
        }
    }
}
