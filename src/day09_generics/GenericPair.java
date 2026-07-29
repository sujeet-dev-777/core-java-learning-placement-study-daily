package day09_generics;

public class GenericPair<K,V>{

    private K key;

    private V value;

    public GenericPair(K key,V value){

        this.key=key;

        this.value=value;
    }

    public void display(){

        System.out.println(key+" -> "+value);
    }

    public static void main(String[] args) {

        GenericPair<Integer,String> pair =
                new GenericPair<>(101,"Sujeet");

        pair.display();
    }
}