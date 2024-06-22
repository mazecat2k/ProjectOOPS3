// Java Program to Illustrate Student Class
// to take Input from the student and related Information

// Importing required classes
import java.util.Scanner;

// Class


// Class
public class Student {

    // Class member variables
    String studentName;
    String regNum;

    Book borrowedBooks[] = new Book[3];
    public int booksCount = 0;

    // Creating object of Scanner class to take input from user
    Scanner input = new Scanner(System.in);

    // Default constructor
    public Student() {
        System.out.println("Enter Student Name:");
        this.studentName = input.nextLine();
        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }

    // Constructor with parameters
    public Student(String studentName, String regNum) {
        this.studentName = studentName;
        this.regNum = regNum;
    }
}
