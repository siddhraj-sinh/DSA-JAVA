class StringToArray{

  //method one - traiditional
  static char[] methodOne(String s){
    char[] c =  new char[s.length()];
    for(int i=0;i<s.length();i++){
      c[i]=s.charAt(i);
    }
    return c;
  }
  //method methodTwo
  static char[] methodTwo(String s){
    char[] c = s.toCharArray();
    return c;
  }
  public static void main(String[] args) {
    String str = "siddhraj";
    char[] a1 = methodOne(str);
    for(char i:a1){
      System.out.print(i+" ");
    }
    System.out.println();
    char[] a2 =  methodTwo(str);
    for(char i:a2){
      System.out.print(i+" ");
    }
  }

}
