import java.util.*;
public class Main {
    public static void main(String[] args) {
List<String> strings = new ArrayList<>();
//strings.add( new String("Viet" +"c" +"t" +"để" +"tạo" +"ra" +"một" +"dh" +"sách"+ "(List)"+"tự"));
//        System.out.println(strings);

Scanner scanner = new Scanner(System.in);
System.out.print("Enter String: ");
strings.add(scanner.nextLine());
System.out.print("Enter String: ");
strings.add(scanner.nextLine());
System.out.print("Enter String: ");
strings.add(scanner.nextLine());
System.out.print("Enter String: ");
strings.add(scanner.nextLine());
//        System.out.println(strings);
//        System.out.println( new Scanner(System.in).nextLine()); // Viết tắt
//        for (int i = 0; i < strings.size(); i++) {
//            String s = strings.get(i);
//            if (s.length() > 3) {
//                System.out.println(s);
//            }
//        }
        for (String s : strings) {
            if (s.length() > 3) {
                System.out.println(s);
            }
        }

    }
}
