package Fila;

public interface Ifila {

    //	Adiciona um elemento atrás da fila
    public void add(int element);

    //	Obtém o elemento da frente, sem retirá-lo
    public int obtem();

    //	Obtém o elemento da frente e retira-o
    public int obtemRemove();

    //	Obtém o tamanho da fila
    public int getSize();
}
