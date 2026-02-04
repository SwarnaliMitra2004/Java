/*Write a method that swaps two elements in an ArrayList, given 
their indices. */

import java.util.ArrayList;

public class ArrayListSwapDemo {

    // Method to swap elements at given indices
    static <T> void swapElements(ArrayList<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Before swap: " + list);

        swapElements(list, 1, 3);

        System.out.println("After swap: " + list);
    }
}
