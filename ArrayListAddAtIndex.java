import java.util.ArrayList;

public class ArrayListAddAtIndex {
    public static void main(String[] args) {
        // 3) Add an element to a specific index in an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Ash");
        list.add("Ran");
        System.out.println("Old array list: " + list);

        list.add(1, "Inserted");
        System.out.println("New array list: " + list);
    }
}
