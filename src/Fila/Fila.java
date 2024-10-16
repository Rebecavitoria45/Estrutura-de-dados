package Fila;

public class Fila implements Ifila{
    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(int element) {
        if(size==0){
            this.head = new Node(element);
            this.tail= this.head;
        }
       else {
            this.tail.next = new Node(element);
            this.tail = this.tail.next;
        }
        this.size++;
    }

    @Override
    public int obtem() {
        return this.head.value;
    }

    @Override
    public int obtemRemove() {
        if(size==0){
            throw new RuntimeException("fila vazia");
        }
        int atual = this.head.value;
        this.head = this.head.next;
        this.size--;
        return atual;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

    }

}
