package Exercise5.FlyWeight;

import java.util.Random;

public class ImplementFlyWeight {
    private static String employeeType[] = {"Developer", "Tester"};
  private static String skills[] = {"JS", "C++", ".Net", "JAVA"};
  
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++) {
      Emoloyee e = EmployeeFactory.getEmployee(getRandEmployee());
      
      e.assignSkill(getRandSkill());
      System.out.println(e.hashCode());
      e.task();
    }
  }
  
  public static String getRandEmployee() {
    Random r = new Random();
    int randInt = r.nextInt(employeeType.length);
    
    return employeeType[randInt];
  }
  
  public static String getRandSkill() {
    Random r = new Random();
    int randInt = r.nextInt(skills.length);
    
    return skills[randInt];
  }
}
