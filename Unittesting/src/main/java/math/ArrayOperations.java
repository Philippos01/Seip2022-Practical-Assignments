package math;

import io.FileIO;
public class ArrayOperations {
    public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
        int k=0;
        boolean is_prime;
        int[] txt_numbers = fileIo.readFile(filepath);
        for (int i = 0; i < txt_numbers.length; i++) {
             is_prime = myMath.isPrime(txt_numbers[i]);
            if (is_prime == true) {
                k=k+1;
            }
        }
        int[] prime_numbers=new int[k];
        int p=0;
        for (int i = 0; i < txt_numbers.length; i++) {
             is_prime = myMath.isPrime(txt_numbers[i]);
            if (is_prime == true) {
                prime_numbers[p]=txt_numbers[i];
                p++;
            }
        }

        return prime_numbers;
    }
    }

