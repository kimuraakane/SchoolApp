import com.example.model.Teacher;
import com.example.model.Student;
import com.example.service.SchoolService;


public class Main{
    public static void main(String[] args) {
        Student student1 = new Student("佐藤",15,"野球部");
        Student student2 = new Student("田中",8,"サッカー部");

        Teacher teacher1 = new Teacher("山田",30,2);
        Teacher teacher2 = new Teacher("鈴木",25,5);

        SchoolService schoolservis = new SchoolService();
        schoolservis.listA(student1);
        schoolservis.listA(student2);

        schoolservis.listB(teacher1);
        schoolservis.listB(teacher2);


        schoolservis.list();

    }
}