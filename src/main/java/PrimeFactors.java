import java.util.ArrayList;

/**
 * Created by apple on 15-6-4.
 */
public class PrimeFactors {


    public static void main(String[] args){
        System.out.print(generate(30));
    }
    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> primeFators = new ArrayList<Integer>();
        for(Integer integer : getFactors(n)){
            if(isPrime(integer))
                primeFators.add(integer);

        }
        return primeFators;
    }
    public static ArrayList<Integer> getFactors(int n){
        ArrayList<Integer> fators = new ArrayList<Integer>();
        for(int i = 2; i < n ; i++ ){
            if(n%i == 0){
                fators.add(i);
            }
        }
        return fators;
    }
    public static boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n);i++){
            if(n%i == 0){
                flag = false;
                break;
            }

        }
        return flag;
    }
}
