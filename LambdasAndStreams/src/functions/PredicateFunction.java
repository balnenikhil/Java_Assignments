package functions;


import java.util.function.Predicate;
public class PredicateFunction<Employee> {
    //Predicate<Employee> bonusLambda= (emp)->emp.getRatings()>10;
    Predicate<String> emptyString= s->s.isEmpty()? true : false;
    public static void main(String[] args) {

    }
}
