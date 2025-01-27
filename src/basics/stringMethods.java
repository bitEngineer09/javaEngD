package basics;

public class stringMethods {
    public static void main(String[] args) {
        //  NOTE --> all methods create copies of new Strings, vahi string kabhi bhi change nahi hoti {Strings are immutalbe}.

        String firstName = "RAM";
        String lastName = " Ji";

        int length = firstName.length();
        char c = firstName.charAt(length - 1);
        System.out.println(c);

   /*
        char d = firstName.charAt(length);
        System.out.println(d); // ERROR --> IndexOutOfBounds coz RANGE is 0-1-2 but length is 3
        To avoid error --> Length - 1
    */
        System.out.println(firstName.length());

        System.out.println(firstName.charAt(2));

        System.out.println(firstName.indexOf("M")); // strings also in arg

        System.out.println(firstName.indexOf("M", 1)); // second agr is M kaha se dekhna hai

        System.out.println(firstName.lastIndexOf("M")); // char repeat ho to usme last appearing char ka index bataega, strings also in ARG.

        System.out.println(firstName.concat(lastName));

        System.out.println(firstName.equals(lastName));

        System.out.println(firstName.toUpperCase());

        System.out.println(firstName.toLowerCase());

        System.out.println(firstName.trim()); // removes unnecessary spaces. Mostly this method is use in forms.

        System.out.println(firstName.contains("A")); // Always use double quotes
        System.out.println(firstName.contains("RAM"));
        System.out.println(firstName.contains("ram"));

        String e = "red";
        String newWord = e.replace("red", "green"); // works on strings, group of strings, characters.
        System.out.println(newWord);

        System.out.println(firstName.startsWith("r")); // false
        System.out.println(firstName.startsWith("R")); // true

        System.out.println(firstName.endsWith("M"));

        String str = ""; // agar space bhi daal diya to False.
        System.out.println(str.isEmpty());

        String bl = " "; // agar space hata diya to false
        System.out.println(bl.isBlank());

        int x = 10;
        String s = String.valueOf(x); // converts to String.
        System.out.println(s);
        System.out.println(s.getClass());


        System.out.println('c' + 0); // prints ASCII value
        System.out.println('d' + 0); // prints ASCII value

        String a = "APPLE";
        String b = "apple";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b)); // IGNORE CASES of strings

        String str1 = "cat";
        String str2 = "dog";
        System.out.println(str1.compareTo(str2)); // ASCII (c) - ASCII (d)
        System.out.println(str2.compareTo(str1)); // ASCII (d) - ASCII (c)

        String p = "apple";
        String q = "APPLE";
        System.out.println('a' + 0);
        System.out.println('A' + 0);

        int i = p.compareToIgnoreCase(q); // Ignores Cases
        System.out.println(i);

        int j = p.compareTo(q);
        System.out.println(j);

        String name = "Gautam Yadav";
        System.out.println(name.substring(5)); // Agrument is kaha se substring chahiye.
        System.out.println(name.substring(5, 8)); // second index is EXCULSIVE --> It will be not included.

    }
}
