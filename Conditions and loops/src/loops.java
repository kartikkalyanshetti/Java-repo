import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //for loop
        //Q1. Print numbers from 1 to 5
        /// when to use :  when you know the loops limit 
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print( i +" ");
        }
       in.close();
//------------------------------------------------------------------------------------------------------------
    // while loop 
    // when to use it  : When you dont know how many loops it will run
    // Q2 : same in while loop Print numbers from 1 to 5

    Scanner inPut = new Scanner(System.in);
    int no = inPut.nextInt();
    int i = 1;
    while(i<=no){
        System.out.print(i+"G ");
        i++;
    }
    inPut.close();

//------------------------------------------------------------------------------------------------------------

// Do while loop 

// It executes atleast once 
int j = 1;
do {
    System.out.println("Hello World");
}
while(j!=1);

    }


}

