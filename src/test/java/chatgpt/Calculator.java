package chatgpt;

import org.junit.Test;
import java.util.Scanner;

public class Calculator {

  int a;
  int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int coverageTest() {



        int result = (a + b);

        if (result > 0) {

            System.out.println("Greater than zero");
            return  result;

        } else if (result < 0) {
            System.out.println("Lesser than 0");
            return result;

        } else {
            System.out.println("Zero");
            return result;
        }



    }


}


