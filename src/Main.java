import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Student student1 = service.createStudent();
        Student student2 = service.createStudent();
        Student student3 = service.createStudent();
        Student student4 = service.createStudent();

        Student [] array = {student1, student2, student3,student4};
        service.findYoungestFemaleStudent(array);



        }





    }