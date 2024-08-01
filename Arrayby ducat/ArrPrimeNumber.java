class ArrPrimeNumber {
    public static void main(String[] args) {
        int[] arr = {12, 14, 7, 9, 3};
        int primeCount = 0;

        
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeCount++;
            }
        }

        
        int[] arr1 = new int[primeCount];
        int x = 0;

        
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr1[x++] = arr[i];
            }
        }

       
        System.out.println("First Array: " + java.util.Arrays.toString(arr));
        System.out.println("Copy Array with prime numbers: " + java.util.Arrays.toString(arr1));
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
