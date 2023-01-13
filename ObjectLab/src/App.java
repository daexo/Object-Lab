import java.util.*;
// Deja McLean
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Student student1 = new Student();

        // Question 2
        Student [] studentArr = new Student[5];

        for (int x = 0; x < studentArr.length; x++){
            Student student = new Student();

            System.out.println("Name?");
            student.name = input.next();
            System.out.println("ID #?"); 
            student.id = input.nextInt();
            System.out.println("Current GPA?");
            student.cGPA = input.nextDouble();

            studentArr[x] = student;
        }

        // Question 3
        for (int x = 0; x < studentArr.length; x++){

            PrintInfo(studentArr[x]);
    
        }

        // Question 4
        double highGPA = 0;
        String nameGPA = "";
        for (int j = 0; j < studentArr.length; j++){
            if (studentArr[j].cGPA > highGPA) {
                highGPA = studentArr[j].cGPA;
                nameGPA = studentArr[j].name;
            }
        }
        System.out.println("Highest GPA: " + nameGPA + " - " + highGPA);

        // Question 5
        Student studentLOW = studentArr[0];
        double lowGPA = studentLOW.cGPA;
        String namelGPA = "";
        for (int k = 0; k < studentArr.length; k++){
            if (studentArr[k].cGPA < lowGPA) {
                lowGPA = studentArr[k].cGPA;
                namelGPA = studentArr[k].name;
            }
        }
        System.out.println("Lowest GPA: " + namelGPA + " - " + lowGPA);

        // Question 6
        double sum = 0;
        double avg;
        for (int i = 0; i < studentArr.length; i++)
        {
            sum = sum + studentArr[i].cGPA;
        }

        avg = sum / studentArr.length;

        System.out.println("Average GPA: \n" + avg);

    }

    // Question 1
    public static void PrintInfo(Student student) {

        System.out.println(student.name + " is currently a student at Towson University. Their GPA is " + student.cGPA + ", and their student ID is " + student.id);

    }


}

      /*   // Question 1
        System.out.println("Name?");
        student1.name = input.next();
        input.nextLine();
        System.out.println("ID #?"); 
        student1.id = input.nextInt();
        System.out.println("Current GPA?");
        student1.cGPA = input.nextDouble();

        PrintInfo(student1);
        */