package Exercise5.FlyWeight;

import java.util.HashMap;

public class EmployeeFactory {
    private static HashMap<String, Emoloyee> m = new HashMap<String, Emoloyee>();
  
  public static Emoloyee getEmployee(String type) {
    Emoloyee p = null;
    if(m.get(type) != null) {
      p = m.get(type);
    } else {
      switch(type) {
      case "Developer": 
        System.out.println("Developer Created");
        p = new Developer();
        break;
      case "Tester":
        System.out.println("Tester Created");
        p = new Tester();
        break;
      default:
        System.out.println("No Such Employee");
      }
      
      m.put(type, p);
    }
    return p;
}
}