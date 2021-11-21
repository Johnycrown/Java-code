package chapterThreeExercises;

public class Employee {
  private  String firstName;
    String lastName;
    double salary;
    double annualSalary;
    double increaseSalary;

 public Employee(String firstName,String lastName, double salary){
     this.firstName = firstName;
     this.lastName = lastName;
     this.salary = salary;
 }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastname){

     this.lastName = lastname;
    }
    public String getLastName(){
     return  this.lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
     if(salary>0){
         this.salary = salary;
     }
    }
   public void dispylayEmployee(){
       annualSalary = salary*12;
     System.out.printf("%f", annualSalary);

   }
   public void percentageSalaryIncrease(){
       increaseSalary = salary + 0.1*salary;
       annualSalary = increaseSalary*12;
       System.out.printf("%f", annualSalary);


   }



}
