#Create an array of 5 integers and print each element using a loop. Try and find the max element of this array.
  public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 5, 40, 15};

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum element is: " + max);
    }
}
