package clss;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisolvera on 17/03/15.
 */


public class primeFactors {

    public static List<Integer> generate(int numero) {
        List <Integer> num_primos = new ArrayList<Integer>();
            if (numero>1) {
                int n = 2;
                while (n <= numero) {
                    if (numero % n > 0)
                    n++;
                   else {
                        num_primos.add(n);
                        numero = numero / n;
                    }
                }
            }
        return  num_primos;
    }
}
