/**
 *
 * @author igor_
 */
public class SadPerson extends Person {

    public SadPerson(String name, int age) {
        super(name, age);
        setMood("triste");
    }

    @Override
    public void Conversation(int opt) {
        switch (opt) {
            case 1:
                System.out.printf(getName() + ": Eu estou triste, perdi dinheiro na rua!\n");
                break;
            case 2:
                System.out.println(getName() + ": Eu estou mal, perdi o jogo ontem!");
                break;
            case 3:
                System.out.println(getName() + ": Eu estou acabado, terminei com a minha namorada!");
                break;
            default:
                System.out.printf(getName() + ": Eu estou me sentindo %s!\n", getMood());
                break;
        }
    }
}
