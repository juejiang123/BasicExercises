package StreamTest;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("aa.txt");
        ps.println(2);
        ps.println('a');
        ps.println("hello");
        ps.println(3.3);
        System.out.println("我在控制台输出");
        System.setOut(ps);
        System.out.println("我在打印流的目的地输出");
        System.out.println("我在打印流的目的地输出");
        System.out.println("我在打印流的目的地输出");
    }
}
