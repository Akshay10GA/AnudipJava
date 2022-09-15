public class Rectangle {
    int length;
    int width;

    public Rectangle(){
        length = 0;
        width = 0;
    }
    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    void Area(){
        System.out.println("Area of rectangle : "+ (length * width ));
    }
    public static void main(String args[]) {
        Rectangle r = new Rectangle(16,20);
        r.Area();
        
    }
    
}
