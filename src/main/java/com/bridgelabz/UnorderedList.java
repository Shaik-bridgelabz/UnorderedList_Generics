package com.bridgelabz;

public class UnorderedList<T extends Comparable> {

    class Node<T extends Comparable> {
        private Node next;
        private T data;
        private T[] data1;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public UnorderedList() {
    }

    public UnorderedList(T data) {
        head = new Node(data);
        head.next = tail;
        size++;
    }

    public void add(T data) throws UnorderedListException {
        try {
            if (data.equals(""))
                throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_EMPTY, "Cannot add empty value");
            Node n = new Node(data);
            if (head == null) {
                head = n;
                size++;
            } else {
                Node node = head;
                while (node.next != null) {
                    node = node.next;
                }
                node.next = n;
                size++;
            }
        } catch (NullPointerException e) {
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_NULL, "Cannot add Null Value");
        }

    }

    public void remove(T data) throws UnorderedListException {
        try {
            if (data.equals(""))
                throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_EMPTY, "Cannot Delete empty value");

            Node n = head;
            Node prev = null;
            if (head.data.equals(data)) {
                head = head.next;
                size -= 1;
                return;
            }
            while (head.data != data) {
                prev = n;
                n = n.next;
            }
            n = n.next;
            prev.next = n;
            n = null;
            size -= 1;
        } catch (NullPointerException e) {
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_NULL, "Cannot Delete Null Value");
        }
    }

    public boolean search(T data) throws UnorderedListException {
        try {
            if (data.equals(""))
                throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_EMPTY, "Cannot Delete empty value");
            Node n = head;
            while (n.next != null) {
                if (n.data.equals(data)) {
                    return true;
                }
                n = n.next;
            }
            return false;
        } catch (NullPointerException e) {
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_NULL, "Cannot add Null Value");
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void append(T... data) throws UnorderedListException {
        try {
            if (data.equals(""))
                throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_EMPTY, "Cannot add empty value");
            for (int i = 0; i < data.length; i++) {
                Node n = new Node(data[i]);
                if (head == null) {
                    head = n;
                    size++;
                } else {
                    Node node = head;
                    while (node.next != null) {
                        node = node.next;
                    }
                    node.next = n;
                    size++;
                }
            }
        } catch (NullPointerException e) {
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_NULL, "Cannot add Null Value");
        }
    }

    public int index(T item) throws UnorderedListException {
        try {
            if (item.equals(""))
                throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_EMPTY, "Cannot add empty value");
            int index = 0;
            Node n = head;
            while (!n.data.equals(item)) {
                n = n.next;
                index++;
            }
            return index;
        } catch (NullPointerException e) {
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_NULL, "Cannot add Null Value");
        }
    }

    public <T extends Comparable> void insert(int pos, T item) throws IndexOutOfBoundsException {
        if (pos > size || pos < 0) {
            throw new IndexOutOfBoundsException();
        }
        int index = 0;
        Node n = head;
        Node node = new Node(item);
        if (pos == 0) {
            node.next = head;
            head = node;
        } else {
            while (index != pos) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
        size++;
    }

    public T pop() throws UnorderedListException {
        try {
            if (size == 0)
                throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_EMPTY, "Cannot pop empty list");
            Node n = head;
            if (size == 1) {
                head = head.next;
                size--;
                return (T) n.data;
            }
            while (n.next != null) {
                n = n.next;
            }
            T ret = (T) n.data;
            n = n.next;
            size -= 1;
            return ret;
        } catch (NullPointerException e) {
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_NULL, "Cannot pop Null Value");
        }
    }

    public Comparable pop(int pos) throws UnorderedListException {
        if(pos>size)
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_WRONG_POS, "Pos must be less than list size");
        int index = 0;
        Node n = head;
        if (pos == 0) {
            head = head.next;
            size--;
            return n.data;
        }
        Node prev = null;
        while (index != pos) {
            prev = n;
            n = n.next;
            index++;
        }
        prev.next = n.next;
        size -= 1;
        return n.data;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("[ ");
        Node node = head;
        while (node != null) {
            s.append(node.data);
            node = node.next;
            s.append(",");
        }
        s.append(" ]");
        return s.toString();
    }

    public void show() {
        System.out.println(toString());
    }
}