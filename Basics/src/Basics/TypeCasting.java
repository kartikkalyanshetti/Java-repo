package Basics;

import java.util.Scanner;

public class TypeCasting {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TypeCasting converting bigger type(float)into smaller type int explicitally

        int num = (int)(69.67f);
        System.out.println(num);

        //automatic type promotion in expressions :- as converting an int to byte ...byte only has 256 size...so if u put 258 it gives remainder of 258/256

        int a = 258;
        byte b = (byte)(a);
        System.out.println(b);

        // something here same java converts bytes into integers cause it exess the size of byte 
        byte c =40 ;
        byte d = 50 ;
        byte e = 100;
        int z = (c*d)/e;
        System.out.println(z);

        
        // java follows #### UNICODE values ###### i.e. if you write something in hindi ,kannada , tamil,punjabi etc it will print as it is .

        //In Java, there are two types of casting:

        // Widening Casting (automatically) - converting a smaller type to a larger type size
          // byte -> short -> char -> int -> long -> float -> double

       // Narrowing Casting (manually) - converting a larger type to a smaller size type
         // double -> float -> long -> int -> char -> short -> byte

    }
}
