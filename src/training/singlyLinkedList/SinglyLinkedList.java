package training.singlyLinkedList;

public class SinglyLinkedList<T> {

    private static class Node<T> {
        private T value;
        private Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    private int size;

    // Добавление в начало списка — O(1)
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Добавление в конец списка - О(n)
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> tail = head;
        size++;

        if (tail == null) {
           head = newNode;
           return;
        }

        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
    }

    // Поиск элемента — O(n)
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Удаление первого элемента — O(1)
    public T removeFirst() {
        if (head == null) throw new IllegalArgumentException("List is empty");
        T data = head.value;
        head = head.next;
        size--;
        return data;
    }

    public boolean remove(T value) {
        if (head == null) {
            throw new IllegalArgumentException("Пустой список");
        }

        if (head.value.equals(value)) {
            size--;
            head = head.next;
            return true;
        }

        Node<T> i = head;

        // аналог for i (Node i = head; i.next != null; i = i.next;)
        while (i.next != null) {
            if (i.next.value.equals(value)) {
                i.next = i.next.next;
                size--;
                return true;
            }

            i = i.next;
        }

        return false;
    }

    public boolean remove(int index) {
        if (head == null) {
            throw new IllegalArgumentException("Пустой список");
        }

        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Некорректный индекс");
        }

        if (index == 0) {
            size--;
            head = head.next;
            return true;
        }

        Node<T> thisNode = head;

        for (int i = 0; i < index - 1; i++) {
            thisNode = thisNode.next;
        }

        thisNode.next = thisNode.next.next;
        return true;
    }

    // Получение элемента по индексу — O(n)
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Некорректный индекс");
        }

        Node<T> node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node.value;
    }

    // Размер списка — O(1)
    public int size() {
        return size;
    }

    // Проверка на пустоту — O(1)
    public boolean isEmpty() {
        return head == null;
    }
}
