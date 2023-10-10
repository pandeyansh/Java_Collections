import java.util.HashMap;
import java.util.Map;
public class Question11 {
    private static Map<String, Integer> cache = new HashMap<>();
    public static int countUniqueCharacters(String input) {
        if (cache.containsKey(input)) {
            return cache.get(input);
        }
        java.util.HashSet<Character> uniqueCharacters = new java.util.HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            uniqueCharacters.add(c);
        }
        int uniqueCount = uniqueCharacters.size();
        cache.put(input, uniqueCount);
        return uniqueCount;
    }
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "OpenAI";
        String str3 = "Hello, World!";
        int uniqueCount1 = countUniqueCharacters(str1);
        int uniqueCount2 = countUniqueCharacters(str2);
        int uniqueCount3 = countUniqueCharacters(str3); 
        System.out.println("Unique characters in str1: " + uniqueCount1); 
        System.out.println("Unique characters in str2: " + uniqueCount2); 
        System.out.println("Unique characters in str3: " + uniqueCount3);
    }
}