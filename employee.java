

public class employee {
    String name;
    int id;
    double salary;
    String add;

    public employee(String name, int id, double salary,String add) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.add=add;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("addr" + add);

    }

    public static void main(String[] args) {
        employee e = new employee("abc", 123, 5000,"hubli");
        e.displayInfo();
    }
}