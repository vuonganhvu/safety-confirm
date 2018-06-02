package jp.co.willware.aca.safety.common;

public enum CarStatus {
    OFFLINE("offline"),
    ONLINE("online"),
    IDLE("idle");

    private String value;

    CarStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static CarStatus init(String value) {
        if ("offline".equals(value)) {
            return OFFLINE;
        } else if ("online".equals(value)) {
            return ONLINE;
        } else if ("idle".equals(value)) {
            return IDLE;
        }
        return null;
    }
}
