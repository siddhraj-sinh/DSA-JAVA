public class ReverseString {
    public static void main(String[] args) {

        String name = "java";
        String reversedString = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString = reversedString + name.charAt(i);
        }

        System.out.print("The reversed string of the '" + name + "' is: ");
        System.out.println(reversedString);
    }
}
