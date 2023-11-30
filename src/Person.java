class Person {
    int nic;
    String name;
    Person(int nic,String name) {
        this.nic = nic;
        this.name = name;
    }
}
class Employee extends Person {
    float salary;
    Employee(int nic,String name,float salary) {
        super(nic, name);
        this.salary = salary;
    }
    void output() {
        System.out.println(nic);
        System.out.println(name);
        System.out.println(salary);
    }

}
class Test {
    public static void main(String[] args) {
        Employee e = new Employee(200202,"Kavindu",1000f);
        e.output();

    }
}