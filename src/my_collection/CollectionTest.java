package my_collection;

    /**
    * Created by Artem Stukalenko on 21.07.2021
    */

public class CollectionTest {

    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.add("first");
        list.add("second");
        list.add("third");

        list.set(0, "fourth");
        list.set(3, "fifth");

        list.print();
    }



}
