class AlphaNumString{
  public static String convert(String s){
    s = s.replaceAll("[^a-zA-Z0-9]","");
    return s;
  }
  public static void main(String[] args) {
    String str = "ABCDEF@#$%^123";
    //convert it into alphanumerci String
    String s = convert(str);
    System.out.println("aplha numeric string is: " +s);
  }
}
