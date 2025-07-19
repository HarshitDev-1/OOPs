class sqr{
    int side;
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}
public class Square {
    public static void main(String[] args) {
        System.out.println("Calculating area and Perimeter");
        sqr sq = new sqr();
        sq.side = 6;
        System.out.println("Area of the square is "+ sq.getArea());
        System.out.println("Perimeter of the square is "+ sq.getPerimeter());
    }
}
