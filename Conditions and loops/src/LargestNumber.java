public class LargestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b =100;
        int c = 300;
        int max = a;
        if(max<b){
            max=b;
        }
        if (max<c) {
            max = c;
        }
        System.out.println("Largest Number is :"+ max );

        // YE UPER KA TOH TRADITIONAL WAY MAI HO GAYA BUT AS IN USING ALREADY PRESENT CLASS OR FUNC: Math.max(int a,int b);

        int maximum = Math.max(c,Math.max(a, b));
        System.out.println("Largest Number is :"+ maximum);
    }
}
