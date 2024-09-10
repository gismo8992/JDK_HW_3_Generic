package task2;

public class Main {
    public static void main(String[] args) {
        Integer [] arr1 = {3, 2, 55, 2};
        Integer [] arr2 = {3, 2, 55, 2};
        Integer [] arr3 = {3, 2, 55, 2, 1};
        Integer [] arr4 = {3, 91, 55, 2, 12};
        System.out.println(ArraysComparing.compareArrays(arr1, arr2));
        System.out.println(ArraysComparing.compareArrays(arr1, arr3));
        System.out.println(ArraysComparing.compareArrays(arr1, arr4));
        System.out.println(ArraysComparing.compareArrays(arr2, arr4));
    }
}
