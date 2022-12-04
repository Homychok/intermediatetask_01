public class Main {
    public static void main(String[] args) {
        float leftborder = 8.5f;
        float rightborder = 9.45f;
        int controlnumber = 10;
        float delta1 = controlnumber - leftborder;
        float delta2 = controlnumber - rightborder;
        boolean delta01 = delta1 > delta2;
        boolean delta02 = delta2 > delta1;
        if (delta01) {
            System.out.println("Ближайшее число к " + controlnumber + " является " + rightborder);
        } else if (delta02) {
            System.out.println("Ближайшее число к " + controlnumber + " является " + leftborder);
        } else {
            System.out.println("Оба числа располагаются на одинаковом расстоянии от " + controlnumber);
        }
    }
}