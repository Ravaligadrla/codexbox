package Assessment1;

import com.sun.org.apache.bcel.internal.generic.SWAP;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DataType {
    public static void main(String[] args) {
        int i = 5 , j= 8;
        System.out.println(i+j);
        int i1= 10,j1 = 20;
        System.out.println("before swap:"+i);
        int  k =0;
        char a = 'p',b= 'r';
        char  x =0;
        float A = 1.0f,B = 1.5f;
        float Y = 1;
        double d = 22.0,e=55.0;
        double D;
        System.out.println("Enter the value of i and j");
        System.out.println("After swap value:"+i);
        System.out.println("After swap value:"+j);
        //swap int
        k = i;
        i= j;
        j=k;i1=i;
        System.out.println("before swap:"+i1);
        System.out.println("before swap:"+i);
        System.out.println("before swap:"+j);
        // swape char
        System.out.println("before swap: "+b);
         x=a; a=b;b=x;  // swap b char
        System.out.println("after swap:"+b);
    //USING FLOAT SWAP
        System.out.println("before swap:"+A);
        Y=A; A= B; B=Y;
        System.out.println("after swap:"+A);
//Swap double values
        System.out.println("before swap:"+d);
        D=e; e=d;d=D;
        System.out.println("after swap:"+d);
//swap byte numbers
          byte b1= 8,b2= 2;
        byte Z;
        System.out.println("before swap:"+b1);
        Z = b1; b1=b2; b2=Z;
                System.out.println("after swap:"+b1);
//swap boolean
       boolean T= true,T1=false;
         boolean M;
        System.out.println("before swap:"+ T1);
      M=T1; T1=T;M=T1;
        System.out.println("after swap:"+T1);
}
}