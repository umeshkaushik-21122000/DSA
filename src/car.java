public class car extends vehicle{
    private int gearnuber;
    private int seats;
    public car(String colour, int gear, int moving, int direction,int gearnumber,int seats) {
        super(colour, gear, moving, direction);
    }

    public int speed(int Speed){
        super.setMoving(Speed);
        System.out.println("car is moving at speed "+Speed);
       return Speed;
    }
    public void steering(int speed,int direction){
        super.setMoving(speed);
        super.setDirection(direction);
        System.out.println("car is moving at a speed of  "+speed+"in the direction"+direction);
    }
    public void changingspeed(int speed){
        speed=speed +this.getMoving();

    }
}
