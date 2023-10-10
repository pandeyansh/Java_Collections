import java.util.LinkedList;
public class Question10{
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        System.out.println("Original linkedList: " + linkedList);
        String elementToAppend = "Date";
        linkedList.addLast(elementToAppend);
        System.out.println("LinkedList after appending: " + linkedList);
    }
}