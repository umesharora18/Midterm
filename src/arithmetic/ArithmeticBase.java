/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
enum Operation {
    PLUS {
        public double calculate(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        public double calculate(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        public double calculate(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        public double calculate(double x, double y) {
            return x / y;
        }
    };

    public abstract double calculate(double x, double y);
}

public class ArithmeticBase {
    public double calculate(double x, double y, Operation operation) {
        return operation.calculate(x, y);
    }
}
