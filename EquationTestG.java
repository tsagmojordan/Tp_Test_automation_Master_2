import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class EquationTestG {

    private final double tol=1e-6;


 @Test
    public void test_cas_a_nul_b_normal_positif_c_nul(){
        Equation equation = new Equation();
        double a=0.0;
        double b=8306.235036513792;
        double c=0.0;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_positif_b_proche_de_zero_negatif_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=8.085510984647617E-6;
        double b=-13.841002627007267;
        double c=3.395510397729064E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_tres_grand_positif_c_normal_positif(){
        Equation equation = new Equation();
        double a=14.080885644660919;
        double b=8.06818218998556E9;
        double c=2512.371707026027;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_tres_proche_de_zero_positif_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=4143.2475722635745;
        double b=9.744699448104558E-6;
        double c=7.419095942131973;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_tres_proche_de_zero_negatif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=9.670322219155819E9;
        double b=-9.182442647939893E-7;
        double c=-3.418028725937863E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_tres_grand_negatif_c_normal_negatif(){
        Equation equation = new Equation();
        double a=-6.399828495427474E-6;
        double b=-4.745610903483858E9;
        double c=-2707.670734861548;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_negatif_b_nul_c_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=-13.939439099447272;
        double b=0.0;
        double c=-5.010563257105801;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_proche_de_zero_positif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=-7061.393147967898;
        double b=10.01291260812112;
        double c=6.152224486426555E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_normal_negatif_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=-3.309314117133506E9;
        double b=-7765.591006883695;
        double c=-2.9221073470831633E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_nul_b_nul_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=0.0;
        double b=0.0;
        double c=-2.350277181662652E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_positif_b_nul_c_nul(){
        Equation equation = new Equation();
        double a=6.830397061929937E-6;
        double b=0.0;
        double c=0.0;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_nul_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=8.10151639954944;
        double b=0.0;
        double c=1.2216970990869102E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_nul_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=9443.885449208843;
        double b=0.0;
        double c=2.0750734324893373E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_nul_c_normal_positif(){
        Equation equation = new Equation();
        double a=8.835288190863514E9;
        double b=0.0;
        double c=7998.655609714687;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_nul_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=-6.031373411378527E-6;
        double b=0.0;
        double c=-7.816743293644856E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_negatif_b_tres_proche_de_zero_positif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=-14.45304216848212;
        double b=5.507284445604526E-6;
        double c=3.101271282486591E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_nul_c_normal_negatif(){
        Equation equation = new Equation();
        double a=-306.20366554860993;
        double b=0.0;
        double c=-3018.732934771894;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_nul_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=-6.220934912779587E9;
        double b=0.0;
        double c=13.129735315800128;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_nul_b_proche_de_zero_positif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=0.0;
        double b=14.384156467664798;
        double c=-2.0859553359210495E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_positif_b_normal_positif_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=1.4660042774846439E-6;
        double b=9040.809036281802;
        double c=-5.698321655796302E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_nul_b_tres_grand_positif_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=0.0;
        double b=7.242450765289816E9;
        double c=9.173175661947425;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_nul_b_tres_proche_de_zero_negatif_c_normal_positif(){
        Equation equation = new Equation();
        double a=0.0;
        double b=-4.6518677777164565E-7;
        double c=625.0849170160994;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_nul_b_proche_de_zero_negatif_c_normal_negatif(){
        Equation equation = new Equation();
        double a=0.0;
        double b=-11.487002200549645;
        double c=-5350.470881958649;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_nul_b_normal_negatif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=0.0;
        double b=-7651.240916243225;
        double c=8.100791068577944E8;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_nul_b_tres_grand_negatif_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=0.0;
        double b=-7.478097645307651E9;
        double c=4.219633361521857E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_nul_b_tres_proche_de_zero_positif_c_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=0.0;
        double b=9.458215417938182E-6;
        double c=-13.022612047303674;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_proche_de_zero_positif_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=7.924114383698811;
        double b=3.3829061179465905;
        double c=-6.320767793903313E8;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_tres_grand_negatif_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=1179.8226476776358;
        double b=-3.8445104908821106E7;
        double c=-5.846749072012953E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_proche_de_zero_negatif_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=2.300785959633448E9;
        double b=-13.982368905608244;
        double c=-2.4211361003693285E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_tres_proche_de_zero_positif_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=-2.7326479737940482E-6;
        double b=5.911755190997356E-6;
        double c=-1.7684040146840096E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }
        }

    }
 @Test
    public void test_cas_a_proche_de_zero_negatif_b_tres_grand_positif_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=-6.070991631488447;
        double b=6.184306704740364E9;
        double c=-4.752695833923183E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_tres_proche_de_zero_negatif_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=-5916.593701599648;
        double b=-3.6770991972080583E-6;
        double c=-7.964693748091602E8;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_normal_positif_c_normal_negatif(){
        Equation equation = new Equation();
        double a=-4.0516487920305605E9;
        double b=5490.309931941654;
        double c=-2530.8390982199953;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_negatif_b_normal_negatif_c_normal_negatif(){
        Equation equation = new Equation();
        double a=-11.713724404994256;
        double b=-3616.5930106739033;
        double c=-571.7097890647929;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_tres_grand_negatif_c_nul(){
        Equation equation = new Equation();
        double a=9.811501646577488E9;
        double b=-7.520850992103314E9;
        double c=0.0;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_tres_grand_negatif_c_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=-7.363191021976968E9;
        double b=-5.5181557979506235E9;
        double c=-12.032314379383985;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_positif_b_tres_grand_positif_c_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=9.551970945124616E-6;
        double b=4.755980757504325E9;
        double c=-4.594376999693321;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_proche_de_zero_negatif_c_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=5.22505875974583;
        double b=-5.631219722419193;
        double c=-9.942632041667386;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_normal_positif_c_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=5129.874551659515;
        double b=5794.022746040897;
        double c=-11.506956343467369;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_tres_proche_de_zero_negatif_c_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=-3.703367746270825E-7;
        double b=-6.539438779910039E-6;
        double c=-3.8183012928212747;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_normal_negatif_c_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=-108.01272523600346;
        double b=-3960.0360585170984;
        double c=-4.379144024334719;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_proche_de_zero_positif_c_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=1.2849339353541713E9;
        double b=12.182727684487054;
        double c=-11.15819217635641;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_proche_de_zero_negatif_c_nul(){
        Equation equation = new Equation();
        double a=-7.254759911759778E-6;
        double b=-7.475983556628826;
        double c=0.0;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_tres_proche_de_zero_negatif_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=-2.2623893202382793E9;
        double b=-8.78062605229386E-6;
        double c=2.2458780398703963E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_negatif_b_proche_de_zero_negatif_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=-8.737929946561982;
        double b=-4.028410758894692;
        double c=11.938559051701104;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_proche_de_zero_negatif_c_normal_positif(){
        Equation equation = new Equation();
        double a=-6.51846776288769E9;
        double b=-7.893689578654508;
        double c=126.78839692140741;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_proche_de_zero_negatif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=-5659.401392955228;
        double b=-7.121297436248727;
        double c=-2.330989670099151E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_positif_b_tres_grand_negatif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=9.164926544932953E-6;
        double b=-4.733214489675393E9;
        double c=3.238351933213326E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_tres_proche_de_zero_negatif_c_normal_negatif(){
        Equation equation = new Equation();
        double a=9.721300770241776;
        double b=-1.172052305599125E-6;
        double c=-7082.342167394255;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_tres_proche_de_zero_negatif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=835.5651001575518;
        double b=-8.612528538141808E-6;
        double c=8.191687910795634E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_positif_b_tres_proche_de_zero_positif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=7.68437330263914E-6;
        double b=2.2169271251585522E-6;
        double c=-8.173856055570077E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_negatif_b_proche_de_zero_positif_c_normal_positif(){
        Equation equation = new Equation();
        double a=-14.28487927372732;
        double b=9.81285940427478;
        double c=4514.205200820678;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_normal_positif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=8.415019690650211E9;
        double b=7943.880738158082;
        double c=7.111146390615459E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_tres_grand_positif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=-6.794049579613471E-7;
        double b=2.6827526906580448E8;
        double c=2.3310297552938404E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_normal_negatif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=984.8765937706714;
        double b=-1248.4947741995275;
        double c=-6.124116503633008E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_tres_grand_positif_c_nul(){
        Equation equation = new Equation();
        double a=8350.487325023732;
        double b=7.064178118940343E9;
        double c=0.0;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_normal_positif_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=-6.731502682374005E-6;
        double b=3793.6737450037044;
        double c=2.3808216523968886E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_positif_b_tres_proche_de_zero_negatif_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=4.708836248881374E-6;
        double b=-4.170580834891988E-6;
        double c=7.366915843403772;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_tres_proche_de_zero_positif_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=13.531367865513754;
        double b=5.6621129562146385E-6;
        double c=7.848956997916136E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_normal_positif_c_normal_positif(){
        Equation equation = new Equation();
        double a=-4202.951105473936;
        double b=6925.065151640557;
        double c=6675.048944514535;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_proche_de_zero_positif_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=4.0730095773922877E9;
        double b=4.065641225240168;
        double c=3.952876724282263E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_normal_negatif_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=-2199.102339130288;
        double b=-3787.766131413755;
        double c=1.024774292782572E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_tres_proche_de_zero_positif_c_nul(){
        Equation equation = new Equation();
        double a=-4.615037329637459E9;
        double b=7.643782573193875E-6;
        double c=0.0;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_proche_de_zero_positif_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=-1.668648996647383E-6;
        double b=6.954066905386838;
        double c=9.8074491972809;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_normal_negatif_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=1.3296469792501864E9;
        double b=-1634.922313699326;
        double c=7.5410152740044545;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_tres_grand_negatif_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=4.604729211640934;
        double b=-7.021584728739938E9;
        double c=7.29340295962863;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_negatif_b_normal_positif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=-12.812818501014345;
        double b=495.7781531299964;
        double c=-5.156215315481796E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_tres_grand_positif_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=-4.143088463818228E9;
        double b=7.962391472931478E9;
        double c=7.808200000852392E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_proche_de_zero_positif_c_nul(){
        Equation equation = new Equation();
        double a=-1116.8351390553798;
        double b=11.885596922309722;
        double c=0.0;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_positif_b_normal_negatif_c_normal_positif(){
        Equation equation = new Equation();
        double a=4.79945740252635E-6;
        double b=-1860.8826026038223;
        double c=7571.5570943953435;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_positif_b_proche_de_zero_positif_c_normal_negatif(){
        Equation equation = new Equation();
        double a=2.2520751818685638E-6;
        double b=14.746152845622916;
        double c=-4801.964778647359;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_normal_negatif_c_nul(){
        Equation equation = new Equation();
        double a=4.523447809822273;
        double b=-8376.305936070798;
        double c=0.0;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_tres_grand_positif_c_normal_negatif(){
        Equation equation = new Equation();
        double a=1958.919340163651;
        double b=2.9681830592852135E9;
        double c=-4034.431619555433;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_negatif_b_tres_grand_negatif_c_tres_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=-6.756539499678183;
        double b=-2.2457418704881086E9;
        double c=2.8950712393527003E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_tres_grand_negatif_c_normal_positif(){
        Equation equation = new Equation();
        double a=-78.4258692079311;
        double b=-8.406514556511879E8;
        double c=6590.551269537203;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_tres_proche_de_zero_positif_c_normal_positif(){
        Equation equation = new Equation();
        double a=-4.359048615483817E-6;
        double b=4.479133965807758E-7;
        double c=6632.998508561668;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_tres_grand_negatif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=-1.908088435706108E9;
        double b=-2.374892079667511E9;
        double c=-5.554230470621791E-7;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_proche_de_zero_negatif_c_normal_positif(){
        Equation equation = new Equation();
        double a=6034.899973864862;
        double b=-9.285041278376534;
        double c=1876.0801919225048;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_tres_grand_positif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=7.726408316226523E9;
        double b=9.684558817845156E9;
        double c=-2.80074026407844E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_tres_grand_positif_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=-4013.3581618399967;
        double b=5.746332138206559E9;
        double c=11.397338495395793;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_positif_b_tres_proche_de_zero_positif_c_normal_negatif(){
        Equation equation = new Equation();
        double a=3.5899312527798886E9;
        double b=3.092768939798538E-6;
        double c=-1829.3044714992557;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_normal_positif_c_proche_de_zero_positif(){
        Equation equation = new Equation();
        double a=14.28461467528694;
        double b=1624.0670690796205;
        double c=8.373847303505212;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_negatif_b_tres_proche_de_zero_negatif_c_nul(){
        Equation equation = new Equation();
        double a=-11.416835683106857;
        double b=-2.399079446498571E-6;
        double c=0.0;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_grand_negatif_b_proche_de_zero_positif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=-7.143597348918212E9;
        double b=11.394228275344027;
        double c=8.177220501769651E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_tres_proche_de_zero_negatif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=11.063990426691308;
        double b=-5.716212072219022E-6;
        double c=-6.640051895200583E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_positif_b_proche_de_zero_positif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=4332.501395745936;
        double b=9.678751846279193;
        double c=2.4537169034775615E8;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_tres_proche_de_zero_negatif_b_normal_negatif_c_tres_proche_de_zero_negatif(){
        Equation equation = new Equation();
        double a=-8.05780990188783E-6;
        double b=-2311.6172074795913;
        double c=-7.051196022161381E-6;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_normal_negatif_b_tres_proche_de_zero_positif_c_tres_grand_negatif(){
        Equation equation = new Equation();
        double a=-7669.866505539054;
        double b=5.728864297520838E-6;
        double c=-4.4627664795539E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
 @Test
    public void test_cas_a_proche_de_zero_positif_b_proche_de_zero_negatif_c_tres_grand_positif(){
        Equation equation = new Equation();
        double a=4.196707256537923;
        double b=-7.851279702194546;
        double c=4.2924431817154036E9;
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
            }
               else if (e.getMessage().equals("b_is_too_large")) {
                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));
            }        }

    }
}
