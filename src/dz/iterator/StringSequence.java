package dz.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringSequence implements Iterable<String> {
    private final String[] elements;

    public StringSequence(String[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<String> iterator() {
        return new StringIterator();
    }

    private class StringIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < elements.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[index++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Удаление не поддерживается");
        }
    }

    public static void main(String[] args) {
        StringSequence sequence = new StringSequence(
                new String[]{"apple", "banana", "cherry"}
        );

        // Использование в цикле for-each
        for (String fruit : sequence) {
            System.out.println(fruit);
        }
    }
}
