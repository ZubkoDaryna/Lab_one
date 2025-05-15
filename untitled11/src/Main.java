public class Main {
    public static void main(String[] args) {
        HumanBMI human = new HumanBMI(80, 1.52);
        System.out.println(human.getResult());
    }
}

class HumanBMI {
    private double weight;  
    private double height;  
    private double bmi;

    public HumanBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
        calculateBMI();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        calculateBMI();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculateBMI();
    }

    public double getBMI() {
        return bmi;
    }

    public String getResult() {
        if (bmi < 18.5) {
            return "Deficit";
        } else if (bmi < 25) {
            return "Norm";
        } else if (bmi < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }

    private void calculateBMI() {
        this.bmi = weight / (height * height);
    }
}
