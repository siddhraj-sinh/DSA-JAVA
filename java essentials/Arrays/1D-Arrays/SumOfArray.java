import java.util.Scanner;
class SumOfArray{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = input.nextInt();
    int arr[] = new int[size];
    for (int i=0;i<arr.length;i++) {
      int element = input.nextInt();
      arr[i]=element;
    }
    int sum = 0;
    for (int i=0;i<arr.length;i++) {
      sum = sum+arr[i];
    }
    System.out.println("sum of array elements is :" +sum);
  }
}
