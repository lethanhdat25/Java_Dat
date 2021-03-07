package assignment.As7;

public interface ISinhVien {
    void addStudent(int id, int age, String name, String address, float gpa);
    void editStudent(int id);
    void deleteStudent(String name);
    void sortStudentGpa();
    void sortStudentName();
    void showStudent();
}
