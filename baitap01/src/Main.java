import java.util.*;

public class Main {
    public static void main(String[] args) {
        //--------Tạo 1 ArrayList để chứ 10 phần tử ngãy nghiên----------
        List<Integer> integerList = new ArrayList<>();
        int maxInteger = 10; // tạo 1 biến int có giá trị là 10
        Random random = new Random();
        for (int i = 0; i < maxInteger; i++) { // tạo vòng lặp for để duyệt từ 0 đến 10
//            int randomInt = random.nextInt(100); //Gioi hajn so, tạo 1biến random để chứa các số đc random ra từ 0 đến 100
            integerList.add(random.nextInt());
        }
//        // ------------In danh sách số nguyên ngẫu nghiên-----------
//        System.out.println("Danh sách số nguyên: ");
//for(Integer i : integerList){
//    System.out.print(i + ",");
//
//}if (integerList.size()==0){
//            System.out.println("danh sách rỗng");
//        }

        System.out.println("Danh sách 10 số ngẫu nghiên: "+ integerList);
        //-------------------phần tử lớn nhất---------------
        int iMax = Collections.max(integerList);
        System.out.println("Phần tử lớn nhất trong mảng integerList là: " + iMax);

    }

}