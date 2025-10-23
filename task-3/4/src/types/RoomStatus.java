package types;

public enum RoomStatus {
    FREE("свободен"),
    OCCUPIED("занят"),
    REPAIR("ремонт"),
    SERVICE("обслуживание");

    private final String displayName;

    RoomStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static RoomStatus fromDisplayName(String name) {
        for (RoomStatus status : RoomStatus.values()) {
            if (status.displayName.equalsIgnoreCase(name)) {
                return status;
            }
        }
        return null;
    }
}

