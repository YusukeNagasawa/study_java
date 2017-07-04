class ColoredCircle extends Circle{

private int adius;
private String color;

  ColoredCircle(int init, String init_color){
    super(init);  //super classのコンストラクタ
    color = init_color; //サブクラスのコンストラクタ
  }

  void display(){
    System.out.println("半径は" + adius + "です");
    System.out.println("色は" + color + "ですよ");
  }
}
