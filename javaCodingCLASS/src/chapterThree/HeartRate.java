package chapterThree;

import java.util.Scanner;

public class HeartRate {
    private  String firstName;
    private String lastName;
    private int dateOfBirth;
    private int age;
    private int maximumHeartRate;

    public HeartRate(String firstName,String lastName, int dateOfBirth ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int calculateAge(){
        age = 2021 - dateOfBirth;
        return age;

    }
    public int calculateMaximumHeartRatePerMinutes(){
        maximumHeartRate = 220 - calculateAge();
        return maximumHeartRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your firstName");
      String  firstName = scanner.nextLine();
        System.out.println("enter your lastName");
        String  lastName = scanner.nextLine();
        System.out.println("enter your year of birth");
        int  yearOfBirth = scanner.nextInt();
        HeartRate  myheartRate = new HeartRate(firstName,lastName,yearOfBirth );
        System.out.println("the firstname: " + firstName +"\nthe lastName: "+ lastName + "\nthe heart rate: " + myheartRate.calculateMaximumHeartRatePerMinutes());

    }
}
