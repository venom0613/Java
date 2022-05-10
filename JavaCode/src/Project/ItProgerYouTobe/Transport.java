package Project.ItProgerYouTobe;

public abstract class Transport {

    private float speed;
    private int weight;
    private String color;
    private   byte [] coordinate ;

    public Transport(){}

    public Transport(float speed, int weight, String color, byte [] coordinate){
        System.out.println("object created");
        setValue(speed, weight, color, coordinate);
    }

    public Transport(int weight, byte[] coordinate){
        this.weight=weight;
        this.coordinate = coordinate;
    }

    public abstract void moveObject(float speed);


    protected void  setValue(  float speed, int weight, String color, byte [] coordinate){
        this.speed  =speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    protected String  getValue(){
       String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: "+ this.color;
       String infoCoordinates = "Coordinates:\n";

       for(int i = 0; i < coordinate.length; i++) {
           infoCoordinates += coordinate[i] + "\n";
       }
        return info+ infoCoordinates;
    }

    }
