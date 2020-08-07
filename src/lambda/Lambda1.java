package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda1 {

    public static void main(String[] args) {
        Person[] arr ={
                new Person("aaa",10),
                new Person("bbb",50),
                new Person("ccc",30)
        };
//        Arrays.sort(arr,new Comparator<Person>(){
//            @Override
//            public int compare(Person o1,Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        Arrays.sort(arr,(Person o1,Person o2)-> {
            return o1.getAge() - o2.getAge();
        });

        for(Person p : arr){
            System.out.println(p);
        }

    }
}
