
public class ReverseString {
    public static void main(String[] args) {
        String originalStr = "Dasaev";
        String reversedStr = reverseString(originalStr);

        System.out.println("Original: " + originalStr);
        System.out.println("Reversed: " + reversedStr);

    }


    public static String reverseString(String input){
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end){
            char temp = charArray[start];
            charArray[start]=charArray[end];
            charArray[end]= temp;

            start++;
            end--;
        }

        return new String(charArray);
    }
}
