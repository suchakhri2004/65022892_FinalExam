import java.util.ArrayList;
interface Person {
   String getName();
   void setName(String name);
   int getAge();
   void setAge(int age);
}

interface Job {
   String getPosition();
   void setPosition(String position);
   String getEmpID();
   void setEmpID(String empID);
}

class Project {
   private String projectName;
   private String description;
   public Project(String projectName, String description) {
       this.projectName = projectName;
       this.description = description;
   }
   public String getProject() {
       return projectName + " : " + description;
   }
}

class Employee implements Person, Job {
   private String name;
   private int age;
   private String position;
   private String empID;
   private ArrayList<Project> myProjects = new ArrayList<>();
   public Employee(String name, int age, String position, String empID) {
       this.name = name;
       this.age = age;
       this.position = position;
       this.empID = empID;
   }
   public void AddProject(Project project) {
       myProjects.add(project);
   }
   public void ShowDetails() {
       System.out.println("Name : " + name);
       System.out.println("Position : " + position);
       System.out.println("EmpID : " + empID);
       System.out.println("Projects");
       for (Project project : myProjects) {
           System.out.println("\t" + project.getProject());
       }
       System.out.println("************************");
   }
   
   @Override
   public String getName() {
       return name;
   }
   @Override
   public void setName(String name) {
       this.name = name;
   }
   @Override
   public int getAge() {
       return age;
   }
   @Override
   public void setAge(int age) {
       this.age = age;
   }
   @Override
   public String getPosition() {
       return position;
   }
   @Override
   public void setPosition(String position) {
       this.position = position;
   }
   @Override
   public String getEmpID() {
       return empID;
   }
   @Override
   public void setEmpID(String empID) {
       this.empID = empID;
   }
}

public class FInalExam {
   public static void main(String[] args) {
       Project project1 = new Project("web A", "Developing a web application");
       Project project2 = new Project("Mobile app A", "Developing a mobile app");
       Employee employee1 = new Employee("Tom", 30, "UX/UI", "0001");
       Employee employee2 = new Employee("Tim", 25, "FontEnd", "0002");

       employee1.AddProject(project1);
       employee1.AddProject(project2);
       employee2.AddProject(project1);

       employee1.ShowDetails();
       employee2.ShowDetails();
   }
}