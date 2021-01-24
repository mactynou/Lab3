public class Sineglazka extends Korotyshka{
    public Sineglazka(String name) {
        super(name);
    }
    public void willNotice(){
        Head head = new Head("head");
        Head.Eyes eyes = head.new Eyes("eyes");
        setName("she");
        System.out.println(getName() + " will notice he has tears in his " + eyes.getName() + " water");
    }
}
