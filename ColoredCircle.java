class ColoredCircle extends Circle{

private int adius;
private String color;

  ColoredCircle(int init, String init_color){
    super(init);
    color = init_color;
  }

  void display(){
    System.out.println("半径は" + adius + "です");
    System.out.println("色は" + color + "です");
  }
}
