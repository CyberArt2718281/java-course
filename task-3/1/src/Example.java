public class Example {
    public static void main(String[] args) {

        int randomNumber = (new java.util.Random()).nextInt(100,999);
        String maxNumberString = String.valueOf(randomNumber);
        int res = 0;
        for (int i = 0; i < maxNumberString.length(); i++) {
            int digit2 = Character.getNumericValue(maxNumberString.charAt(i));
            if ((digit2 > res)) {
                res = digit2;
            }
        }
        System.out.println("Random number: " + randomNumber + " Max digit: " + res);
    }
}