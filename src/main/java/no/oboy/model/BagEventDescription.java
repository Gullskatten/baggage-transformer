package no.oboy.model;

public enum BagEventDescription {
    BSM("BSM"),
    BSM_UNKNOWN("UNKNOWN"),
    BSM_DELETED("BSM Deleted");

    private final String value;

    BagEventDescription(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BagEventDescription fromValue(String value) {
        switch (value) {
            case "BSM":
                return BSM;
            case "BSM Deleted":
            case "BSM DELETED":
                return BSM_DELETED;
            default:
                return BSM_UNKNOWN;
        }
    }
}
