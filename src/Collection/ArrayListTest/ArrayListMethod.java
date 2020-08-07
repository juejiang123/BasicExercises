package Collection.ArrayListTest;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Person> arr = new ArrayList<>();
        System.out.println(arr);
        Person one = new Person("dilireba",14);
        Person two = new Person("dilireba1",15);
        Person three = new Person("dilireba2",16);
        arr.add(one);
        arr.add(two);
        arr.add(three);
        System.out.println(arr);
        Person person = arr.get(1);
        System.out.println(person);
        System.out.println(arr.get(2));
        Person person1 = arr.remove(2);
        System.out.println(arr);
        System.out.println(person1);
        String name = arr.get(1).getName();
        System.out.println(name);
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<6;i++){
            int num = random.nextInt(100)+1;
            list.add(num);
        }
        System.out.println(list);
        System.out.println();
        ArrayList<Integer> smallList = smallList(list);
        System.out.println(smallList);
    }

    public static ArrayList<Integer> smallList(ArrayList<Integer> list){
        ArrayList<Integer> smalllist = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int num = list.get(i);
            if(num % 2 ==0){
                smalllist.add(num);
            }
        }
        return smalllist;
    }
}
