import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String searchedName = "Gosho";

        List<Person> studentsFromClassA = List.of(
                new Person("Bob", 19),
                new Person("Allis", 32));

        List<Person> sortedStudents = studentsFromClassA
                .stream()
                .sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
        System.out.println(sortedStudents);

        Map<String, List<Person>> schoolClasses = new HashMap<>(
                Map.of("class A", studentsFromClassA));

        for (Map.Entry<String, List<Person>> schoolClass : schoolClasses.entrySet()) {
            System.out.println(String.format("Class name: %s, Student names: %s", schoolClass.getKey(), schoolClass.getValue()));
        }

        schoolClasses
                .forEach((schoolClassName, schoolStudents) ->
                        schoolStudents
                                .stream()
                                .filter(x -> x.getName().equals(searchedName))
                                .forEach(name ->
                                        System.out.println(
                                                String.format("Student with this name is found in class: %s", schoolClassName))));


        System.out.println(Objects.equals(studentsFromClassA.get(0), new Person("Gosho", 12)));
    }
}
