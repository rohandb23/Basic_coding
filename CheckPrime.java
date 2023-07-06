import java.util.Scanner;
class CheckPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = sc.nextInt();
        int flag = 0;
        if(number == 1){
            System.out.println(number+ " is not prime number !!");
        }
        else{
            for(int i=2; i<number; i++){
                if(number%i==0){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1){
            System.out.println(number+ " is not prime number !!");
        }
        else{
            System.out.println(number+ " is a prime number !!");
        }
    }
}
