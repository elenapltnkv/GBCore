package gb9;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class OrgEx {
    public static void main(String[] args) {
        List<Organization> organizations = Arrays.asList(
                new Organization(1, "Yandex",
                        Arrays.asList(
                                new Person("Oleg", 23, Person.Position.MANAGER),
                                new Person("Vitya", 40, Person.Position.ENGENEER),
                                new Person("Vladimir", 40, Person.Position.DIRECTOR)

                        )

                ),
                new Organization(2, "Mail",
                        Arrays.asList(
                                new Person("Uliya", 37, Person.Position.DIRECTOR),
                                new Person("Janna", 40, Person.Position.ENGENEER),
                                new Person("Lera", 43, Person.Position.MANAGER),
                                new Person("Denis", 40, Person.Position.DIRECTOR)

                        )),
                new Organization(3, "VK",
                        Arrays.asList(
                                new Person("David", 30, Person.Position.MANAGER),
                                new Person("Janna", 40, Person.Position.DIRECTOR),
                                new Person("Rus", 43, Person.Position.DIRECTOR),
                                new Person("Lena", 40, Person.Position.MANAGER)

                        ))
        );
        System.out.println(organizations.stream()
                .filter(o -> o.getPersonList().size() > 3)
                .map(o -> o.getPersonList())
                .flatMap(p -> p.stream())
                .collect(Collectors.toList()));

        System.out.println(organizations.stream()
                .map(o -> o.getPersonList())
                .flatMap(people -> people.stream())
                .collect(Collectors.groupingBy(f -> f.getPosition())));

    }
}
