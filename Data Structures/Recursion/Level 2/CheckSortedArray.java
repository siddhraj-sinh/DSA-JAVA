class CheckSortedArray{
  public static boolean check(int a[],int idx){
   if(idx==a.length-1){
     return true;
   }
   if(!check(a,idx+1)){
     return false;
   }

   return a[idx]<a[idx+1];
  }
  public static void main(String[] args) {
    int a[]={1,2,3};
    if(check(a,0)){
      System.out.println("it is sorted");
    }else{
      System.out.println("it is not sorted");
    }
  }
}
