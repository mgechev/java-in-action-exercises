package homework_1;
import java.io.*;
/**
 *
 * @author Minko Gechev
 */
public class Employee {
    private String firstName;
    private String surName;
    private String job;
    private int age;
    private double salary;
    public Employee(String firstName, String surName, String job, int age, double salary)
    {
        this.age = age;
        this.firstName = firstName;
        this.surName = surName;
        this.job = job;
        this.salary = salary;
    }
    public void saveEmployee(String fileName) throws FileNotFoundException
    {
        File file = new File(fileName);
        FileOutputStream out = new FileOutputStream(file, true);
        PrintWriter write = new PrintWriter(out);
        write.printf("%-15s %-15s %-15s %-7d %-7.2f\n", firstName, surName, job, age, salary);
        write.flush();  //flushing manually
    }
}