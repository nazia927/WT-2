import java.util.Scanner;

public class Main{

    public static int calculation(String text, String pat) //func
    {
        if(text.contains(pat)==true)
        {
            char temp1[]=text.toCharArray();
            char temp2[]=pat.toCharArray();
            int[] t1=new int [500];
            int temp;
            for (int i=0;i<temp1.length;i++){
                temp=(int) temp1[i];
                t1[temp]+=1;
            }
            int min=30000000;
            for (int i=0;i<temp2.length;i++){
                temp=(int) temp2[i];
                if (t1[temp]<min){
                    min=t1[temp];
                }
            }

            return min;
        }
        else{
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String s1 = scan.next();
        System.out.println("Enter Pattern");
        String s2 = scan.next();
        int result = calculation(s1,s2);
        System.out.println(result);

    }
}