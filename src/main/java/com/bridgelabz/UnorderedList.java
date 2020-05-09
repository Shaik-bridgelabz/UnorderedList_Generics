package com.bridgelabz;

public class UnorderedList<T extends Comparable> {

    class Node<T extends Comparable> {
        private Node next;
        private T data;

        Node(T data){
            this.data=data;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public UnorderedList() {
    }

    public UnorderedList(T data) {
        head=new Node(data);
        head.next=tail;
        size++;
    }

    public void add(T data) throws UnorderedListException {
        try {
            if(data.equals(""))
                throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_EMPTY,"Cannot add empty value");
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
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_NULL,"Cannot add Null Value");
        }

    }

    public void remove(T data) throws UnorderedListException {
        try {
            if(data.equals(""))
                throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_EMPTY,"Cannot Delete empty value");

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
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_NULL,"Cannot Delete Null Value");
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
            throw new UnorderedListException(UnorderedListException.ExceptionType.ENTERED_NULL,"Cannot add Null Value");
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

}
