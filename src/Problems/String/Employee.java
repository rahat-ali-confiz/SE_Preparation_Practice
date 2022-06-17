package Problems.String;

public class Employee {

    public int age;
    public String name;
    int data=50;

    void change(int data){
        data= data+100;
    }

    Employee(int age, String name){
        this.age = age;
        this.name = name;
    }
    Employee(){
        age = 0;
        name = "";
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void modifyEmployee(Employee newEmp){
       newEmp.setAge(24);
       newEmp.setName("Rahat");

       newEmp = new Employee();
       newEmp.setAge(25);
       newEmp.setName("Rahat1");
    }
}
