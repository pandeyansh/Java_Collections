public class Question2 {
    public static void main (String args[]){
        int[] numbers = {1,2,3,4,5};
        int indexToUpdate = 2;
        int newValue = 10;
        if (indexToUpdate>= 0 && indexToUpdate < numbers.length) {
            numbers[indexToUpdate] = newValue;
            System.out.print("Updated array:");
            for (int i = 0 ; i< numbers.length; i++){
                System.out.print(numbers[i] + " ");
            }
            } else {
                System.out.println("Invalid index. Please provide a valid index within the array's bounds.");
            } 
        }
    }