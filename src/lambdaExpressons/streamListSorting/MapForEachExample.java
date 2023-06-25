package lambdaExpressons.streamListSorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;

public class MapForEachExample {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("derek", 18));
        map.put(2, new Person("boyo", 68));
        map.put(3, new Person("UCJ", 70));
//
//        for (Entry<Integer,Person> entry: map.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue().getName());
//
//        }

        map.forEach((k,v)->{ System.out.println(k);
        System.out.println(v.getName());
        });
    }
            
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Person{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", age=").append(age);
//        sb.append('}');
//        return sb.toString();
//    }
}
