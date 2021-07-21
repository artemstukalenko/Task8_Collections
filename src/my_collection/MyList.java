package my_collection;

public interface MyList<E> extends Iterable <E> {

    boolean add(E e);
    E get (int index);
    int size();
    void set(int index, E value);
    void print();

}
