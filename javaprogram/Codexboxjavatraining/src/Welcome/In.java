package Welcome;

public interface In {
    static int a = 10;
    String S= "KAJAL";

    void display();

    };


   class test implements In {

    public void display(){
        System.out.println("cake");

        }



       public static void main(String[] args) {
       test t=new test();
       t.display();
           System.out.println(a);

       test t1= new test();
       t1.display();
           System.out.println(S);
       }


}


