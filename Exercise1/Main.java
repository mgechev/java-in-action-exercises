package homework_1;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Minko Gechev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String firstName, surName, job;
        int age;
        double salary;
        String toEnd;   // to check if the user want to enter more employees
        Scanner in = new Scanner(System.in);
        do
        {

            System.out.printf("Please enter the first name: ");
            firstName = in.next();

            System.out.printf("Please enter the last name: ");
            surName = in.next();

            System.out.printf("Please enter the employee's job: ");
            job = in.next();

            System.out.printf("Please enter the employee's age: ");
            age = in.nextInt();
            
            System.out.printf("Please enter the employee's salary: ");
            salary = in.nextDouble();
            //creating new object with type Employee
            Employee e = new Employee(firstName, surName, job, age, salary);
            e.saveEmployee("data.dat");
            
            System.out.printf("Type \"exit\" to quit or something else to continue: ");
            toEnd = in.next();
            
        } while (!toEnd.equals("exit"));
    }
}