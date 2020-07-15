/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor_
 */
public class HappyPerson extends Person {

    public HappyPerson(String name, int age) {
        super(name, age);
        setMood("feliz");
    }

    @Override
    public void Conversation(int opt) {
        switch (opt) {
            case 1:
                System.out.printf(getName() + ": Eu estou bem, comi num lugar bom hoje!\n");
                break;
            case 2:
                System.out.println(getName() + ": Eu estou feliz, meu time ganhou ontem!");
                break;
            case 3:
                System.out.println(getName() + ": Eu estou bem, ganhei uma promoção no trabalho");
                break;
            default:
                System.out.printf(getName() + ": Eu estou me sentindo %s!%n", getMood());
                break;
        }
    }
}
