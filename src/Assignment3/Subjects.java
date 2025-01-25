package Assignment3;

import java.util.*;

public class Subjects {
    private Map<String, List<String>> subjectsMap;
    private String classroomStatus;

    // Конструктор
    public Subjects() {
        subjectsMap = new HashMap<>();

        // Предметы для технического направления
        subjectsMap.put("tech", Arrays.asList("Mathematics", "Physics", "Programming", "Engineering"));

        // Предметы для гуманитарного направления
        subjectsMap.put("non-tech", Arrays.asList("History", "Literature", "Philosophy", "Sociology"));

        // Общие предметы для всех направлений
        subjectsMap.put("general", Arrays.asList("English", "Physical Education", "Art"));
    }

    // Метод для получения списка предметов по направлению класса
    public List<String> getSubjects() {
        List<String> subjects = new ArrayList<>();

        // Добавляем предметы по статусу класса
        if (classroomStatus != null && subjectsMap.containsKey(classroomStatus.toLowerCase())) {
            subjects.addAll(subjectsMap.get(classroomStatus.toLowerCase()));
        }

        // Добавляем общие предметы
        subjects.addAll(subjectsMap.getOrDefault("general", Collections.emptyList()));

        return subjects;
    }

    // Установка статуса класса (например, "tech" или "non-tech")
    public void setClassroomStatus(String status) {
        this.classroomStatus = status.toLowerCase();
    }

    public String getClassroomStatus() {
        return classroomStatus;
    }

    public static void main(String[] args) {
        Subjects subjects = new Subjects();

        // Пример: класс с техническим направлением
        subjects.setClassroomStatus("tech");
        System.out.println("Subjects for tech class: " + subjects.getSubjects());

        // Пример: класс с гуманитарным направлением
        subjects.setClassroomStatus("non-tech");
        System.out.println("Subjects for non-tech class: " + subjects.getSubjects());

        // Пример: класс без заданного направления (общие предметы)
        subjects.setClassroomStatus("unknown");
        System.out.println("Subjects for unknown class: " + subjects.getSubjects());
    }
}
