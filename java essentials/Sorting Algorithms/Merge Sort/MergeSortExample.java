class MergeSortExample{
  static void divide(int a[],int si,int ei){
    if(si>=ei){
      return;
    }
   int mid = si + (ei-si)/2;

   divide(a,si,mid);
   divide(a,mid+1,ei);
   conquer(a,si,mid,ei);
  }
  static void conquer(int a[],int si,int mid,int ei){
   int mergedArray[] = new int[ei-si+1];
   int idx1 = si;
   int idx2 = mid+1;
   int x=0;
   while(idx1<=mid && idx2<=ei){
     if(a[idx1]<=a[idx2]){
       mergedArray[x]=a[idx1];
       x++;
       idx1++;
     }else{
       mergedArray[x]=a[idx2];
       x++;
       idx2++;
     }
   }
   while(idx1 <= mid){
     mergedArray[x]=a[idx1];
     x++;
     idx1++;
   }
   while(idx2<=ei){
     mergedArray[x]=a[idx2];
     x++;
     idx2++;
   }
   for (int i=0,j=si;i<mergedArray.length;i++,j++) {
      a[j]=mergedArray[i];
   }
  }
  public static void main(String[] args) {
    int a[]={2,1,8,7,5,6};
    int n= a.length;
    divide(a,0,n-1);
    printArray(a);
  }
  static void printArray(int a[]){
    for (int i=0;i<a.length;i++) {
      System.out.print(a[i]+" ");
    }
  }
}
