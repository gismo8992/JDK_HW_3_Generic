package task2;
    /*
2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и
содержать элементы одного типа по парно по индексам.
     */

public class ArraysComparing {
    public <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if(arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}
