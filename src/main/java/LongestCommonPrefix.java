public class LongestCommonPrefix {
    public static void main(String args[]) {
        String[] strs = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String pref = strs[0];
        for (String s : strs) {
            int len = Math.min(pref.length(), s.length());// minimum length between two string e.g= str1=4, str2=5, minimum=4
            for(int i = len; i >= 0; i--){
                System.out.println("s.substring(0,i) :"+s.substring(0,i)+" pref.indexOf(s.substring(0,i)) "+pref.indexOf(s.substring(0,i)));
                if(pref.indexOf(s.substring(0,i))==0)//a.indexof taker a string and matches with a if any substring exist it returns 0 otherwise -1
                {
                    pref = s.substring(0, i);
                    break;
                }
            }

        }
        return pref;

    }
}
