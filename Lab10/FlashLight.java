package Lab10;

public class FlashLight {
    private Battery[] powerSources;

    public FlashLight() {
        this.powerSources = new Battery[0];
    }

    public FlashLight(Battery[] powerSources) {
        this.powerSources = powerSources;
    }

    public Battery[] getPowerSources() {
        return powerSources;
    }

    public void setPowerSources(Battery[] powerSources) {
        this.powerSources = powerSources;
    }

    public double calculateTotalPower() {
        double sumPower = 0;
        for (Battery source : powerSources) {
            sumPower += source.getPower();
        }
        return sumPower;
    }

    public double calculateTotalEnergy() {
        double sumEnergy = 0;
        for (Battery source : powerSources) {
            sumEnergy += source.getLifeTime() * source.getPower();
        }
        return sumEnergy;
    }

    public double calculateLifeSpan() {
        double totalEnergy = calculateTotalEnergy();
        double totalPower = calculateTotalPower();
        return totalEnergy / totalPower;
    }
}

