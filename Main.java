import java.util.Scanner;
class Employees {
    int Empid;
    String Name;
    double Salary;
    String Address;

    public Employees(int Empid, String Name, double Salary, String Address) {
        this.Empid = Empid;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + Empid);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Address: " + Address);
        System.out.println("------------------------------");
    }
}

class Teacher extends Employees {
    String Department;
    String[] Subjects;

    public Teacher(int Empid, String Name, double Salary, String Address, String Department, String[] Subjects) {
        super(Empid, Name, Salary, Address); 
        this.Department = Department;
        this.Subjects = Subjects;
    }

    public void displayTeacherDetails() {
        displayEmployeeDetails(); 
        System.out.println("Department: " + Department);
        System.out.print("Subjects Taught: ");
        for (String subject : Subjects) {
            System.out.print(subject + " ");
        }
        System.out.println();
        System.out.println("==============================");
    }
}

public class Main {

    public static void displayTeachersDetails(int N) {
        Scanner sc = new Scanner(System.in);
        Teacher[] teachers = new Teacher[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter details for Teacher " + (i + 1));
            System.out.print("Enter Empid: ");
            int Empid = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String Name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double Salary = sc.nextDouble();
            sc.nextLine(); 

            System.out.print("Enter Address: ");
            String Address = sc.nextLine();

            System.out.print("Enter Department: ");
            String Department = sc.nextLine();

            System.out.print("Enter Subjects taught (comma-separated): ");
            String subjectsInput = sc.nextLine();
            String[] Subjects = subjectsInput.split(",");

            teachers[i] = new Teacher(Empid, Name, Salary, Address, Department, Subjects);
        }

        for (Teacher teacher : teachers) {
            teacher.displayTeacherDetails();
        }

        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int N = sc.nextInt();

        displayTeachersDetails(N);

        sc.close();  
    }
}
