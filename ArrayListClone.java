import java.util.ArrayList;

public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        @SuppressWarnings("unchecked")
        ArrayList<Integer> cloned = (ArrayList<Integer>) list.clone();
        System.out.println("Original: " + list);
        System.out.println("Cloned:   " + cloned);
    }
}
