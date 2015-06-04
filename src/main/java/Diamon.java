import java.util.ArrayList;

/**
 * Created by apple on 15-6-4.
 */
public class Diamon {
    public static void main(String[] args){

       // printIsosceles(5);
       // print2(5);
        print3(5,"Bill");
    }
    public static ArrayList<String> printIsosceles(int n){
        ArrayList<String> strings = new ArrayList<String>();
        for(int i = 1 ; i <= n; i++){
            String str = "";
            for( int k = 0; k < n-i; k++)
                str = str + " ";
            for( int m = 0; m < 2*i-1; m++)
                str = str + "*";
            for(int q = 0 ; q < n-i; q++)
                str = str + " ";
            strings.add(str);
        }
//        for(String string : strings){
//            System.out.println(string);
//        }
        return strings;
    }
    public static ArrayList<String> print2(int n){
        ArrayList<String> strings = new ArrayList<String>();
        strings = printIsosceles(n);
        for(int i = printIsosceles(n).size()-2 ; i>= 0 ;i--){
            strings.add(printIsosceles(n).get(i));
        }
        for(String string : strings){
            System.out.println(string);
        }
        return strings;

    }
    public static ArrayList<String> print3(int n,String name){
        ArrayList<String> strings = print2(n);
        if(name.length() < 2*n-1){
            for(int k = 0; k <= (2*n-1-name.length())/2; k++){
                name = " "+name;
            }

        }
        strings.set(n-1,name);
        for(String string : strings){
            System.out.println(string);
        }
        return strings;
    }
}
