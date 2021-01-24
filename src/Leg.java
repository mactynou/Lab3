public class Leg extends PartOfBody {
    private Boot boot = new Boot();
    public Leg(String name) {
        super(name);
    }

    public Boot getBoot() {
        return boot;
    }

    public class Boot{
        private String name;
        public void setName(String name) {
            this.name = name;
        }

        public void pick(Item earth){
            setName("boot");
            System.out.println("pick " + getName() + " " + earth.getName());
        }
        public String getName() {
            return name;
        }
        public void Boot(String name){
            this.name = name;
        }
        private Item earth = new Item("earth");

        public Item getEarth() {
            return earth;
        }

    }

}
