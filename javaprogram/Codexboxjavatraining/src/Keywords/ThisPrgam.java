package Keywords;

import java.util.Enumeration;

public class ThisPrgam {
    private int a, b;
    char c;

    private ThisPrgam(int i, int j, char s) {
        this.a = i;
        this.b = j;
         this.c= s;
    }

 //   private ThisPrgam(char s) {
  //      this.c = s;
 //   }


    private ThisPrgam(int i) {
        this(i, i);
    }

    private ThisPrgam() {
        this(0);

    }

    public ThisPrgam(int i, int i1)
    {
        this.a = i;
        this.b = i1;
        this.c = c;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) {
        ThisPrgam T= new ThisPrgam(2,3,'k');
        ThisPrgam T1 =new ThisPrgam();
        System.out.println(T.a);
        System.out.println(T.b);
        System.out.println(T.c);
    }
}
   /* public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getS() {
        return S;
    }

    public void setS(String s) {
        S = s;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    String S;
    char c;

    public static void main(String[] args) {

        ThisPrgam k= new ThisPrgam();
        k.setA(10);
        k.setB(33);
        k.getC();


        System.out.println(k.a);
        System.out.println(k.b);
        System.out.println(k.getC());
    }
  */