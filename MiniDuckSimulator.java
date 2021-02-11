class MiniDuckSimulator {

  public static void main(String args[]) {

    System.out.println("===================");
    Duck rhd = new RedheadDuck();
    rhd.display();
    rhd.performQuack();
    rhd.swim();

    System.out.println("===================");
    Duck md = new MallardDuck();
    md.display();
    md.performQuack();
    md.swim();

    System.out.println("===================");
    Duck rd = new RubberDuck();
    rd.display();
    rd.performQuack();
    rd.swim();

    System.out.println("===================");
    Duck cd = new CanvasbackDuck();
    cd.display();
    cd.performQuack();
    cd.swim();

    System.out.println("===================");
    Duck ud = new UglyDuck();
    ud.display();
    ud.performQuack();
    ud.swim();

  }
}
