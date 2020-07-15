/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor_
 */
public class CrazyPerson extends Person {

    public CrazyPerson(String name, int age) {
        super(name, age);
        setMood("louco");
    }

    @Override
    public void Conversation(int opt) {
        switch (opt) {
            case 1:
                System.out.println(getName() + ": Eu estou meio louco, não tomei meu remédio!");
                break;
            case 2:
                System.out.println(getName() + ": Eu to muito louco parceiro!");
                break;
            case 3:
                System.out.println(getName() + ": Vai CORINTHIAANS!!!!");
                break;
            default:
                System.out.printf(getName() + ": Eu estou me sentindo %s!\n", getMood());
                break;
        }
    }
}
