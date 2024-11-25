package ProgrammingSchool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        // Создание объекта класса
        ProgrammingStudentsGroup group = new ProgrammingStudentsGroup();

        // Заполнение полей класса
        group.setGroupName("Java Developers");
        group.setMentor("Walter Bishop"); // "Nina Sharp"
        group.setMaxStudents(5);

        // Инициализация списка студентов с добавлением начальных данных
        List<String> initialStudents = new ArrayList<>(Arrays.asList("Olivia", "Piter", "Astrid", "Henrietta")); // "Lincoln" "Charlie" "Phillip"
        group.setStudents(initialStudents);

        // Удаляем студента из группы
        group.removeLastStudent();
        System.out.println("\nСписок группы после удаления студента:");
        for (String student : group.getStudents()) {
            System.out.println(student);
        }
        // Возвращает количество свободных мест в группе
        int remainingSlots = group.getRemainingSlots();
        System.out.println("\nКоличество свободных мест в группе: " + remainingSlots);

        // Выводим информацию о группе
        group.printGroupinfo();

        // Удаляем всех студентов из списка студентов.
        group.clearGroup();
        if (group.getStudents().isEmpty()) {
            System.out.println("\nСписок студентов пуст после очистки.");
        }

        // Добавляем всех студентов из списка студентов.
        group.addStudent("Lincoln");
        group.addStudent("Phillip");
        group.addStudent("Olivia");
        group.addStudent("Piter");
        group.addStudent("Astrid");
        group.addStudent("Charlie");

        // Меняем наставника
        group.changeMentor("Nina Sharp");

        // Выводим информацию о группе
        group.printGroupinfo();

        //Удаляем ученика по имени
        group.removeStudentByName("Lincoln");

        // Проверяем список на наличие Бори
        group.isStudentGroup("Boris");
        // Проверяем список на наличие Оливии
        group.isStudentGroup("Olivia");

        // Подсчитываем имена учеников чье имя начинается с определенной буквы.
        group.countStudentsByFirstLetter('P');


    }
}
