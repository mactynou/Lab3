public class Lab3 {
    public static void main(String[] args) {
        Neznaika neznaika = new Neznaika("Neznaika");
        Sineglazka sineglazka = new Sineglazka("Sineglazka");

        neznaika.stay(Adverb.FORAWHILE, Adverb.SILENTLY);
        sineglazka.stay(Adverb.FORAWHILE, Adverb.SILENTLY);

        Neznaika.Throat throat = neznaika.new Throat("throat");
        neznaika.setThroat(throat);
        neznaika.getThroat().setClosely(true);
        neznaika.tryToSay();

        neznaika.see(Direction.DOWN);
        Leg leg = new Leg("leg");
        Leg.Boot boot = leg.new Boot();
        boot.pick(boot.getEarth());
        neznaika.lookTo(sineglazka, Adverb.DIDNTDARETO);

        neznaika.wasAfraid();
        sineglazka.willNotice();

        Head head = new Head("head");
        Head.Eyes eyes = head.new Eyes("eyes");
        neznaika.raised(Direction.UP,Adverb.FINALLY);
        sineglazka.raised(Direction.UP,Adverb.FINALLY);

        eyes.meetOtherEyes(eyes);

        Korotyshka all = new Korotyshka("Znaika and his friends ");
        all.wentHiking(Adverb.NEXTDAY);

        neznaika.walking(WalkingMode.ONBOOT, true);

        Flyingball flyingball = new Flyingball();
        flyingball.burst("flyingball");
        flyingball.fix("him", Adverb.HARD);
        Wind wind = new Wind();
        wind.wasnt("wind");

        Korotyshka znaika = new Korotyshka("Znaika");
        Korotyshka pilylkin = new Korotyshka("Pinylkin");
        Korotyshka vintik = new Korotyshka("Vintik");
        Korotyshka shpuntik = new Korotyshka("Shpuntik");
        Hand hand = new Hand("hand");

    }
}