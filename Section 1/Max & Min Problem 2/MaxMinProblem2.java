import java.util.Scanner;

public class MaxMinProblem2 {

    public MaxMinProblem2() {
        Scanner scan=new Scanner(System.in);
        int [] array = new int [1000001];
        int i=0;
        System.out.println("Please enter your numbers and any letter to stop: ");
        while(scan.hasNextInt()){
            array[i]=scan.nextInt();
            i++;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int j = 0; j < i; j++) {
            if (array[j]>max){
                max=array[j];
            }
            else if (array[j]<min){
                min=array[j];
            }
        }
        System.out.println("Max number= "+max);
        System.out.println("Min number= "+min);
        
    }
    
}
