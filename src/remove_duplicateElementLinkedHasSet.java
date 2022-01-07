import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class remove_duplicateElementLinkedHasSet {
    public static void main(String[] args) {
        ArrayList<String>listWithDuplicateelement=new ArrayList<>();
        listWithDuplicateelement.add("a");
        listWithDuplicateelement.add("b");
        listWithDuplicateelement.add("c");
        listWithDuplicateelement.add("d");
        listWithDuplicateelement.add("a");
        System.out.println(listWithDuplicateelement);

        LinkedHashSet<String> set=new LinkedHashSet<>(listWithDuplicateelement);

        System.out.println(set);


    }
}
