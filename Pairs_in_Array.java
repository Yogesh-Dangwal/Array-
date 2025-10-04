public class Pairs_in_Array {

    public static void ArrayPairs(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+number[i]+","+number[j]+")"+" ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        int number[] = {2,3,4,5,6};
        ArrayPairs(number);
     }
}
