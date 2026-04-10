import java.util.Scanner;

public class ProductFromAToB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        int mul=1;
        for(int i=a;i<=b;i++){
            mul=mul*i;
        }
        System.out.println("Product from "+a+" to "+b+" is:"+mul);
        sc.close();
    }    
}
