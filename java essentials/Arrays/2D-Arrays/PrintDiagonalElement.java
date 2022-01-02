class PrintDiagonalElement{
  public static void main(String[] args) {
    int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
   for(int i=0;i<arr.length;i++){
     for (int j=0;j<arr.length;j++) {
       if((i==j) || (i+j+1==arr.length)){
       System.out.print(arr[i][j]+" ");
     }
     else{
       System.out.print("   ");
     }
     }
     System.out.println();
   }
  }
}
