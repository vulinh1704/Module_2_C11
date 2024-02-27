package input;

import java.util.Scanner;

public class StudentValidator {
    private static Scanner input = new Scanner(System.in);

    public static int getId() {
        String regex = "[0-9]{2,}";
        while (true) {
            String id = input.nextLine();
            if (id.matches(regex)) {
                int ipOutput = Integer.parseInt(id);
                return ipOutput;
            } else {
                System.out.println("ID co it nhat 2 ky tu so");
            }
        }
    }

    public static String getName() {
        String regex = "[a-zA-Z]{3,5}[0-9]+";
        while (true) {
            String name = input.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("3-5 ky tu chu va it nhat ky tu so");
            }
        }
    }
}
