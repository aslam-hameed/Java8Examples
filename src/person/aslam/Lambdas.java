package person.aslam;

/**
 * Created by Aslam on 3/14/16.
 */
public class Lambdas {
    public static void main(String args[]) {
        Lambdas tester = new Lambdas();

        Math addition = ( a, b) ->  a + b;

        Math substraction = ( a, b) ->  {return a - b; };

        System.out.println("10 + 5 =" + tester.executeOperation(10, 5, addition));
        System.out.println("10 - 5 =" + tester.executeOperation(10, 5, substraction));
    }

    private interface Math {
        int operation(int a, int b);
    }

    private int executeOperation(int a, int b, Math operation) {
        return operation.operation( a, b);
    }

}