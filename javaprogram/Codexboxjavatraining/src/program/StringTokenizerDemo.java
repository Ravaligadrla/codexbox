package program;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str = "geekss@for@geeks";
        String[] arrOfStr = str.split("@");
        for (String a: arrOfStr) {
            System.out.println(a);
        }
    }
}
/*        StringTokenizer st=new StringTokenizer("my name is KAJAL"," ," );
    //    System.out.println("NextToken is:"+st.nextToken());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            System.out.println(st.countTokens());
            System.out.println(st.nextElement());
            System.out.println(st.hasMoreTokens());
            System.out.println(st.hashCode());
            System.out.println(st.toString());

        }

    }
}
*/
