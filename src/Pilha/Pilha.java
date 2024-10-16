package Pilha;

public class Pilha implements  Ipilha{
    private Node top;
    private int size;

    @Override
    public void push(int element) {
     Node newnode = new Node(element);
     newnode.next = this.top;
     this.top = newnode;
     this.size++;
    }

    @Override
    public int peek() {
        if(size==0){
            throw new RuntimeException("empty stack");
        }
        return this.top.value;
    }

    @Override
    public int pop() {
        if(size==0){
            throw new RuntimeException("empty stack");
        }
        int removido = this.top.value;
        this.top = this.top.next;
        this.size--;
        return removido;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }


    }

}
