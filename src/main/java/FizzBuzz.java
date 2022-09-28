import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> resultList=fizzBuzz(3);
        for(String s:resultList){
            System.out.println(s);
        }
    }
    public static List<String> fizzBuzz(int n) {
        List<String> resultList=new ArrayList<>(n);
        for(int i=1;i<=n;i++){
            boolean isDivisable3= i%3==0;
            boolean isDivisable5= i%5==0;
            if(isDivisable3 && isDivisable5){
                resultList.add("FizzBuzz");
            }else if(isDivisable3){
                resultList.add("Fizz");
            }else if(isDivisable5){
                resultList.add("Buzz");
            }else {
                resultList.add(String.valueOf(i));
            }
        }
        return resultList;
    }
}
