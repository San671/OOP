package Lab10;

public class DuracellBattery extends Battery {
    private double voltage;
    private double current;
    private double energy;
    private double internalVoltage;

    public DuracellBattery(double voltage, double current, double energy, double internalVoltage) {
        this.voltage = voltage;
        this.current = current;
        this.energy = energy;
        this.internalVoltage = internalVoltage;
    }

    @Override
    public double getPower() {
        return (voltage - internalVoltage) * current;
    }

    @Override
    public double getLifeTime() {
        return energy / getPower();
    }
}

