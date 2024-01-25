public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double heigh = 1.87;
        double imb = service.calculate(weight, heigh);

        System.out.println("Индекс массы тела равен " + imb);
    }
}
