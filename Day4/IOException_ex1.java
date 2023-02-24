package Day4;

import java.io.FileReader;

public class IOException_ex1 {
    public static void main(String[] args) throws Exception {
        DemoException d = new DemoException();
        d.ReadFile("hiii");
    }
}


class DemoException  {

    public void ReadFile(String S) throws Exception{
//        try {
            FileReader f = new FileReader(S);
//        }finally{}
    }
    
}
