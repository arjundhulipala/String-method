

public class StringMethods {
    
    public static void main(String[] args) {

        String name = " Arjun Dhulipala  ";
        String food = "Pizza";
        String sentence = "I love learning Java!";
        String otherName = "Arjun Dhulipala";

        System.out.println("1. Length of name: " + name.length());
        System.out.println("2. First name: " + name.substring(0, 4));
        System.out.println("3. Last name: " + name.substring(5));
        System.out.println("4. Position of pizza: " + sentence.indexOf("pizza"));
        System.out.println("5. Are the names equal? " + name.equals(otherName));
        System.out.println("6. Comparing food and name : " + food.compareTo(name));
        String[] words = sentence.split(" ");
        System.out.println("7. First word after splitting : " + words[0]);
        System.out.println("8. Name in uppercase: " + name.toUpperCase());
        System.out.println("9. Name in lowercase: " + name.toLowerCase());
        System.out.println("10. First character of name: " + name.charAt(0));
        System.out.println("11. Does the sentence contain Java? " + sentence.contains("Java"));
        System.out.println("12. DOes the sentence start with I? " + sentence.startsWith("I"));
        System.out.println("13. Does the sentence end with !? " + sentence.endsWith("!"));
        System.out.println("14. Replace Java with coding: " + sentence.replace("Java", "coding"));
        System.out.println("15. Remove extra spaces: " + name.trim());


    }
}
