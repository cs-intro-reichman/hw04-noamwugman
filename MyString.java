public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowCase = "";
        char current;
        int ratio = 'a' - 'A';
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            if (current == ' ')
                current = ' ';
            else if (current < 90) {
                if (current > '9')
                    current += ratio;
            }
            lowCase += current;
        }
        return lowCase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean contains = false;
        if (str2.length() == 0)
            return false;
        for (int i = 0; i < str1.length(); i ++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                contains = true;
                for (int n = 0; n < str2.length(); n++) {
                    if (str1.charAt(i + n) != str2.charAt(n)) {
                        contains = false;
                        break;
                    }
                }
            }
        }
        return contains;
    }
}
