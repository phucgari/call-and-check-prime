import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter limit number ");
        Scanner s=new Scanner(System.in);
        int limit=s.nextInt();
        for (int i = 2; i <=limit ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num){
        boolean result= true;
        if(num<2)return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                result=false;
            }
        }
        return result;
    };
}