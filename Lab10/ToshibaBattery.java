package Lab10;

public class ToshibaBattery extends Battery {
    private double voltage;
    private double current;
    private double energy;
    private double extraEnergy;

    public ToshibaBattery(double voltage, double current, double energy, double extraEnergy) {
        this.voltage = voltage;
        this.current = current;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
    }

    @Override
    public double getPower() {
        return voltage * current;
    }

    @Override
    public double getLifeTime() {
        double totalEnergy = energy + extraEnergy;
        return totalEnergy / getPower();
    }
}

