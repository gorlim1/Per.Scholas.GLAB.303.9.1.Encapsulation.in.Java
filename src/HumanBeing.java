public class HumanBeing {

    private float weight;
    private float height;
    private float bmi;

    public float getWeight() {
        return weight;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getBmi() {
        return bmi;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public void setBmi(float bmi) {
        this.bmi = bmi;
    }


    public HumanBeing() {}

    public HumanBeing(float weight, float height, float bmi ) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }
}