import java.util.TreeSet;
public class Question8{
    public static void main (String[] args){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        System.out.println("Original treeSet: " + treeSet);
        String firstElement = treeSet.pollFirst();
        if (firstElement !=null){
            System.out.println("Removed first element: " +firstElement);
        } else {
            System.out.println("The TreeSet is empty.");
        }
            System.out.println("Modified TreeSet: " + treeSet);
        }
    }