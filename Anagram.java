import java.util.*;
class Anagram{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the 1st String: ");
        String str1 = sc.nextLine().trim();
        System.out.print("Enter the 2st String: ");
        String str2 = sc.nextLine().trim();
        System.out.println("The given String one and two is "+checkAnagram(str1,str2));
    }
    public static String checkAnagram(String s1,String s2){

        s1 = s1.replaceAll(" ", "").toLowerCase();
        s2 = s2.replaceAll(" ", "").toLowerCase();


        if (s1.length()!=s2.length()) {
            return "Not an Anagram";
        }
        
        char[] c1=s1.toLowerCase().toCharArray();
        char[] c2=s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        
        return Arrays.equals(c1, c2)?"Anagram":"Not an Anagram";
    }
}