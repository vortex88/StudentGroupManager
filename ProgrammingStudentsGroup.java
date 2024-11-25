package ProgrammingSchool;

import java.util.List;

public class ProgrammingStudentsGroup { // Группа учеников
    private List<String> students; //Список имён учеников в группе
    private String groupName; //Название группы
    private String mentor; //  Имя наставника группы
    private int maxStudents; // Максимальное количество учеников в группе.

    public void removeLastStudent() {
        //Метод isEmpty() возвращает true, если список students не содержит элементов, и false, если список содержит хотя бы один элемент.
        if (!students.isEmpty()) { // Проверяет, не пуст ли список студентов (
            students.remove(students.size() - 1); // Удаляет последний элемент
        }
    }

    public void addStudent(String name) { // Добавляем одного ученика в список, если не превышен лимит группы
        if (students.size() < maxStudents) { // Проверяем, не превышает ли текущее количество студентов максимальное
            students.add(name); // Добавляем студента в список
        } else {
            System.out.println("\nНевозможно добавить ученика: достигнуто максимальное количество студентов (максимум: " + maxStudents + ").");
        }
    }

    public void removeStudentByName(String studentName) { // Удаляем одного ученика из списка
        if (students.remove(studentName)) {
            System.out.println("\nУченик " + studentName + " удален из группы.");
        } else {
            System.out.println("\nУченик " + studentName + " не найден в группе.");
        }
    }

    public void countStudentsByFirstLetter(char letter) { //Подсчитывает количество учеников, чьи имена начинаются с указанной буквы, и выводит сообщение
        int count = 0;
        for (String student : students) {
            // Метод charAt(0) возвращает первый символ строки student
            if (student.charAt(0) == letter) { // Проверяет все символы на соответствие с letter
                count++; // Если условие выполняется, переменная увеличивается на 1
            }
        }
        System.out.println("\nЧисло учеников, чьи имена начинаются с буквы " + letter + ": " + count);
    }

    public void clearGroup() { // Удаляет всех студентов из списка
        students.clear();
    }


    public void printGroupinfo() { // Выводим информацию о группе
        System.out.println("\nГруппа: " + getGroupName());
        System.out.println("Имя Наставника: " + getMentor());
        if (getMentor().equals("Walter Bishop")) {
            System.out.println("Либо здесь пробежал зелёный единорог, либо я случайно принял ЛСД(C)"); // цитата :D
        } else if (getMentor().equals("Nina Sharp")) {
            System.out.println("What do we do? What don't we do.(C)Massive Dynamic"); //
        }
        System.out.println("Студенты: ");
        for (String student : getStudents()) {
            System.out.println(student);
        }
    }

    public int getRemainingSlots() { // Возвращает количество свободных мест в группе
        return maxStudents - students.size(); // Вычисляет количество свободных мест, вычитая текущее количество студентов в группе из максимального количества студентов.
    }

    public void isStudentGroup(String studentName) { // Проверяет, находится ли ученик с заданным именем в группе
        if (students.contains(studentName)) {
            System.out.println("\nУченик " + studentName + " есть в группе.");
        } else {
            System.out.println("\nУченик " + studentName + " не найден в группе.");
        }
    }

    public void changeMentor(String newMentor) { // Меняет наставника группе
        setMentor(newMentor);
    }


    public ProgrammingStudentsGroup() {
    }

    public ProgrammingStudentsGroup(List<String> students, String groupName, String mentor, int maxStudents) {
        this.students = students;
        this.groupName = groupName;
        this.mentor = mentor;
        this.maxStudents = maxStudents;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }
}
