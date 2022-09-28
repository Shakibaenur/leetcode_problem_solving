public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] acoounts={{1,2,17},{5,5,1},{4,2,48}};
        System.out.println(maximumWealth(acoounts));
    }
    public static int maximumWealth(int[][] accounts) {

        int maxAmount=0;
        for(int[] banks:accounts){
            int sum=0;
            for(int value:banks){
                sum+=value;
            }
            maxAmount=Math.max(maxAmount,sum);
//            if(sum>maxAmount)
//            {
//                maxAmount=sum;
//            }
        }
        return maxAmount;
    }
}
