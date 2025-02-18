package com.ttmercan.creational_design_patterns_exam;

public class MobilePhone {
    private String brandName;
    private Long batteryCapacity;
    private Boolean isTouchable;
    private Boolean has5g;
    private Boolean hasFaceId;
    private String screenSize;
    private int processorCellSize;

    public void setBatteryCapacity(Long batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setHas5g(Boolean has5g) {
        this.has5g = has5g;
    }

    public void setHasFaceId(Boolean hasFaceId) {
        this.hasFaceId = hasFaceId;
    }

    public void setTouchable(Boolean touchable) {
        isTouchable = touchable;
    }

    public void setProcessorCellSize(int processorCellSize) {
        this.processorCellSize = processorCellSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "batteryCapacity=" + batteryCapacity +
                ", brandName='" + brandName + '\'' +
                ", isTouchable=" + isTouchable +
                ", has5g=" + has5g +
                ", hasFaceId=" + hasFaceId +
                ", screenSize='" + screenSize + '\'' +
                ", processorCellSize=" + processorCellSize +
                '}';
    }
}
