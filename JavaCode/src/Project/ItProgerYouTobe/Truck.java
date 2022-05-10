package Project.ItProgerYouTobe;

public class Truck extends Transport {

    private boolean isLoaded;

    public Truck(int weight, byte[] coordinate){
        super(weight, coordinate);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Let's go ");
    }

    public void setLoaded(boolean loaded){

        this.isLoaded = loaded;
    }

    public String getLoaded(){
        if(isLoaded)
            return ("Truck is loaded");
        else
            return ("Truck doesn't loaded");
    }



    public Truck(int weight, byte[] cordinate, boolean isLoaded){
        super(weight,cordinate);
        this.isLoaded = isLoaded;
    }


    public void setValue(  float speed, int weight, String color, byte [] coordinate, boolean isLoaded){
        super.setValue(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;

    }

    @Override
    protected String getValue() {
        return getLoaded();
    }

}
