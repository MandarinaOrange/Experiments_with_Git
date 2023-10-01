import java.util.LinkedList;

public class Main {



    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cat kot = new Cat("Murzik", 2);

        kot.show();

        LinkedList<Cat> kotiki = new LinkedList<>();
        kotiki.add(kot);
        kotiki.add(new Cat("Barsik", 3));

        System.out.println(kotiki.size());

        for (Cat kotik : kotiki ){
            kotik.show();
        }



    }
}