import java.util.ArrayList;

public class remove_duplicateElementHasset {
    public static void main(String[] args) {
        ArrayList<String> listWithDuplicateelement = new ArrayList<>();
        listWithDuplicateelement.add("a");
        listWithDuplicateelement.add("b");
        listWithDuplicateelement.add("c");
        listWithDuplicateelement.add("d");
        listWithDuplicateelement.add("a");
        System.out.println(listWithDuplicateelement);
        Object[] ch = listWithDuplicateelement.toArray();

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i]==ch[j])
                {
                    System.out.println(ch[j]);
                }

            }

        }
    }
}
