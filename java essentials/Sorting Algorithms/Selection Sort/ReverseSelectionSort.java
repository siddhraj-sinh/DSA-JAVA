class ReverseSelectionSort{

  static void sort(int a[],int n){
    for(int i=0;i<n-1;i++){
      int min=i;
      for(int j=i+1;j<n;j++){
        if(a[j]>a[min]){
          min=j;
        }
      }
      int temp=a[min];
      a[min]=a[i];
      a[i]=temp;
    }
  }
  public static void main(String[] args) {
    int a[]={2,1,8,7};
    int size = a.length;

    sort(a,size);

    for(int i:a){
      System.out.print(i+" ");
    }
  }
}
