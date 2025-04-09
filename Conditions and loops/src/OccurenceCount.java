import java.util.Scanner;

public class OccurenceCount {
    public static void main(String[] args) {
          // Q: Number of Occurence of a number 
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        int countNumber = input.nextInt();
        int count =0 ;  
        while(num>0){
            int rem = (int) (num % 10); //-------> what it does is gives the digit at the end . i.e remainder of the number
            //(int) type casted the long to int 
            if(rem==countNumber){
            count++;
            }
            num = num/10;
        }
        System.out.println("No.of Ocuurences : "+ count);
        input.close();
    }
}
