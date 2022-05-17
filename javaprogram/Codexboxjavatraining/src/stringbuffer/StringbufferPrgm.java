package stringbuffer;

public class StringbufferPrgm {
    public static void main(String[] args) {

        StringBuffer Sb1= new StringBuffer("ravali");

        StringBuffer Sb2= new StringBuffer("java");
        System.out.println(Sb1);

        System.out.println(Sb1.length());

       System.out.println(Sb1.indexOf("v"));

       System.out.println(Sb1.append("girl"));

       // System.out.println(Sb1.delete(3,6));

        System.out.println(Sb2.length());

        System.out.println(Sb2.append("coaching"));

        System.out.println(Sb1.lastIndexOf(Sb1.substring(0,4)));

   //  StringBuffer Sb3= new StringBuffer();

       //add sb1 value and sb2 values
        System.out.println(Sb1 + " "+ Sb2);

        System.out.println(Sb1.replace(0,10,"ROSE"));
        // replace sb1 value
        System.out.println("Enter capcity value:"+ Sb1.capacity());
 // reverse method
       // System.out.println(Sb2.reverse());

        System.out.println(Sb2.charAt(10));
         //replace
        System.out.println();



}
}