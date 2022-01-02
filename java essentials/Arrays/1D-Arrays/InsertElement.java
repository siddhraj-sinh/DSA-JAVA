import java.util.Scanner;
class InsertElement{

  static boolean insert(int arr[],int i, int value){
    if(i<arr.length){
      arr[i]=value;
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a[]={10,20,30,40};//declaration, instantiation and initialization
//printing array
System.out.print("Enter index number where you want to insert: ");
int index = input.nextInt();
System.out.print("Enter value you want to insert: ");
int value = input.nextInt();
boolean insert = insert(a,index,value);
if(insert){
  System.out.println("item inserted successfully");
}
else{
  System.out.println("item can not be inserted");
}
for (int i=0;i<a.length;i++) {

  System.out.print(a[i]);
}
}
}
