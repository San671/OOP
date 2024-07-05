package Lab10;

public class Main {
    public static void main(String[] args) {

        ToshibaBattery[] premiumCells = {
                new ToshibaBattery(11, 2, 15000, 300),
                new ToshibaBattery(11.5, 2.1, 15500, 350),
                new ToshibaBattery(12, 2.2, 16000, 400),
                new ToshibaBattery(12.5, 2.3, 16500, 450),
                new ToshibaBattery(13, 2.4, 17000, 500)
        };

        DuracellBattery[] powerCells = {
                new DuracellBattery(10, 1.5, 14000, 8),
                new DuracellBattery(10.5, 1.6, 14500, 8.5),
                new DuracellBattery(11, 1.7, 15000, 9),
                new DuracellBattery(11.5, 1.8, 15500, 9.5),
                new DuracellBattery(12, 1.9, 16000, 10)
        };

        FlashLight[] illuminators = {
                new FlashLight(new Battery[]{premiumCells[0], powerCells[4]}),
                new FlashLight(new Battery[]{premiumCells[1], powerCells[3]}),
                new FlashLight(new Battery[]{premiumCells[2], powerCells[2]}),
                new FlashLight(new Battery[]{premiumCells[3], powerCells[1]}),
                new FlashLight(new Battery[]{premiumCells[4], powerCells[0]})
        };


        double bestDuration = 0;
        FlashLight bestDevice = null;

        for (FlashLight device : illuminators) {
            double duration = device.calculateLifeSpan();
            System.out.println("Lifetime: " + duration + " seconds");
            if (duration > bestDuration) {
                bestDuration = duration;
                bestDevice = device;
            }
        }

        if (bestDevice != null) {
            System.out.println("Best Lifetime: " + bestDevice.calculateLifeSpan() + " seconds");
        }
    }
}

