package PrototypePattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee a = new Employee(1,"a","b","c","d","e","c", new Employee(2,"Me"), new Employee[]{new Employee(3,"hajdar"), new Employee(14,"Hysen")});
        Employee e = new Employee(1,"a","b","c","d","e","c", a, new Employee[]{new Employee(3,"hajdar"), new Employee(14,"Hysen")});

        Employee b = (Employee) e.doClone();

        System.out.println(b);
    }
}
