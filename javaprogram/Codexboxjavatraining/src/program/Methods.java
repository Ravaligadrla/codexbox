package program;

public class Methods {
    int  sum = 0;

    public int addTwoint(int a, int b) {
         sum=a+b;
         return sum;
    }
}
   class gfg {
       public  static void main(String[] args) {

           Methods obj=new Methods();

           int s= obj.addTwoint(10,3);

           System.out.println("add of two numbers:"+s);







       }
   }






