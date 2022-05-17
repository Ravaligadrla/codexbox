package Packagename1;


import Packagename.program;

import java.util.ArrayList;
import java.util.List;


public class StudentClass{
    public static void main(String[] args) {
        program s1=new program();

        s1.setName("ravali");
        s1.setRollnum(2);
        s1.setSalary(25000);

        program  s2=new program();
        s2.setName("renu");
        s2.setRollnum(3);
        s2.setSalary(20000);

        program s3=new program();
        s3.setName("sona");
        s3.setRollnum(4);
        s3.setSalary(3000);

        List<program> p= new ArrayList<>();
         p.add(s1);
         p.add(s2);
         p.add(s3);

         for(int i =0;i <p.size();i++){
             System.out.println(p.get(i).getName());
             System.out.println(p.get(i).getRollnum());
             System.out.println(p.get(i).getSalary());

             for (program r : p );
                   {
                       System.out.println(s1.getName());
                       System.out.println(s2.getRollnum());
                       System.out.println(s3.getSalary());

             }




        }




    }

    ;

}
