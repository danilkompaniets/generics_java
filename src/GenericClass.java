public class GenericClass<T> {
    private final T first;
    private final T second;

    public GenericClass() {
        first = null;
        second = null;
    }

    public GenericClass(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }
    public T getSecond() {
        return this.second;
    }
}
