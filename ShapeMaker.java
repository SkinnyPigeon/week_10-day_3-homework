public class ShapeMaker {
  private Shape circle;
  private Shape square;
  private Shape rectangle;
  private Shape triangle;
  private Shape line;
  private Shape happy;
  private Shape parallelogram;
  private Shape renwick;

  public ShapeMaker() {
    circle = new Circle();
    square = new Square();
    rectangle = new Rectangle();
    triangle = new Triangle();
    line = new Line();
    happy = new Happy();
    parallelogram = new Parallelogram();
    renwick = new Renwick();
  }

  public void drawCircle() {
    circle.draw();
  }

  public void drawSquare() {
    square.draw();
  }

  public void drawRectangle() {
    rectangle.draw();
  }

  public void drawTriangle() {
    triangle.draw();
  }

  public void drawLine() {
    line.draw();
  }

  public void drawHappy() {
    happy.draw();
  }

  public void drawParallelogram() {
    parallelogram.draw();
  }

  public void drawRenwick() {
    renwick.draw();
  }
}