package Assignments.OOP;


import java.util.ArrayList;
import java.util.List;

class College{
    public String name;
    public String address;

    College(String name,String address){
        System.out.println("Parameterized Constructor");
        this.name = name;
        this.address = address;
    }

}
class University{
     private final List<College> colleges;

    University(List<College> colleges) {
        this.colleges = colleges;
    }

    public List<College> getListOfColleges(){
        return colleges;
    }
}
public class CompositionPractice {

  public static void main(String[] args){
      College punjabCollege = new College("Punjab College","Muslim Town,Lahore");
      College superiorCollege = new College("Superior College","Kalma Chowk,Lahore");
      College governmentCollege = new College("Government College","Old Anarkali bazar,Lahore");

      List<College> college = new ArrayList<>();
      college.add(punjabCollege);
      college.add(superiorCollege);
      college.add(governmentCollege);

      University university = new University(college);
      List<College> colleges = university.getListOfColleges();
      for (College col : colleges){
          System.out.println("Name : "+col.name + " and "+ " Address : "+col.address);
      }

  }
}
