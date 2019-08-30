package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String departmentId;
    private int mailBosCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(" Email created :" + " " + this.firstName + "  " + this.lastName);
        // Now call a method for the depardment = the return the department
        this.departmentId = setDepartment();
        System.out.println("Department:" + this.departmentId);

      //  this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password " + this.password);
    }

    //  private int randomPassword(int defaultPasswordLength) {


    // Ask for th department
    private String setDepartment() {
        System.out.println(" Department codes\n1 for Sales\n2 for Development\n3 for Accounting\nEnter department code");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return " ";
        }
      //   private String randomPassword(int length){
       // String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
       // char[] password = new char[length];
       // for (int i = 0; i < length; i++) {
        //    int rand = (int) (Math.random() * passwordSet.length());
          //  password[i] = passwordSet.charAt(rand);
        }

       // return new String(password);
    }






