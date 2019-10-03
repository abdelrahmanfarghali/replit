import java.util.Scanner;

public class WayTooLongWordsProblem3 {

    public WayTooLongWordsProblem3() {
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter you word: ");
        String word = scan.next();
        System.out.println(word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1));
        
        ///////////////////////////////////////////////////////////////////////////////////////////////
        
        int array[]=new int [26];
        for (int i = 0; i < word.length(); i++) {
            array[word.charAt(i)-'a']++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println((char)('a'+i) +"  "+array[i]);
        }
    }
    
}
