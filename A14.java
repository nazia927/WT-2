import java.util.*;
public class Main {

    public static void printing(boolean final_answer)
    {
        if(final_answer==true)
            System.out.println("Anagrams!");
        else
            System.out.println("Not Anarams!");
    }
    static boolean areAnagram(String str1, String str2) {
        if (str1.length()!=str2.length()) {
            return false;
        }
        char tempArray[]=str1.toCharArray();
        char tempArray2[]=str2.toCharArray();
        Arrays.sort(tempArray);
        Arrays.sort(tempArray2);
        return Arrays.equals(tempArray2,tempArray);
    }
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1:");
        s1=sc.nextLine();
        System.out.println("Enter string 2:");
        s2=sc.nextLine();
        boolean answer=areAnagram(s1,s2);
        printing(answer);
    }

}