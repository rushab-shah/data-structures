package LinkedList;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    Node<T> head, tail;
    int size = 0;

    private class Node<T> {
        T data;
        Node<T> prev,next;

        public Node(T data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    //TODO methods:  remove, find index, clear, addAt, removeAt,

    public void add(T data) {
        if(this.isEmpty()) {
            Node<T> node = new Node<T>(data,null,null);
            this.head = this.tail = node;
        } else {
            Node<T> node = new Node<T>(data,tail,null);
            tail.next = node;
            tail = node;
        }
        this.size++;
    }

    public boolean isEmpty() {
        if(this.size==0) {
            return true;
        }
        return false;
    }

    // Remove by value
    public void remove(T data) {
        if(!this.isEmpty()) {
            Node<T> pointer = head;
            while (pointer!=null) {
                if(pointer.data.equals(data)) {
                    // Reassign pointers
                    pointer.prev.next = pointer.next;
                    pointer.next.prev = pointer.prev;
                    pointer = null;
                    this.size--;
                    return;
                } else {
                    pointer = pointer.next;
                }
            }
            throw new RuntimeException("Element not Found");
        } else {
            throw new RuntimeException("List is empty");
        }
    }

    public T peekFirst() {
        if(!this.isEmpty()) {
            return head.data;
        } else {
            throw new RuntimeException("List is empty");
        }
    }

    public T peekLast() {
        if(!this.isEmpty()) {
            return tail.data;
        } else {
            throw new RuntimeException("List is empty");
        }
    }

    public int size() {
        return this.size;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
