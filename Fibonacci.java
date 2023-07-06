import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper limit : ");
        int number = sc.nextInt();
        int termOne=0, termTwo=1;
        int addition = 0;
        System.out.print(termOne+" "+termTwo);
        for(int i=2; i<number; i++){
            addition = termOne + termTwo;
            System.out.print(" "+addition);
            termOne=termTwo;
            termTwo=addition;
        }
    }
}
