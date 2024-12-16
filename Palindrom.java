import java.util.Scanner;

public class Palindrom {

    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.println("The Given String "+str+" is "+checkPalindrom(str));
    }
    public static String checkPalindrom(String str){
        for(int i=0;i<str.length()/2;i++){
            int j=str.length()-1-i;
            if (Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(j))) {
                return "not a Palindrom";
            }
        }
        return "Palindrom";
    }
}
