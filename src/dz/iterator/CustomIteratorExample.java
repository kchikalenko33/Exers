package dz.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIteratorExample implements Iterator<String> {
    private String[] elements;
    private int currentIndex;

    public CustomIteratorExample(String[] elements) {
        this.elements = elements;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.length;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return elements[currentIndex++];
        } else {
            throw new NoSuchElementException();
        }
    }

    // Опционально: реализация метода remove()
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Удаление не поддерживается");
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        CustomIteratorExample customIterator = new CustomIteratorExample(data);

        while (customIterator.hasNext()) {
            System.out.println(customIterator.next());
        }
    }
}
