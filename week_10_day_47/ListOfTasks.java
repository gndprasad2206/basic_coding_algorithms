/*You are creating a program to keep track of a list of tasks for a project. Each task has a unique ID, a name, a description, a due date, and a status (e.g. "in progress", "completed", "overdue"). You decide to use a HashSet to store the task IDs, and you need to implement some functionality for adding and removing tasks from the list, as well as updating the status of a task. Write a Java program that implements the following:

 

1. Add Task

 

2. Remove Task

 

3. Update status of Task

 

4. Display all the Tasks

 

5. Display "in progress" Tasks

 

6. Display "completed" tasks

 

7. Display "overdue" tasks  */
import java.util.*;
import java.text.*;
class ProjectList{
  private static int nextId=1;
  private int id;
  private String name;
  private String description;
  private Date date;
  private String status;
  public ProjectList(String name,String description,Date date,String status){
    this.name=name;
    this.description=description;
    this.date=date;
    this.status=status;
    id=nextId++;
  }
}
class Project{
  HashSet<ProjectList> projects=new HashSet<ProjectList>();
  public void addTask(ProjectList task){
    
  }
}
public class ListOfTasks{
  public static void main(String[] args) throws Exception{
    Scanner sc=new Scanner(System.in);
    Project p=new Project();
    boolean b=true;
    while(b){
      System.out.println("1.Add Task\n2.Remove Task\n3.Update Status Of Task\n4.Display the all tasks\n5. Display in progress Tasks\n6. Display completed tasks\n7. Display overdue tasks\nSelect One Option");
      int choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.println();
          System.out.print("Enter Name: ");
          String name=sc.nextLine();
          System.out.print("Write the description of task");
          String description=sc.nextLine();
          System.out.println("Enter Date");
          String dateOfTask=sc.nextLine();
          DateFormat df=new SimpleDateFormat("DD/MM/YYYY");
          Date presentDate=df.parse(dateOfTask);
          
          
      }
    }
  }
}