package math;
/**
 * The MyMath provides simple arithmetic operations
 * that serve as hands-on practice on Unit Testing.
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */
public class MyMath {
    public int factorial(int n){
        if(n<0 || n>12){
            throw new IllegalArgumentException();
        }
        if(n==0){
            return 1;
        }
        else return n * factorial(n - 1);

    }
    public boolean isPrime(int n){
        boolean flag = true;
        if (n<2){
            throw new IllegalArgumentException("Prime numbers are greater than 1");
        }
        else {
            for (int i=2; i<n; i++){
                if(n%i==0) {
                    flag = false;
                    break;
                }
            }
        }
    return flag;
    }
}