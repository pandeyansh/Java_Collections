import java.util.ArrayList;
import java.util.List;
public class Question9{
    public static void main (String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        int startIndex = 1;
        int endIndex = 4;
        if (startIndex >= 0 && startIndex < arrayList.size() && endIndex <= arrayList.size()){
            List<Integer> extractedPortion = arrayList.subList(startIndex, endIndex);
            System.out.println("Extracted Portion: " + extractedPortion);
        } else {
            System.out.println("Invalid indices. Please provide valid start and end indices within the ArrayList bounds.");
        }
        }
        }