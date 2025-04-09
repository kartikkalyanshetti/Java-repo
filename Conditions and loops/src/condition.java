import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        Long Salary = input.nextLong();

        if(Salary < 10000){
            System.out.println("You are poor");
    }
        else if (Salary >= 10000 && Salary < 20000){
            System.out.println("You are middle class");
    }
    else{
        System.out.println("You are rich");
    }
    input.close();
    }
}
