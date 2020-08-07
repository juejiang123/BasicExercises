package StreamTest.SerializableTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArraylistSerial {
    public static void main(String[] args) throws Exception{
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("hhh",18));
        list.add(new Person("ww",20));
        list.add(new Person("lll",14));
        list.add(new Person("hii",38));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ll.txt"));
        oos.writeObject(list);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ll.txt"));
        Object object = ois.readObject();
        ois.close();
        ArrayList<Person> list1 = (ArrayList<Person>)object;
        for(Person p : list1){
            System.out.println(p);
        }
    }
}
