package CollectionFramework.one_ListInterface.Stack;


import java.util.ArrayList;

public class ArrayListAsStack {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // ye hum last me hee to add kar re hai, stack me bhi last me hee add hota hai
        list.add(10); // PUSH
        list.add(10);

        list.get(list.size() - 1); // PEEK
        list.remove(list.size() - 1); //POP
    }
}
