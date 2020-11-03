package no.oboy.model;

public enum BagEventCode {
    BagBhsEvent("BagBhsEvent"),
    BagAcceptedByBhs("BagAcceptedByBhs"),
    BagInfoReceived("BagInfoReceived"),
    BagTagGenerated("BagTagGenerated"),
    BagToSecScreen("BagToSecScreen"),
    BagToTransfer("BagToTransfer"),
    BagTagScanned("BagTagScanned");

    private final String value;

    BagEventCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
