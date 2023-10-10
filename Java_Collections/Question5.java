import java.util.LinkedList;
public class Question5{
    public static void main(String [] args){
        LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("Apple");
    linkedList.add("Banana");
    linkedList.add("Cherry");
    System.out.println("Original LinkedList: " + linkedList);
    String elementToInsert = "Orange";
    int positionToInsert = 1;
    if (positionToInsert >= 0 && positionToInsert <= linkedList.size()) {
        linkedList.add(positionToInsert, elementToInsert);
        System.out.println("Invalid position. Please provide a valid position within the range [0, " + linkedList.size() + "]");
    }
    System.out.println("modfied LinkedList: " + linkedList);
    }
}