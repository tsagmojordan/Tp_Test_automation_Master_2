import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestEquation {

    private final double tol = 1e-6;

    public List<HashMap<String, String>> runAllTest() {
        CaseAdapter ca = new CaseAdapter();
        ArrayList<HashMap<String, String>> results = new ArrayList<>();
        ArrayList<ArrayList<Double>> list = ca.readAndProcessFile("TestEquation.txt");
        //System.out.println(list.size());
        Equation equation = new Equation();

        for (ArrayList<Double> l : list) {
            HashMap<String, String> result = new HashMap<>();
            result.put("a", l.get(0).toString());
            result.put("b", l.get(1).toString());
            result.put("c", l.get(2).toString());
            try {
                ArrayList<Double> solutions = equation.resolve(l);
                result.put("solution", solutions.get(0) + " " + solutions.get(1));
                result.put("result", this.testCase(solutions, l) + "");
            } catch (ArithmeticException e) {
                result.put("solution", e.getMessage());

                if (e.getMessage().equals("a is 0")) {
                    result.put("result", (l.get(0) == 0) + "");
                } else if (e.getMessage().equals("delta<0")) {
                    double delta = l.get(1) * l.get(1) - 4 * l.get(0) * l.get(2);
                    result.put("result", (delta < 0) + "");
                }
            }
            results.add(result);
        }
        this.writeReportToCsvFile(results);
        return results;
    }

    public boolean testCase(ArrayList<Double> solutions, ArrayList<Double> equationParameters) {
        boolean result = true;
        for (Double solution : solutions) {
            double temp = equationParameters.get(0) * solution * solution + equationParameters.get(1) * solution + equationParameters.get(2);
            result &= Math.abs(temp) <= this.tol;
        }
        return result;
    }

    public void writeReportToCsvFile(List<HashMap<String, String>> results){
        PrintWriter writer = null;
        //System.out.println(results.size());
        try {
            writer = new PrintWriter("TestReport.csv","UTF-8");
            writer.println("a,b,c,solution,result");
            for (HashMap<String, String> result : results) {
                writer.println(result.get("a") + "," + result.get("b") + "," + result.get("c") + "," + result.get("solution") + "," + result.get("result"));
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
