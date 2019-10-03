import java.util.Arrays;
import java.util.Scanner;

public class MeetingFriendsTask {

    public MeetingFriendsTask() {
        Scanner scan = new Scanner (System.in);
        int [] array=new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println((array[2]-array[1])+(array[1]-array[0]));
         
    }
    
}
