package Java8_Basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _9_ConstructorReference {
    public static void main(String[] args) {

        List<String> listOfPhones = Arrays.asList("a", "b", "c");

        // stream collections ko stream me convert kar deta hai
        // .map() -> lega fir kuch dega

        listOfPhones.stream().map(x -> new phones(x)).collect(Collectors.toList()); // esme lamba exp use hai
        listOfPhones.stream().map(phones::new).collect(Collectors.toList()); // esme Constructor Reference use ho ra hai
//  phones::new -> Class ke Constructor ko refer kar ra hai

    }
}

class phones {
    String name;

    public phones(String name) {
        this.name = name;
    }
}