public class Largest_Number_in_Array {

    public static int Largest_Number(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {2,4,86,454,5422,1255,566,5959,59,5689 ,95,659};
        int largest = Largest_Number(number);
        System.out.println("Largest number is : "+largest);
    }
}
