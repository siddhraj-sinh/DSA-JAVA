class ReverseInsertionSort{
  static void sort(int a[],int n){
    for (int i=1;i<n;i++) {
    int temp=a[i];
    int j=i-1;

      while(j>=0 && a[j]<temp){
        a[j+1]=a[j];
        j--;
      }
      a[j+1]=temp;
    }
  }
  public static void main(String[] args) {
    int a[]={ 12,11,13,5,6};
    int size=a.length;
    sort(a,size);
    for (int i = 0; i < size; ++i){
            System.out.print(a[i] + " ");
            System.out.println();
    }
  }
}
