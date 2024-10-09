package ArrayList;

public class Lista implements IList {
    private int[] array;
    private int size;

    public Lista(){
        this.array = new int[2];
        this.size = 0;
    }

    @Override
    public int get(int index) {
        if(index>=this.size || index<0){
          throw new RuntimeException("invalid index");
        }
        return this.array[index];

    }

    @Override
    public void add(int element) {
        if(this.size==array.length){
         resize();
        }
      this.array[size]=element;
      this.size++;
    }

    @Override
    public void add(int element, int index) {
        if(!(index>=0 && index<size)){
            throw new RuntimeException("invalid index");
        }
        if(this.size==array.length){
            resize();
        }
        for(int i = this.size-1;i>=index;i--){
            this.array[i+1]=this.array[i];
        }
        this.array[index]=element;
        this.size++;
    }

    @Override
    public void remove(int index) {
        if(!(index>=0 && index<size)){
            throw new RuntimeException("invalid index");
        }
        for(int i = index; i<size-1;i++){
            array[i]=array[i+1];
        }
        this.size--;
        array[size]=0;
    }

    @Override
    public void replace(int element, int index) {
        if(!(index>=0 && index<size)){
            throw new RuntimeException("invalid index");
        }
        array[index]=element;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    private void resize(){
        int[] arraytemp = array;
        array = new int[arraytemp.length*2];
        for(int i = 0; i<arraytemp.length;i++){
        array[i] = arraytemp[i];
    }
    }

}
