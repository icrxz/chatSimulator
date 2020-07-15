import java.util.Random;
import java.util.ArrayList;

public class ChatSimulator {

    public static ArrayList<String> CriaNomes() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("João");
        names.add("Maria");
        names.add("Marcos");
        names.add("Matheus");
        names.add("Isabela");
        names.add("Igor");
        names.add("Douglas");
        names.add("Luis");
        names.add("Fabio");
        names.add("Pamela");
        names.add("Giovana");
        return names;
    }

    public static Person SorteiaPessoa() {
        ArrayList<String> names = CriaNomes();

        Random gerador = new Random();
        Person p = null;
        int person = gerador.nextInt(3);
        String name = names.get(gerador.nextInt(names.size()));
        int age = gerador.nextInt(80);
        switch (person) {
            case 0:
                p = new CrazyPerson(name, age);
                break;
            case 1:
                p = new SadPerson(name, age);
                break;
            case 2:
                p = new HappyPerson(name, age);
                break;
        }
        return p;
    }

    public static void main(String[] args) {
        Random gerador = new Random();
        Person p1 = SorteiaPessoa();
        Person p2 = SorteiaPessoa();

        p1.Saudation(gerador.nextInt(10));
        p2.Saudation(gerador.nextInt(10));
        p1.Apresentation("i");
        p2.Apresentation("r");
        p1.Conversation(gerador.nextInt(5));
        p2.Conversation(gerador.nextInt(5));
    }
}
