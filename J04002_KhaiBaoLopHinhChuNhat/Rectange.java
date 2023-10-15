package J04002_KhaiBaoLopHinhChuNhat;

public class Rectange {
    private double width, height;
    private String color;

    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){
        return this.height * this.width;
    }
    
    public double findPerimeter(){
        return (this.height + this.width) * 2;
    }
    
    public String stdColor(){
        StringBuilder sb = new StringBuilder(this.color.toLowerCase());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }
    
    public String toString() {
        return String.format("%d %d %s", (int)findPerimeter(), (int)findArea(), stdColor());
    }
    
}
