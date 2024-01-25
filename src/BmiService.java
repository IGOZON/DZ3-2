public class BmiService {
    public double calculate(double weight, double heigh) {
        double bodyMassIndex = weight / (heigh * heigh);
        return (int) bodyMassIndex;
    }
}


