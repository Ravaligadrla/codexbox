package Assesment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("welcome to postoffice");
        System.out.println(("account opening \"sending Money\" \"sending money\" ,\"sending curier\",\"sending letters\""));
        System.out.println("which service you want from out side");
       int a=scanner.nextInt();
       Services services = new Services();

        switch (a) {
            case 1:
                services.accountOpenning();
                break;
            case 2:
                services.sendingMoney();
                break;
            case 3:
                services.sendingCourier();
                break;
            case 4:
                services.sendingLetters();
                break;
            default:
                System.out.println("you havenot chose any services:");
                System.out.println("please choose any services: ");
                System.out.println("  ");
                break;
        }
        System.out.println("visit again");
        System.out.println("Thank you");
        }
    }

