package KkDsaBootCamp.LinearSearch;

public class searchInString1 {
    public static void main(String[] args) {
        String str = "Faang";
        final boolean check = stringSearch(str, 'o');
        System.out.println(check);
    }

    static boolean stringSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

            return false;

    }
}
