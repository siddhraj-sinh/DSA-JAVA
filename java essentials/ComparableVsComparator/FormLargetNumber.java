import java.util.*;


class FormLargetNumber{
  static void printLargest(List<String> arr){
    Collections.sort(arr, new Comparator<String>(){
        public int compare(String x, String y){
         String xy = x+y;
         String yx = y+x;
         return xy.compareTo(yx)> 0 ? -1 : 1;
        //String xy - yx;
        }
    });
    System.out.println(String.valueOf(arr));
    for(String i:arr){
      System.out.print(i);
    }
  }
  public static void main(String[] args) {
  //  int arr[] = {54,546,548,60};
    List<String> arr = new ArrayList<>();
    arr.add("54");
    arr.add("546");
    arr.add("548");
    arr.add("60");
    printLargest(arr);
  }
}
