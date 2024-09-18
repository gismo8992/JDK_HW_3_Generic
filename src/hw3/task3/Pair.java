package hw3.task3;

public class Pair <T, U>{
    private T firstValue;
    private U secondValue;

    public Pair(T firstValue, U secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirst() {
        return firstValue;
    }
    public U getSecond() {
        return secondValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                '}';
    }
}
