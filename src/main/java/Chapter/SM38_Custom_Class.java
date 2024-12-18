package Chapter;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }

    public int getSalary(){
    return salary;
    }
}
public class SM38_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee sujit = new Employee();
        Employee munna = new Employee();
        // Setting Properties for sujit
        sujit.id = 101;
        sujit.name = "Sujit";
        sujit.salary = 30;

        // Setting Properties for Munna
        munna.id = 102;
        munna.name = "Munna Tripathi";
        munna.salary = 50;
        //Printing the attributes
        //System.out.println(sujit.id);
        //System.out.println(sujit.name);
        sujit.printDetails();
        int salary = sujit.getSalary();
        System.out.println(salary);
        munna.printDetails();
    }
}
