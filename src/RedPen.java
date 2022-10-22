public class RedPen implements DrawingAPI{
    @Override
    public void drawCircle(int radius, int x, int y){
        System.out.println("Drawing circle color: red, radius: "+ radius + " x: "+ x+ " y: "+ y);
    }
}
