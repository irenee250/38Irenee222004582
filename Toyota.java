
class Toyota {
    public void methodToyota() {
        System.out.println("Method from Toyota class");
    }
}

class Honda {
    public void methodHonda() {
        System.out.println("Method from Honda class");
    }
}

class Ford {
    public void methodFord() {
        System.out.println("Method from Ford class");
    }
}


class BMW {
    public void methodBMW() {
        System.out.println("Method from BMW class");
    }
}

class Cars {
    public static void main(String[] args) {
        Toyota toyotaCar = new Toyota();
        Honda hondaCar = new Honda();
        Ford fordCar = new Ford();
        BMW bmwCar = new BMW();

        // Calling methods from each car class
        toyotaCar.methodToyota();
        hondaCar.methodHonda();
        fordCar.methodFord();
        bmwCar.methodBMW();
    }
}
