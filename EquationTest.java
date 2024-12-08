import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EquationTest {

    private final double tol=1e-6;

    @Test
    public void firstTest(){
        Equation equation = new Equation();
        double a=1;
        double b=0;
        double c=1;
        try {
            ArrayList<Double> solutions = equation.resolve(a,b,c);
            assertEquals(0,
                    Math.abs(
                            a*solutions.get(0)*solutions.get(0)
                                    +b*solutions.get(0)
                                    +c),this.tol);
            assertEquals(0,
                    Math.abs(
                            a*solutions.get(1)*solutions.get(1)
                                    +b*solutions.get(1)
                                    +c),this.tol);

        } catch (ArithmeticException e) {
            if (e.getMessage().equals("a is 0")) {
                assertEquals(0,a);
            } else if (e.getMessage().equals("delta<0")) {
                double delta = b*b-4*a*c;
                assertTrue(delta<0);
            } else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }
        }

    }
    @Test
    public void secondTest(){
        Equation equation = new Equation();
        ArrayList<Double> solution = equation.resolve(1,0,0);
        assertEquals(solution.get(0),0,1e-6);
    }
}
