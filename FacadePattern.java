public class FacadePattern {
  public static void main( String[] args ) {
    ShapeMaker shapemaker = new ShapeMaker();

    shapemaker.drawCircle();
    shapemaker.drawSquare();
    shapemaker.drawRectangle();
    shapemaker.drawTriangle();
    shapemaker.drawLine();
    shapemaker.drawHappy();
    shapemaker.drawParallelogram();
  }
}