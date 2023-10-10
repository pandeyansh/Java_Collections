import java.util.HashSet;
public class Question6{
    public static void main (String[] args){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println("Original HashSet: " + hashSet);
        hashSet.clear();
        System.out.println("Empty HashSet: " + hashSet); 
    }
}