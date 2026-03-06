package myCollections;

import java.util.Collection;
import java.util.List;

public class MyArrayList<T> {
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[10];
    }

    public MyArrayList(int capacity) {
        array = new Object[capacity];
    }

    public MyArrayList(Collection<T> collection) {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) array[index];
    }

    //todo add, add по индексу, удаление по объекту и удаление по объекту. Устройство коллекций

    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public void add(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        ensureCapacity();

        for (int i = size; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    public void remove(T element) {
        if (element == null) return;
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j + 1];
                }
                size--;
                i--;
            }
        }
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        array[index] = element;
    }

    public MyArrayList<T> subList(int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex >= size || firstIndex > lastIndex) {
            throw new IndexOutOfBoundsException("first=" + firstIndex + ", last=" + lastIndex + ", size=" + size);
        }

        MyArrayList<T> newList = new MyArrayList<>();

        for (int i = firstIndex; i <= lastIndex; i++) {
            newList.add((T) array[i]);
        }
        return newList;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[size];

        for (int i = 0; i < size; i++) {
            result[i] = (T) array[i];
        }

        return result;
    }

    public void addFirst(T element) {
        add(0, element);
    }

    public void addLast(T element) {
        add(element);
    }

    public int indexOf(Object o) {

        for (int i = 0; i < size; i++) {
            if (o == array[i]) return i;
            if (o.equals(array[i])) return i;
        }

        return -1;
    }

    public int lastIndexOf(Object o) {

            for (int i = size - 1; i >= 0; i--) {
                if (o == array[i]) return i;
                if (o.equals(array[i])) return i;
            }

        return -1;
    }

    public void clear() {
        size = 0;
    }


    private void ensureCapacity() {
        if (size + 1 >= array.length * 0.75) {
            int newCapacity = (int) (array.length * 1.5);
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(", ");
            sb.append(array[i]);
        }

        sb.append(']');
        return sb.toString();
    }

}
//todo переопределить equals и hashcode, indexOf lastindexOf addFirst addLast contains clear sort + (hashMap подкапотом)
