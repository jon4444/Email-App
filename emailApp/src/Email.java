import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 42;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // constructor to receive the firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName );

        // call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your email is: " + email);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("New worker: " + firstName + ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) { return "sales";}
        else if(depChoice == 2) { return "development"; }
        else if(depChoice == 3) { return "Accounting"; }
        else { return ""; }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) { // iterate through characters (password set)
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String password) {
        this.password = password;
    }

    //
    public int getMailboxCapacity() {return mailboxCapacity;}   // return the mail box capacity
    public String getAlternateEmail() {return alternateEmail;}  // return a different email
    public String getPassword() {return password;}              // return the password


    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                " \nCOMPANY NAME: " + email +
                " \nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}