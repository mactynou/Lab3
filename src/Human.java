public abstract class Human implements Walking{
    private String name;
    public Human(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void stay(Adverb ... adverbs){
        String help="";
        for(int i=0;i<adverbs.length;i++){
            help=help+' '+adverbs[i].getUrl();
        }
        System.out.println(getName()+" stays"+help);
    }
    public void raised(Direction direction, Adverb adverb){
        System.out.println(adverb +" " +getName() + " " + direction + " head");
    }

    @Override
    public void walking(WalkingMode walkingMode, boolean isPrint) {
        System.out.println("walking");
        if(isPrint){
            System.out.println("Walkingmode is: " + walkingMode);
        }
    }
}
