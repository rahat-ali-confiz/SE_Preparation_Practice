package Problems.String;

public class TestMain {
    public static void main(String[] args){
        int age = 20;
        String name = "Taha";

        Employee emp = new Employee(age,name);

        System.out.println("before change "+emp.data);
        emp.change(100);
        System.out.println("after change "+emp.data);
        System.out.println("before change "+emp.getName()+" "+emp.getAge());
        emp.modifyEmployee(emp);
        System.out.println("after change "+emp.getName()+" "+emp.getAge());
    }
}
