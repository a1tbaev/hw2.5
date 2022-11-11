package figures;

public class Circle {
    private static final float PI= (float) 3.1415f;
    public static void getArea(double radius){
        final double area = radius * PI * PI;
        System.out.println("area: " + area);
    }
    public static void getCircumference(double radius){
        final double circumference = PI * radius * 2;
        System.out.println("circumference: " + circumference);
    }
}
