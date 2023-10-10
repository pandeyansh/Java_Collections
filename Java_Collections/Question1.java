import java.util.ArrayList;
public class Question1{
    public static void main(String []args ){
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
         colorsList.add("Green");
          colorsList.add("Blue");
           colorsList.add("Yellow");
           System.out.println("List of Colors");
           for (String color : colorsList){
            System.out.println(color);
           }
    }
}