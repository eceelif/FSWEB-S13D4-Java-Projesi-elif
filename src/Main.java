import com.elifStudents.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Öğrenci ve notlarını oluştur
        Student student1 = new Student("Ali Veli", "123", new Score(85));
        Student student2 = new Student("Ayşe Yılmaz", "456", new Score(90));
        Student student3 = new Student("Fatma Kaya", "789", new Score(75));
        Student student4 = new Student("Ahmet Yenice", "864", new Score(45));
        Student student5 = new Student("Elif Yurt", "567", new Score(95));
        Student student6 = new Student("Burak Çelik", "890", new Score(88));

        // Tüm öğrencileri listeye ekle
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        allStudents.add(student5);
        allStudents.add(student6);

        // Departman oluştur ve öğrencileri ekle
        Department department1 = new Department("Computer Science");
        department1.addStudent(student1);
        department1.addStudent(student2);
        department1.addStudent(student3);

        Department department2 = new Department("Mathematics");
        department2.addStudent(student4);

        Department departmentArt1 = new Department("Painting");
        departmentArt1.addStudent(student5);

        Department departmentArt2 = new Department("Sculpture");
        departmentArt2.addStudent(student6);

        // Fakülteler oluştur ve departmanları ekle
        Faculty faculty = new Faculty("Engineering");
        faculty.addDepartment(department1);
        faculty.addDepartment(department2);

        Faculty facultyArt = new Faculty("Art");
        facultyArt.addDepartment(departmentArt1);
        facultyArt.addDepartment(departmentArt2);

        // Okul oluştur ve fakülteleri ekle
        School school = new School("My University");
        school.addFaculty(faculty);
        school.addFaculty(facultyArt);

        // Bütçe oluştur
        Budget budget = new Budget(1000000); // 1.000.000 TL

        // ScholarshipManager oluştur ve bursları kontrol et
        ScholarshipManager scholarshipManager = new ScholarshipManager(budget);
        scholarshipManager.checkAndAwardScholarships(school);

        // Fakülte ve departmanları göster
        for (Faculty facultyItem : school.getFaculties()) {
            facultyItem.displayFaculty();
            facultyItem.displayDepartmentNames();
        }

        // Başarılı öğrencileri göster
        Student.listSuccessfulStudents(allStudents, 80);
    }
}
