/*
Programming Exercise 6.26 p.262 (Palindromic prime)
 */
package lab_03;

class Ex_06_26 {

    public static void main(String[] args) {
        final int sizeArrary = (int) 1e4;
        int[] arraryPrime = new int[sizeArrary];

        int tailIndexPrime = 0;
        arraryPrime[tailIndexPrime++] = 2;

        int checkIndexPrime;

        int numStart = 3;
        int numCurrent;
        int numStop = (int) 1e5;

        for (numCurrent = numStart; numCurrent <= numStop; numCurrent += 2) {
            for (checkIndexPrime = 0; checkIndexPrime < tailIndexPrime; checkIndexPrime++) {
                if (numCurrent % arraryPrime[checkIndexPrime] == 0) {
                    break;
                }
            }

            if (checkIndexPrime == tailIndexPrime) {
                arraryPrime[tailIndexPrime++] = numCurrent;
            }
        }

        put(arraryPrime, tailIndexPrime);
    }

    public static boolean checkPararindom(int prime) {
        int num = prime;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (prime == rev) {
            return true;
        }

        return false;
    }

    public static void put(int[] arraryPrime, int tailIndexPrime) {
        int line = 0;

        for (int i = 0; i < tailIndexPrime; i++) {
            if (checkPararindom(arraryPrime[i])) {
                System.out.print(arraryPrime[i] + " ");
                line++;
            }

            if (line == 10) {
                line = 0;
                System.out.println();
            }
        }
    }
}
