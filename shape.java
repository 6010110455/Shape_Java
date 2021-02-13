class shape {
    private String name;
    public shape(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double getArea(){
        return 0;
    }
}

class Rectangle extends shape{
    private double width;
    private double height;
    public Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
}

public class main{
    public static void main(String[] args) {
         Rectangle r1 = new Rectangle(r1, 3.0, 8.0);
         System.out.println(r1.getArea());
    }
}