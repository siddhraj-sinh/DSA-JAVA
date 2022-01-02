import java.util.Scanner;
class OneDArray{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int array[] = new int[size];
    for(int i=0;i<array.length;i++){
      int element = input.nextInt();
      array[i]= element;
    }
    for(int i=0;i<array.length;i++){
      System.out.println(array[i]);
    }
  }
}
