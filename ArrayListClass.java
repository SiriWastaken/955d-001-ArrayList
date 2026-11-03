import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // So this adds something to the end of an arraylist
        // You can also add a second parameter for WHERE in the arraylist its inserted.. thats cool ig
        list.add("Apple"); 
        list.add("Google");
        list.add("Anthropic");

        // To REMOVE from a list.. do you pop? 
        // Nope! It's called remove()
        list.remove("Anthropic"); 
        // ^ Removes ALL instances of the term


        // Getters and setters also exist in ArrayLists
        list.get(0); // Apple
        list.set(1, "Microsoft"); // List becomes Apple, Microsoft, Anthropic; indexes just like a normal array would

        System.out.println(list); 
    }
}
