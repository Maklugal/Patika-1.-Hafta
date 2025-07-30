package Patika_3_Week.Odevler;

public class GenericMetodExample {

    // Generic metot
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        // Yeni satıra geçmek için
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stArray = {"Java", "Generic", "Ödev"};


        // 1 2 3 4 5
        printArray(intArray);
        // Java Generic Ödev
        printArray(stArray);

    }
}
