public class Employee {

    int salary = 65000;
    void empWork()
    {
        System.out.println("empWork");
    }
}

class Programmer extends Employee
{
    int bonus = 20000;

    @Override
    void empWork()
    {
        System.out.println("empWork 2");
    }

    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();
        System.out.println(p.salary);
        p.empWork();


        Programmer obj1 = new Programmer();
     //   Programmer obj2 = new Employee();

        Employee obj3 = new Programmer(); // upcasting
    }
}
