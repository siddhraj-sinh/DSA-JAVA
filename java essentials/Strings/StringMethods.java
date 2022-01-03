import java.util.Arrays;
class StringMethods{
  public static void main(String[] args) {
    String str1 = "JAVA-DSA";
    String str2 = "Bootcamp";

    System.out.println("Length of string: " +str1.length());
    System.out.println("Compare two strings: " +str1.equals(str2));
    System.out.println("Compare two strings ignoring their cases: "+str1.equalsIgnoreCase(str2));
    System.out.println("concating two string: "+str1.concat("-"+str2));
    System.out.println("Character at 2nd index: "+str1.charAt(2));
    //this is case sensitive
    System.out.println("Contains sequence of Character: "+str1.contains("DSA"));
    System.out.println("Hashcode of string: "+str1.hashCode());
    //it returns -1 if not found
    System.out.println("Returns the position of the first found occurrence of specified characters in a string: " +str1.indexOf('S'));
    System.out.println("Check string is empty or not: "+str1.isEmpty());
    System.out.println("Converts a string to lower case letters: "+str1.toLowerCase());
    System.out.println("Converts a string to upper case letters: "+str1.toUpperCase());
    System.out.println("Substring starting from index 6: " +str1.substring(5));  //DSA
 System.out.println("Substring starting from index 0 to 6: "+str1.substring(0,4)); //JAVA
//split method returns array string
  String str3[] = str1.split("-");
  System.out.println("split string: "+Arrays.toString(str3));
System.out.println("Remove whitespaces from both side of string: " +str1.trim());

  }
}
