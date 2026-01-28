package entities;

public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double finalnote() {return note1+note2+note3;}
    public double missingnote() { return 60-finalnote();}
}
