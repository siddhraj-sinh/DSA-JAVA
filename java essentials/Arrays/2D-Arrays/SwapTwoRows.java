class SwapTwoRows{
  public static void main(String[] args) {
    int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
    /*
    swap first row with last row
    */
    for (int i=0;i<arr.length;i++) {
       for (int j=0;j<arr[0].length;j++) {
         System.out.print(arr[i][j]+" ");
       }
       System.out.println();
    }
    System.out.println("*****AFTER SWAPING *****");
    int row1 = 0;      //just to row1 and row2 for different rows swapping also for column swap follow same steps 
    int row2= arr.length-1;

    for(int j=0;j<arr[0].length;j++){
    int temp = arr[row1][j];
      arr[row1][j] = arr[row2][j];
      arr[row2][j]=temp;
    }
    for (int i=0;i<arr.length;i++) {
       for (int j=0;j<arr[0].length;j++) {
         System.out.print(arr[i][j]+" ");
       }
       System.out.println();
    }
  }
}
