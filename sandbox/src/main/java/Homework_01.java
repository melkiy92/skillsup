public class Homework_01 {
    public static int sumOfSquares (int [] array) {
        int sum = 0;
        for(int item : array) {
            int square = item * item;
            sum += square;
        }
        return sum;
    };
    public static int lengthOfString (String sText) {
        int len = sText.length();
        return len;
    };
    public static String modifyString(String sOldText, char oldValue, char newValue) {
        String sNewText = sOldText.replace(oldValue, newValue);
        if(sOldText.compareTo(sNewText)==0){
            System.out.println("The character <" + oldValue + "> was not found in the string.");
        } else {
            System.out.println("The character <" + oldValue + "> was replaced with the character <" +newValue + "> in the string.");
        }
        return sNewText;
    };


    public static void main( String [] args) {
        int [] array = {2,5,4};
        String sText = "How Can I learn Java Code?";
        System.out.println("The sum of squares is: " + sumOfSquares(array));
        System.out.println("The length of string is: " + lengthOfString(sText));
        System.out.println(modifyString(sText, 'c', 'C'));

    }
}
