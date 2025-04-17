import java.util.ArrayList;
import java.util.Arrays;

public class Array_List {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(2);
        System.out.println("index Of:" + list.indexOf(20));
        list.add(0, 100);
        System.out.println(list.contains(100));
        System.out.println("Size : " + list.size() + " elements");
        System.out.println(list);

        Object[] list1 = list.toArray();
        System.out.println(Arrays.toString(list1));
    }
}
