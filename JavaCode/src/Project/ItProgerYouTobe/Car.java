package Project.ItProgerYouTobe;

public class Car extends  Transport implements Light{
    boolean isOn = false;

    public Car(){}

    public Car(float speed, int weight, String color, byte [] coordinate){

        super(speed, weight, color, coordinate);

        super.setValue(speed, weight, color, coordinate);

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Let's go ");

    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
        if (set == true) {
            System.out.println("Migaeem");
        }
        else{
            System.out.println("Ne margaet");
        }
    }

    @Override
    public void blinkLight() {
        System.out.println("Migaeem");
        System.out.println("Ne margaet");

    }
}
