public class Main {
    public static void main(String[] args) {
        System.out.println("Creating circles");
        Shape redCircle = new Circle(100,100,10,new RedPen());
        Shape greenCircle = new Circle(100,100,20,new GreenPen());

        redCircle.draw();
        greenCircle.draw();
        System.out.println("The end");
    }
}