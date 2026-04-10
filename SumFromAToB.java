import java.util.Scanner;

public class SumFromAToB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println("Sum from "+a+" to "+b+" is: "+sum);
        sc.close();
    }    
}
