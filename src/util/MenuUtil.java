package util;

import main.Configuration;
import main.Student;

public class MenuUtil {

    public static void printAllStudents() {
        if (Configuration.students==null){
            System.out.println("You do not have Registered any Students...");
            return;
        }
        System.out.println("Students that you have Registered :");
        for (int i = 0; i < Configuration.students.length; i++) {
            Student st = Configuration.students[i];
            System.out.println((1 + i) + ". Student: \n" + st.getInfo());
        }

    }

    public static void registerStudents() {
        int count = InputUtil.enterInteger("How many Student will you Register?");

        Configuration.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Registration");
            Student st = InputUtil.fill();
            Configuration.students[i] = st;
        }
    }

    public static void findStudents(){
        String find = InputUtil.enterString("Enter name or Surname that you want to find:");
        for (int i = 0; i < Configuration.students.length; i++) {
            Student st = Configuration.students[i];
            if(st.getName().equalsIgnoreCase(find) || st.getSurname().equalsIgnoreCase(find)){
                System.out.println(st.getInfo());

            }
        }

    }

    public static void updateStudent(){
        int student_place = InputUtil.enterInteger("In which student you want to do update?");
        System.out.println("Enter new information:");
        Student st = InputUtil.fill();
        Configuration.students[student_place-1] = st;
    }
}

