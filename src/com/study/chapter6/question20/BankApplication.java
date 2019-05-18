package com.study.chapter6.question20;

import java.util.Scanner;

public class BankApplication {

    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;

        while (run)
        {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택 > ");

            int selectNo = scanner.nextInt();

            switch (selectNo)
            {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("선택범위 안에서 다시 입력해주세요");
                    break;
            }
        }

        System.out.println("시스템 종료");

    }

    //계좌 생성
    private static void createAccount()
    {
        System.out.println("-------------------------");
        System.out.println("계좌생성");
        System.out.println("-------------------------");

        System.out.print("게좌번호 : ");
        String ano = scanner.next();

        System.out.print("계좌주 : ");
        String owner = scanner.next();

        System.out.print("초기 입금액 : ");
        int balance = scanner.nextInt();

        Account account = new Account(ano, owner, balance);

        for(int i=0; i<accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = account;
                System.out.println(i +"번째 계좌에 등록되었습니다.");
                break;
            }
        }
        System.out.println("결과 : 계좌가 생성되었습니다.");

    }
    //계좌 목록
    private static void accountList()
    {
        System.out.println("-------------------------");
        System.out.println("계좌목록");
        System.out.println("-------------------------");

        int count = 0;
        for(Account account : accountArray) {
            if(account != null) {
                System.out.println("[" +(count+1) + "] : " + account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
                count++;
            }
        }

        if (count == 0) {
            System.out.println("*계좌가 하나도 등록되어 있지 않습니다. 등록해주세요*");
        }

    }
    //예금
    private static void deposit()
    {
        System.out.println("-------------------------");
        System.out.println("예금");
        System.out.println("-------------------------");

        System.out.print("게좌번호 : ");
        String ano = scanner.next();
        Account findAccount = findAccount(ano);

        if(findAccount == null) {
            System.out.println("해당 계좌번호에 등록되어 있는 계좌는 없습니다. 다시 확인해주세요");
        } else {
            System.out.println("계좌번호 :" + findAccount.getAno());
            System.out.print("입금액 : ");
            int balance = scanner.nextInt();
            findAccount.setBalance((findAccount.getBalance() + balance));

            System.out.println("잔액 :" + findAccount.getBalance());
            System.out.println("결과 : 예금이 성공되었습니다.");
        }
    }

    //출금
    private static void withdraw()
    {
        System.out.println("-------------------------");
        System.out.println("출금");
        System.out.println("-------------------------");

        System.out.print("게좌번호 : ");
        String ano = scanner.next();
        Account findAccount = findAccount(ano);

        if(findAccount == null) {
            System.out.println("해당 계좌번호에 등록되어 있는 계좌는 없습니다. 다시 확인해주세요");
        } else {
            System.out.println("계좌번호 :" + findAccount.getAno());
            System.out.print("출금액 : ");
            int balance = scanner.nextInt();

            if(findAccount.getBalance() < balance ) {
                System.out.println("현재 잔액보다 출금액이 클수 없습니다.");
                return;
            }
            findAccount.setBalance((findAccount.getBalance() - balance));
            System.out.println("잔액 :" + findAccount.getBalance());
            System.out.println("결과 : 출금이 성공되었습니다.");
        }
    }

    private static Account findAccount(String ano)
    {
        Account findAccount = null;

        for(Account account : accountArray) {
            if(account != null && account.getAno().equals(ano)) {
                findAccount = account;
                break;
            }
        }

        return findAccount;
    }
}
