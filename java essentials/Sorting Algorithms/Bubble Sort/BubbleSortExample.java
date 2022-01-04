class BubbleSortExample{

  static void sort(int a[],int n){
    for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1; j++)
            if (a[j] > a[j+1]) //comparing the pair of elements
               {
                 // swaping a[j+1] and a[i]
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
        }
  }
  public static void main(String[] args) {
    int a[] = {3,-1,4,28,6};
    int l = a.length;
    sort(a,l);
    for (int i=0;i<l;i++) {
      System.out.print(a[i]+" ");
    }
  }
}
