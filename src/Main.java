import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String[] stArray = new String[10];
// List<Student> students = new ArrayList<>();
// students.add(new Student()
//List<String> arrTest = new ArrayList<>();
//arrTest.add("kiểm thử 1");
//arrTest.add("\nKiểm thử 2");
//arrTest.add(1, "\nkẹp giữa");
//arrTest.add(arrTest.size()/2, "kệp tiến giữa");
//        System.out.println(arrTest);
//--------------Bài tập---------------
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hương", 22, false));
        students.add(new Student("Đạt", 20, true));
        students.add(new Student("Phượng", 24, false));
        students.add(new Student("Long", 21, true));
        System.out.println("Danh sách tất cả sinh viên:");
        for (Student student : students) {
            System.out.println(student);
            //In ra những bạn là nữ false
//            System.out.println("\n Danh sách sinh viên nữ");
//            for (Student i : students) {
//                if (!student.isSex()) {
//                    System.out.println(i);
//                }
//            }
        }
    }
}