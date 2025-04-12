package org.knit.solutions.lab1.factory;

public class TransportFactory {
    public Transport createTransport(String tripType) {
        switch (tripType) {
            case "business":
                return new BusinessCar();
            case "family":
                return new FamilyVan();
            case "dilivery":
                return new Motorbike();
        }
        return null;
    }
}
