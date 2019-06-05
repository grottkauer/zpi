package com.lending.entities;

public enum RentingStatus {
    Utworzone(0), Zrealizowane(1), DoOddania(2), Oddane(3), Inne(4);

    private final int value;

    RentingStatus(int i) {
        this.value = i;
    }

    public static RentingStatus fromInteger(int integer){
        switch (integer){
            case 0:
                return Utworzone;
            case 1:
                return Zrealizowane;
            case 2:
                return DoOddania;
            case 3:
                return Oddane;
            case 4:
                return Inne;
        }
        return null;
    }
}