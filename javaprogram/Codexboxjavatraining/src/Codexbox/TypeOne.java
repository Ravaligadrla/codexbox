package Codexbox;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import sun.applet.Main;

public class TypeOne
{
    public static void main(String[]args) {

        String S ="cake";
       int  S1= S.length()-1;
        System.out.println(S1);
      for(int i =0; i<S.length();i++){
          System.out.println(S.charAt(S1-1));
}
 }
}