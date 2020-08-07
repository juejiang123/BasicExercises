package StreamTest.SerializableTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("zz.txt"));
        oos.writeObject(new Person("hhhh",18));
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("zz.txt"));
        Object object = ois.readObject();
        ois.close();
        System.out.println(object.toString());
    }
}
