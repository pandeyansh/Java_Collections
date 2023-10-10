import java.util.ArrayList;
import java.util.Collections;
public class Question4{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Fig");
           System.out.println("Original ArrayuList: " + arrayList);
           Collections.reverse(arrayList);
           System.out.println("Reversed ArrayList: " + arrayList);
    }
}