package ListaEncadeadaSimples;

import ArrayList.IList;

public class ListaEncadeada implements IList{

    private Node head;
    private Node tail;
    private int size;

    @Override
    public int get(int index) {
        validateIndex(index);
       Node atual = this.head;
       for(int i = 0; i<index;i++){
           atual = atual.next;
       }
       return atual.value;
    }

    @Override
    public void add(int element) {
     if(size==0){
         this.head = new Node(element);
         this.tail = head;

     }else{
         this.tail.next = new Node(element);
         this.tail = this.tail.next;
     }
     this.size++;
    }

    @Override
    public void add(int element, int index) {
      if (size==0){
          add(element);
      }
      else if(size == index){
          add(element);
      }
      else{
          Node atual = getNode(index);
          Node newnode = new Node(element);
          newnode.next = atual.next;
          atual.next = newnode;
          this.size++;
      }
    }

    @Override
    public void remove(int index) {
        validateIndex(index);
        if(size ==0){
            this.head = this.head.next;
        }
     Node anterior = getNode(index-1);
     anterior.next =anterior.next.next;
    }

    @Override
    public void replace(int element, int index) {
        validateIndex(index);
      Node node = getNode(index);
      node.value = element;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void print() {
        for(Node atual = this.head; atual!=null;atual = atual.next){
          System.out.print(atual.value + " ");
        }

    }

    public Node getNode(int index){
        validateIndex(index);
     Node atual = this.head;
     for(int i=0;i<index;i++){
         atual = atual.next;
     }
     return atual;
}

    public void validateIndex(int index){
        if(index<0 || index>=size){
            throw new RuntimeException("index invalido");
        }
    }


    private class Node{
        int value;
         Node next;

         Node(int value){
            this.value = value;
        }

    }

}
