import java.util.HashMap;

public class RomanToInteger {
    public static void main(String args[]){
        String input="MCMXCIV";
        System.out.println(romanToInt(input));

    }

    private static int romanToInt(String input) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=map.get(input.charAt(input.length()-1));// the last character value
        for(int i=input.length()-1;i>0;i--){
            if(map.get(input.charAt(i))<=map.get(input.charAt(i-1))){
                result+=map.get(input.charAt(i-1));//if right side is lesser then left side value
            }else{
                result-=map.get(input.charAt(i-1));
            }
        }
        return  result;
    }
}
