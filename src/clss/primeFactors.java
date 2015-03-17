package clss;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisolvera on 17/03/15.
 */


public class primeFactors {

    public static List <Integer> num_primos = new ArrayList<Integer>();

          public static List<Integer> generate(int n) {
              if (n>1)
              num_primos.add(2);
        return  num_primos;
    }
}
