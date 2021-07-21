package my_collection;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private E[] backingArray;

    public MyArrayList() {
        backingArray = (E[]) new Object[0];
    }

    @Override
    public boolean add(E element) {
        try {
            backingArray = increaseSize();

            backingArray[backingArray.length - 1] = element;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    private E[] increaseSize() {
        E[] temp = backingArray;
        E[] arrayWithIncreasedSize = (E[]) new Object[backingArray.length + 1];
        System.arraycopy(temp, 0, arrayWithIncreasedSize, 0, temp.length);

        return arrayWithIncreasedSize;
    }

    @Override
    public E get(int index) {
        return backingArray[index];
    }

    @Override
    public int size() {
        return backingArray.length;
    }



    /**
     * This implementation of a set() method does not actually replace the element
     * on a desired index. It just places provided element on provided index
     * and then simply shifts other elements by one index to the right.
     */
    @Override
    public void set(int index, E value) {
        backingArray = increaseSize();

        System.arraycopy(backingArray, index, backingArray, index + 1, backingArray.length - (index + 1));

        backingArray[index] = value;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(backingArray);
    }

    @Override
    public void print() {
        for(E e : this) {
            System.out.println(e);
        }
    }
}
