class Print2DArray{
  public static void main(String[] args) {
    int arr[][]={{10,20},{30,40},{50,60}};

    for (int i=0;i<arr.length;i++) {
       for (int j=0;j<arr[0].length;j++) {
         System.out.print(arr[i][j]+" ");
       }
       System.out.println();
    }
  }
}