package Exercise5.FlyWeight;

public class Developer implements Emoloyee {

    private final String JOB;
    private String skill;
    
    public Developer() {
      JOB = "Fix the issue";
    }
    
    @Override
    public void assignSkill(String skill) {
      this.skill = skill;
    }
  
    @Override
    public void task() {
      System.out.println("Developer with skill: " + this.skill + " with Job: " + JOB);
    }
    
  
}
