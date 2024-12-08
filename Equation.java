import java.util.ArrayList;

public class Equation {
    public ArrayList<Double> resolve(double a,double b , double c) throws ArithmeticException{
        if(a==0){
            throw new ArithmeticException("a is 0");
        }
        double delta= b*b-4*a*c;
        if(delta<0){
            throw new ArithmeticException("delta<0");
        }
        if (Math.abs(b) > Math.sqrt(Double.MAX_VALUE)) {
            throw new ArithmeticException("b_is_too_large");
        }
        ArrayList<Double> result=new ArrayList<>();
        result.add((-b+Math.sqrt(delta))/(2*a));
        result.add((-b-Math.sqrt(delta))/(2*a));
        return result;
    }

    public ArrayList<Double> resolve(ArrayList<Double> list){
        return this.resolve(list.get(0),list.get(1),list.get(2));
    }
}
