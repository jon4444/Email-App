import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // constructor to receive the firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName );

        // call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) { return "sales";}
        else if(depChoice == 2) { return "development"; }
        else if(depChoice == 3) { return "Accounting"; }
        else { return ""; }
    }

    // Generate a random password

    // Set the mailbox capacity

    // set the alternate email

    // change the password

}