class ReverseBubbleSort{
  static void reverseSort(int a[],int n){
    for(int i=0;i<n-1;i++){
    for(int j=0;j<n-1;j++){
      if(a[j]<a[j+1]){
        int temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
      }
    }
  }
  }
  public static void main(String[] args) {
    int a[]={1,3,4,-1,20};
    int size= a.length;
    reverseSort(a,size);
    for(int n:a){
      System.out.println(n);
    }
  }
}
