public class OOPs{
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.SetColor("Blue");
        System.out.println(p1.color);


    }

}
class Pen{
    //prop + function
    String color;
    int tip;

    void SetColor(String newColor){
        color = newColor;
    }
    
}
    class Student{
        String name;
        int age;
        float percentage;

    }

    

