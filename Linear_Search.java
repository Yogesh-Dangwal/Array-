import java.util.*;
public class Linear_Search {

    public static int LinearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        System.out.print("Enter key you want to search : ");
        int key = sc.nextInt();
        int index = LinearSearch(numbers, key);
        if(index == 0){
            System.out.println("Item not found");
        } else{
            System.out.println("Key is at index "+index);
        }
        sc.close();
    }
}