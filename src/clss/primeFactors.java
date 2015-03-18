package clss;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisolvera on 17/03/15.
 */


public class primeFactors {

    public static List<Integer> generate(int numero) {
        List <Integer> num_primos = new ArrayList<Integer>();
            if (numero>1)
                for ( int divisor=2 ; numero>1;divisor++)
                    for ( ;numero % divisor == 0 ; numero /= divisor )
                            num_primos.add(divisor);
       return  num_primos;
    }
}
