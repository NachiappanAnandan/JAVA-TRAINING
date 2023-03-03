package Exercise5.Momento;

public class Momento {

  
    // value holder
   private String state;
    Momento(String state){
        this.state = state;
    }


    //setting to original value
    public String getState(){
        return this.state;
    }
    public void setState(String state){
       this.state = state;
    }
   
    
}
