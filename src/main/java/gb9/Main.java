package gb9;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ura", 25, Person.Position.DIRECTOR));
        personList.add(new Person("Roma", 28, Person.Position.ENGENEER));
        personList.add(new Person("Olya", 33, Person.Position.MANAGER));
        personList.add(new Person("Olya", 33, Person.Position.MANAGER));
        personList.add(new Person("Olya", 33, Person.Position.MANAGER));
        personList.add(new Person("Dima", 38, Person.Position.ENGENEER));

        List<Person> personList1 = personList
                .stream()
                .filter(p -> p.getPosition() == Person.Position.ENGENEER)
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .collect(Collectors.toList());

        Optional<Integer> sumAges = personList.stream()
                .map(p -> p.getAge())
                .reduce((age1, age2) -> age1 + age2);

        System.out.println(sumAges);
        System.out.println(personList1);

        Stream.of("123", "456", "22", "13", "22")
                .distinct()
                .forEach(p -> System.out.println(p));

        Integer[][] integers = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Stream.of(integers)
                .flatMap(a -> Stream.of(a))
                .forEach(System.out::println);

        // dz
        //IT, MANAGMENT, HISTORY, FINANCE
        //Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("Ivan", Students.Course.IT));
        studentsList.add(new Students("Ura", Students.Course.FINANCE));
        studentsList.add(new Students("Olya", Students.Course.HISTORY));
        studentsList.add(new Students("Gleb", Students.Course.MANAGMENT));
        studentsList.add(new Students("Zoya", Students.Course.MANAGMENT));
        studentsList.add(new Students("Slava", Students.Course.IT));
        studentsList.add(new Students("Petr", Students.Course.FINANCE));

        System.out.println(studentsList.stream()
                //.distinct()
                //.map(students -> students.getName())
                .map(students -> students.getCourse())
                .distinct()
                .collect(Collectors.toList()));


    }
}
