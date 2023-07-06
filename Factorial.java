import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = sc.nextInt();
        int product = 1;
        for(int i=number; i>0; i--){
            product = product * i;
        }
        System.out.println("Factorial of "+number+ " is "+product);
    }
}