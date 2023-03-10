public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index : arr) {
            sum += index;
        }
        System.out.println("Expenses per month is " + sum + " rubles");
    }
    public static void task2() {
        System.out.println("Task 2");
        int[] arr = generateRandomArray();
        int minExpense = arr[0];
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] < minExpense) {
                minExpense = arr[a];
            }
        }
        int maxExpense = arr[0];
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] > maxExpense) {
                maxExpense = arr[b];
            }
        }
        System.out.println("Min expense per month is " + minExpense + " rubles. Max expense per month is " + maxExpense + " rubles.");
    }
    public static void task3() {
        System.out.println("Task 3");
        int[] arr = generateRandomArray();
        double averageExpense = 0;
        for (int j : arr) {
            averageExpense = (averageExpense + j) / 30;
        }
        System.out.println("Average expense per month is " + averageExpense + " rubles");
    }
    public static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int l = reverseFullName.length; l > 0; l = l - 1) {
            System.out.print(reverseFullName[l - 1]);
        }
    }
}