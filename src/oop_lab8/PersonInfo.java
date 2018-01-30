package oop_lab8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student("123456789",
                "Tan",
                "Male",
                20,
                "357411110017",
                "IS:Management Technology");
        System.out.println(student.toString());
        System.out.println(student.getName());

        Employee employee = new Employee("123456789",
                "Tan",
                "Male",
                20,
                "0843599153",
                "Apiwat",
                "10000");
        System.out.println(employee.toString());
        System.out.println(employee.getName());
    }
}
