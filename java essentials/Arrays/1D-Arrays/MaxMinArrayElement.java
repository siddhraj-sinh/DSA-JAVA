class MaxMinArrayElement{
  static int findMax(int a[]){
    int max=a[0];
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
      }
    }
    return max;
  }
  static int findMin(int a[]){
    int min=a[0];
    for(int i=0;i<a.length;i++){
      if(a[i]<min){
        min=a[i];
      }
    }
    return min;
  }
 public static void main(String[] args) {
    int arr[] = {10,50,30,20,5,65};
    int max=findMax(arr);
    int min=findMin(arr);
    System.out.println("maximum element is "+max);
    System.out.println("minimum element is "+min);
 }
}
