class ReverseArray{
  static void reverse(int arr[],int c){
    int b[] = new int[c];
    int j=c;
    for (int i=0;i<c;i++) {
      b[j-1] = arr[i];
      j--;
    }
    for(int i=0;i<c;i++){
        System.out.print(b[i]+" ");
    }
  }
  public static void main(String[] args) {
    int a[] = {10,20,30};
    int s = a.length;
    reverse(a,s);
  }
}
