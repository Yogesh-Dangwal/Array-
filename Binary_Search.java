public class Binary_Search {

    public static int BinarySearch(int number[], int key){
        int start = 0, end = number.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(number[mid] == key){
                return mid;
            }
            else if(number[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,5,6,7,8,10,12,15,18,20};
        int key = 20;
        int index = BinarySearch(number,key);
        if(index == -1){
            System.out.println("Item not found");
        } else{
            System.out.println("Key is at index "+index);
        }
    }
}
