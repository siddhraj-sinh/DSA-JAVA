import java.util.Scanner;
class ContainsElement{
  static int search(int a[],int x){
    for (int i=0;i<a.length;i++) {
      if(a[i]==x){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = input.nextInt();
    int arr[] = new int[size];
    for (int i=0;i<arr.length;i++) {
      int element = input.nextInt();
      arr[i]=element;
    }
    System.out.print("Enter the element you want to find ");
    int find = input.nextInt();
    int index = search(arr,find);
    if(index != -1){
      System.out.println(find+" is located at "+index);
    }else{
      System.out.println(find+" is not found in the array");
    }

  }

}
