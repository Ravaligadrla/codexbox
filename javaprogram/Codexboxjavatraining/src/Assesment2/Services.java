package Assesment2;

import java.util.Scanner;

public class  Services implements PostOfficeApplication {

    Scanner sc = new Scanner(System.in);


    @Override
    public void accountOpenning() {
        System.out.println("you choosen account opening ");
        System.out.println("Enter  account holder  name:  ");
        String accontholder = sc.nextLine();
        System.out.println("Enter your mobile number:   ");
        long Mobilenumber = sc.nextLong();
        System.out.println("Enter your address:    ");
        String address = sc.nextLine();
        System.out.println("enter your mailid:  ");
        String mailid = sc.nextLine();
    }

    @Override
    public void sendingMoney() {
        System.out.println("sending money ");
        System.out.println("Enter from address:  ");
        String fromAddress = sc.nextLine();
        System.out.println("Enter your To address:   ");
        String toAddress = sc.nextLine();
        System.out.println("Enter your denstination:    ");
        int money = sc.nextInt();
        if (money > 12000 && money <= 10000) {
            System.out.println("your tax is 1200 only ");
        }
        if (money > 13000 && money <= 33000) {
            System.out.println(" your tax is 1100");
            if (money > 12000 && money <= 30000) {
                System.out.println(" your tax is 1000");
            } else if (money > 20000) {
                System.out.println("yor tax is 2000");

            }
        }
        System.out.println("Enter your fromaddress:  ");
        System.out.println("ifv your are okay with tax and please type\"okay\"");
        String confirmationMsg = sc.next();
        if (confirmationMsg.equalsIgnoreCase("okay")) {
            System.out.println("your money will process soon..");

        } else {
            System.out.println("your money canclled");
        }
    }

    @Override
    public void sendingLetters() {


        System.out.println("sending Letters ");
        System.out.println("Enter from address:  ");
        String fromAddress = sc.nextLine();
        System.out.println("Enter your To address:   ");
        String toAddress = sc.nextLine();
        System.out.println("Enter your denstination:    ");
        int distance = sc.nextInt();
        if (distance > 1 && distance <= 100) {
            System.out.println("your tax is 100rs only ");
        }
        if (distance > 200 && distance <= 330) {
            System.out.println(" your tax is 110 rs only");
            if (distance > 201 && distance <= 300) {
                System.out.println(" your tax is 150 rs only");
            } else if (distance > 301) {
                System.out.println("yor tax is 500 rs only");

            }
        }
        System.out.println("Enter your fromaddress:  ");
        System.out.println("if your are okay with tax and please type\"okay\"");
        String confirmationMsg = sc.next();
        if (confirmationMsg.equalsIgnoreCase("okay")) {
            System.out.println("your lettres will process soon..");
        } else {
            System.out.println("your process canclled");
        }
    }

    @Override
    public void sendingCourier() {
        System.out.println("sending courirer ");
        System.out.println("Enter from address:  ");
        String fromAddress = sc.nextLine();
        System.out.println("Enter your To address:   ");
        String toAddress = sc.nextLine();
        System.out.println("Enter your denstination:    ");
        int distance = sc.nextInt();
        if (distance > 1 && distance <= 50) {
            System.out.println("your tax is 100rs only ");
        }
        if (distance > 51 && distance <= 100) {
            System.out.println(" your tax is 110 rs only");
            if (distance > 101 && distance <= 150) {
                System.out.println(" your tax is 150 rs only");
            } else if (distance > 151) {
                System.out.println("yor tax is 500 rs only");

                System.out.println("Enter your fromaddress:  ");
                System.out.println("if your are okay with tax and please type\"okay\"");
                String confirmationMsg = sc.next();
                if (confirmationMsg.equalsIgnoreCase("okay")) {
                    System.out.println("your courier will process soon..");
                } else {
                    System.out.println("your courier canclled");
                }
            }
        }
    }
}
