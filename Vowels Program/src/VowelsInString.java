import java.util.Scanner;

public class VowelsInString {
    public static boolean hasChar(String str, char a)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==a)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(hasChar(str,'a') && hasChar(str,'e') && hasChar(str,'i') && hasChar(str,'o') && hasChar(str,'u')){
            System.out.println("All vowels are present in the word");
        }
        else {
            System.out.println("Not all vowels are present in the word");
        }
    }
}
