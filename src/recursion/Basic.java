package recursion;

public class Basic {
//    Print n to 1 (decreasing order)
    public static void printInDecreasingOrder(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        } else {
            System.out.println(n);
            printInDecreasingOrder(n - 1);
        }
    }

//    print 1 to n (increasing order)
    public static void printInIncreasingOrder(int n) {
        int i = 1;
        if (n == 1) {
            System.out.println(i);
            return;
        }
        i++;
        printInDecreasingOrder(n - 1);
        System.out.println(i);
    }

//    Factorial of number
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

//    Print first n natural number
    public static int sumOfNNaturalNumber(int n) {
        // Base Case
        if (n == 1) {
            return 1;
        }

        return n + sumOfNNaturalNumber(n - 1);
    }

//    find nth Fibonacci number
    public static int findNthFibonacciNumber(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }
        return findNthFibonacciNumber(n - 1) + findNthFibonacciNumber(n - 2);
    }

//  Find if the array is sorted or not 
    public static boolean isSorted(int[] arr, int i) {
//        Base cases
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurrence(int[] arr, int value, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == value) {
            return i;
        }
        return firstOccurrence(arr, value, i + 1);
    }

    public static int lastOccurrence(int[] arr, int value, int i) {
        if (i == arr.length)
            return -1;
        int isFound = lastOccurrence(arr, value, i + 1);
        if (isFound == -1 && arr[i] == value)
            return i;
        return isFound;
    }

//    Find X^n
    public static int printXToThePowerN(int x, int n) {
        // Base case
        if (n == 0)
            return 1;
        return x * printXToThePowerN(x, n - 1);

    }

    public static int printXToThePowerN2(int x, int n) {
        // Base case
        if (n == 1)
            return x;
        int half_power = printXToThePowerN2(x, n/2);
        int half_power_squre = half_power * half_power;

        if (n % 2 != 0)
            return x * half_power_squre;
        return half_power_squre;
    }

    public static void main(String[] args) {
//        printInIncreasingOrder(5);
//        System.out.println(factorial(5));
//        System.out.println(sumOfNNaturalNumber(5));
//        System.out.println(findNthFibonacciNumber(10));
        int[] arr = { 1, 4, 3, 7, 4 };
//        System.out.println(isSorted(arr, 0));
//        System.out.println(firstOccurrence(arr, 89, 0));
//        System.out.println(lastOccurrence(arr, 4, 0));

//        System.out.println(printXToThePowerN(2, 5));
        System.out.println(printXToThePowerN2(2, 5));

    }
}
