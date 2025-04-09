import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        // if i want to check the case of first char in a string input :


        // trim() :- removes the extra space 
        // charAt(0) :- keeps the char at that certain index 
        // input.next() :- while taking an input as a string . 
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        System.out.println(ch);
        if (ch>='a' && ch<='z'){
            System.out.println("smallcase");
        }
        else{
            System.out.println("capital");
        }
        // OR LIKE THIS 
        String word = "Kartik";
        System.out.println(word.charAt(2));
        input.close();




    }
}
