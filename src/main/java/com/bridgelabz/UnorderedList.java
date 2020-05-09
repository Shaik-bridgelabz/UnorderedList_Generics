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

    public int size() {
        return size;
    }

}
