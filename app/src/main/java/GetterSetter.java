public class GetterSetter {
    String name;
    int roll;
    float cg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public float getCg() {
        return cg;
    }

    public void setCg(float cg) {
        this.cg = cg;
    }

    public GetterSetter(String name, int roll, float cg) {
        this.name = name;
        this.roll = roll;
        this.cg = cg;
    }
}
