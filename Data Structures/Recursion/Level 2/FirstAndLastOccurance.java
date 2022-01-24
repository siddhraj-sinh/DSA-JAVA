class FirstAndLastOccurance{
  public static int first=-1;
  public static int last=-1;
  public static void findOccurance(String s,int idx,char element){

    if(idx>=s.length()){
      System.out.println("First: "+first+"Last: "+last);
      return;
    }
    char currChar=s.charAt(idx);
    if(currChar==element){
      if(first==-1){
        first=idx;
      }else{
        last=idx;
      }
    }
    findOccurance(s,idx+1,element);

  }
  public static void main(String[] args) {
    String str ="ABCDEAF";
    findOccurance(str,0,'A');
  }
}
