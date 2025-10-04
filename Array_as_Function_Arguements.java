        /*Array performs pass by reference (The change value in a 
        function also change in main function)*/
public class Array_as_Function_Arguements {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {95,98,97};

        update(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
        //While other variables in java performs pass by value