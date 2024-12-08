import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class TestCodeGenerator {

    public void generateTestCode(){
        PrintWriter writer = null;
        CaseAdapter ca = new CaseAdapter();
        ArrayList<ArrayList<JennyCase>> lists=ca.readAndProcessFile2("TestEquation.txt");
        try {
            writer = new PrintWriter("EquationTestG.java","UTF-8");
            writer.println("import org.junit.jupiter.api.Test;\n" +
                    "\n" +
                    "import java.util.ArrayList;\n" +
                    "\n" +
                    "import static org.junit.jupiter.api.Assertions.assertEquals;\n" +
                    "import static org.junit.jupiter.api.Assertions.assertTrue;");
            writer.println("public class EquationTestG {\n" +
                    "\n" +
                    "    private final double tol=1e-6;\n" +
                    "\n");
            for ( ArrayList<JennyCase> list: lists) {
                String name="a_"+list.get(0).name+"_b_"+list.get(1).name+"_c_"+list.get(2).name;
                writer.println(" @Test\n" +
                        "    public void test_cas_"+name+"(){\n" +
                        "        Equation equation = new Equation();\n" +
                        "        double a="+list.get(0).value+";\n" +
                        "        double b="+list.get(1).value+";\n" +
                        "        double c="+list.get(2).value+";\n" +
                        "        try {\n" +
                        "            ArrayList<Double> solutions = equation.resolve(a,b,c);\n" +
                        "            assertEquals(0,\n" +
                        "                    Math.abs(\n" +
                        "                            a*solutions.get(0)*solutions.get(0)\n" +
                        "                                    +b*solutions.get(0)\n" +
                        "                                    +c),this.tol);\n" +
                        "            assertEquals(0,\n" +
                        "                    Math.abs(\n" +
                        "                            a*solutions.get(1)*solutions.get(1)\n" +
                        "                                    +b*solutions.get(1)\n" +
                        "                                    +c),this.tol);\n" +
                        "\n" +
                        "        } catch (ArithmeticException e) {\n" +
                        "            if (e.getMessage().equals(\"a is 0\")) {\n" +
                        "                assertEquals(0,a);\n" +
                        "            } else if (e.getMessage().equals(\"delta<0\")) {\n" +
                        "                double delta = b*b-4*a*c;\n" +
                        "                assertTrue(delta<0);\n" +
                        "            }\n" +
                        "               else if (e.getMessage().equals(\"b_is_too_large\")) {\n" +
                        "                assertTrue(Math.abs(b) > Math.sqrt(Double.MAX_VALUE));\n" +
                        "            }" +
                        "        }\n" +
                        "\n" +
                        "    }");
            }
            writer.println("}");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        TestCodeGenerator testCodeGenerator=new TestCodeGenerator();
        testCodeGenerator.generateTestCode();
    }
}
