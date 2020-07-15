/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor_
 */
public class Person {

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    private String Name;

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    private int Age;

    public int getAge() {
        return this.Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    private String Mood;

    public String getMood() {
        return this.Mood;
    }

    public void setMood(String mood) {
        this.Mood = mood;
    }

    protected void Saudation(int opt) {
        switch (opt) {
            case 0:
                System.out.println(getName() + ": Olá!");
                break;
            case 1:
                System.out.println(getName() + ": Oii!");
                break;
            case 2:
                System.out.println(getName() + ": Hello");
                break;
            case 4:
                System.out.println(getName() + ": Bom Dia!");
                break;
            case 5:
                System.out.println(getName() + ": Eae mano!");
                break;
            default:
                System.out.println(getName() + ": Oi!");
                break;
        }
    }

    protected void Apresentation(String opt) {
        if ("i".equals(opt)) {
            System.out.printf(getName() + ": Eu me chamo %s e tenho %d anos, e você?%n", Name, Age);
        } else if ("r".equals(opt)) {
            System.out.printf(getName() + ": Meu nome é %s e tenho %d anos. Como você está?%n", Name, Age);
        }

    }

    protected void Conversation(int opt) {
    }
}
