public class MaxSubarraysKadaneSum {
    public static void KadanesAlgo(int numbers[]){
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            CurrSum += numbers[i];
            if(CurrSum < 0){
                CurrSum = 0;
            }
            System.out.println(CurrSum);
            MaxSum = Math.max(CurrSum, MaxSum);
        }
        System.out.println("Maximum Sum of Subarray is : "+MaxSum);
    }
    public static void main(String[] args){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        KadanesAlgo(numbers);
    }
}
