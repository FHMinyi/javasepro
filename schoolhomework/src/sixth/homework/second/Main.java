package sixth.homework.second;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                personList.add(new Person("Alice", 30));
            } else if (i % 5 == 1) {
                personList.add(new Person("Bob", 25));
            } else if (i % 5 == 2) {
                personList.add(new Person("Charlie", 35));
            } else if (i % 5 == 3) {
                personList.add(new Person("David", 40));
            } else {
                personList.add(new Person("Eve", 45));
            }
        }

        // 使用HashSet去重
        Set<Person> uniquePersons = new HashSet<>(personList);

        // 输出去重后的结果
        for (Person person : uniquePersons) {
            System.out.println(person);
        }
    }
}
