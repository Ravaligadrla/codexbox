package immutability;

import Welcome.In;

public class Main {
    public static void main(String[] args){
        ImmutabilityExample immutabilityExample=new ImmutabilityExample("sweety",54," ABC@123",986543267);
        System.out.println(immutabilityExample.getName());
        System.out.println(immutabilityExample.getId());
        System.out.println(immutabilityExample.getMailid());
       // System.out.println(immutabilityExample.getPhnumber());
        String str = immutabilityExample.getPhnumber().toString();
        System.out.println(immutabilityExample.getPhnumber());
  //      System.out.println(Integer.parseInt


    }
}
