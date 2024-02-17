package emailApp;

import java.util.Scanner;

public class EMail {
//  SOLUTION

  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private int mailboxCapacity = 500;
  private int defaultPasswordLength = 10;
  private String alternateEmail;
  private String companySuffix = ".abc.com";


  // Constructor to receive the firstname and lastname
  public EMail(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println();
    System.out.println("EMAIL CREATED for: " + this.firstName + " " + this.lastName);

    // Call a method asking for the department - return the department
    this.department = setDepartment();
    System.out.println("SELECTED DEPARTMENT: " + this.department);

    // Call a method that return a random password
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("YOUR PASSWORD: " + this.password);

    // Call a method to show Email address
    email = this.firstName + "." + this.lastName + "@" + this.department + companySuffix;
    System.out.println("YOUR EMAIL: " + email);
  }


  // Ask for the department

  private String setDepartment() {
    System.out.print("DEPARTMENT CODES: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department codes: ");
    Scanner input = new Scanner(System.in);
    int selection = input.nextInt();
    switch (selection) {
      case 0:
        System.out.println();
        setDepartment();
        break;
      case 1:
        this.department = "Sales";
        break;
      case 2:
        this.department = "Development";
        break;
      case 3:
        this.department = "Accounting";
        break;
      default:
        System.out.println();
        System.out.println("NOT VALID TRY AGAIN");
        System.out.println();
        setDepartment();
        break;
    }
    return this.department;
  }

  public String getDepartment() {
    return department;
  }

  // Generate a random password
  private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }

    return new String(password);
  }

  // Set the mailbox capacity
  public void setMailboxCapacity(int mailboxCapacity) {
    this.mailboxCapacity = mailboxCapacity;
  }

  // Set the alternate Email
  public void setAlternateEmail(String alternateEmail) {
    this.alternateEmail = alternateEmail;
  }

  // Change the password
  public void changePassword(String password) {
    this.password = password;
  }

  public int getMailboxCapacity() {
    return mailboxCapacity;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName;
  }

//  MY ATTEMPT
//  final int employeeID;
//  private final String firstName;
//  private final String lastName;
//  private final String department;
//
//  String employeeEmailAddress;
//
//  public EMail(String firstName, String lastName, String department) {
//    this.firstName = firstName;
//    this.lastName = lastName;
//    this.department = department;
//    employeeID =+ 1;
//    createEmail();
//  }
//
//  public void createEmail() {
//    String company = "ABCcompany";
//    String domainName = "com";
//    employeeEmailAddress = this.firstName + "." + this.lastName + "@" + department + "." + company + "." + domainName;
////    System.out.println(employeeEmailAddress);
//  }
//
//  public void showEmployeeDetails() {
//    System.out.println("===============");
//    System.out.println("EmployeeID: " + employeeID);
//    System.out.println("FirstName: " + firstName);
//    System.out.println("LastName: " + lastName);
//    System.out.println("Department: " + department);
//    System.out.println("EMail Address: " + employeeEmailAddress);
//    System.out.println("===============");
//  }

}
