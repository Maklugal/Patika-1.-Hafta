package Patika_2_Week.Banking_System;

public enum CurrencyType {
    TL(" TL "),
    DOLAR(" USD "),
    EURO(" EUR "),
    ALTIN(" GLD ");

    private final String sembol;

    CurrencyType(String sembol) {
        this.sembol = sembol;
    }

    public String getSembol() {
        return sembol;
    }
}
