package src.basics_03;

public class Lab028 {
    public static void main(String[] args) {

    int course = 100;
    float GST = 0.1845f;
    float total = course + GST*course;
    System.out.println(total);
    // int total = course +(int)GST*course; // use bigger bucket, otherwise data is lost.
    //System.out.println(total);

    }
}
