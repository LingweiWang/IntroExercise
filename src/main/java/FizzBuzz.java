/**
 * Created by apple on 15-6-4.
 */
public class FizzBuzz {


    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            converNumberToFizzBuzz(i);
        }
    }

    public static void converNumberToFizzBuzz(int number){
        if(isDivisibleByThree(number) && isDivisibleByFive(number))
            System.out.println("FizzBuzz");
        else if (isDivisibleByThree(number))
            System.out.println("Fizz");
        else if (isDivisibleByFive(number))
            System.out.println("Buzz");
        else System.out.println(number);
    }
    public static boolean isDivisibleByThree(int number){

        return number%3 == 0;
    }
    public static boolean isDivisibleByFive(int number){
        return number%5 == 0;
    }
}
