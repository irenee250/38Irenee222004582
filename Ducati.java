class Ducati {
    public void accelerate() {
        System.out.println("Ducati Motorcycle is accelerating");
    }
}


class HarleyDavidson {
    public void startEngine() {
        System.out.println("Harley-Davidson Motorcycle engine is starting");
    }
}


class Suzuki {
    public void turnOnHeadlights() {
        System.out.println("Suzuki Motorcycle headlights are turning on");
    }
}


class Kawasaki {
    public void brake() {
        System.out.println("Kawasaki Motorcycle is applying brakes");
    }
}

class Motorbikes {
    public static void main(String[] args) {
        Ducati ducati = new Ducati();
        HarleyDavidson harley = new HarleyDavidson();
        Suzuki suzuki = new Suzuki();
        Kawasaki kawasaki = new Kawasaki();

        // Calling methods from each motorcycle class
        ducati.accelerate();
        harley.startEngine();
        suzuki.turnOnHeadlights();
        kawasaki.brake();
    }
}
