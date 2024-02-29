import java.util.ArrayList;

public class toko_ABC <E> {
    private final ArrayList<E> list;

    public toko_ABC(int capacity){
        int initCapacity = capacity > 0? capacity:0;
        list = new ArrayList<>(initCapacity);
    }
    public void addData(E values){
        list.add(values);
    }
    public void display(){
        for (int i = 0; i<list.size();i++) {
        System.out.printf(list.get(i) + " ");
        }
        System.out.println();
        }
        public void removeData(int index){
            list.remove(index);
        }
        public void setData(int object1, E object2){
            list.set(object1, object2);
        }
           
    }

