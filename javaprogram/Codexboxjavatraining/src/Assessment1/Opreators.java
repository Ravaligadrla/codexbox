package Assessment1;

public class Opreators {
    public static void main(String[] args) {
        int  a = 10; int b= 20;
        char op = '+';
        switch (op){
            case '+':
                System.out.println(a+b);
                case '-':
                    System.out.println(a-b);
                        case '*':
                            System.out.println(a*b);
                            break;
                            case'=':
                                System.out.println(a=b);
                             case'/':
                                 System.out.println(a/b);
                             case'%' :
                                 System.out.println(a%b);


                        }
                }



    public static class TwoDimentionalArray {

        public static void main(String[] args) {
            int r = 10;

            // Declaring 2-D array with 5 rows
            int arr[][] = new int[r][];

            // Creating a 2D array such that first row
            // has 1 element, second row has two
            // elements and so on.
            for (int i = 0; i < arr.length; i++)
                arr[i] = new int[i + 1];

            // Initializing array
            int count = 0;
            for (int i = 0; i < arr.length; i++)
                for (int j = 0; j < arr[i].length; j++)
                    arr[i][j] = count++;

            // Displaying the values of 2D Jagged array
            System.out.println("Contents of 2D Jagged Array");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
    }
}

       /* int num1=26,num2=30;
        int sum = num1+num2;
        System.out.println("number one is ="+num1);
        System.out.println("number two is ="+num2);
        System.out.println("Addition of two numbers="+sum);
    }
}
*/

