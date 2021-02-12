public class WarpSpeedDuck extends Duck {

    public WarpSpeedDuck() {
        quackBehavior = new EngageQuack();
    }
    
    public void display() {
        System.out.println("Lightspeed duck displayed");
    }
    
}  

