package com.ttmercan.creational_design_patterns_exam;

public  class MobilePhoneBuilder {
    private String brandName;
    private Long batteryCapacity;
    private Boolean isTouchable;
    private Boolean has5g;
    private Boolean hasFaceId;
    private String screenSize;
    private int processorCellSize;


    public static MobilePhoneBuilder startMobilePhoneBuilder(){
        return new MobilePhoneBuilder();
    }
    public MobilePhone build(){
        MobilePhone mobilePhone=new MobilePhone();
       mobilePhone.setScreenSize(screenSize);
       mobilePhone.setBatteryCapacity(batteryCapacity);
       mobilePhone.setTouchable(isTouchable);
       mobilePhone.setHasFaceId(hasFaceId);
       mobilePhone.setHas5g(has5g);
       mobilePhone.setBrandName(brandName);
       mobilePhone.setProcessorCellSize(processorCellSize);
        return mobilePhone;

    }

    public MobilePhoneBuilder setBatteryCapacity(Long batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public MobilePhoneBuilder setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public MobilePhoneBuilder setHas5g(Boolean has5g) {
        this.has5g = has5g;
        return this;
    }

    public MobilePhoneBuilder setHasFaceId(Boolean hasFaceId) {
        this.hasFaceId = hasFaceId;
        return this;
    }

    public MobilePhoneBuilder setTouchable(Boolean touchable) {
        isTouchable = touchable;
        return this;
    }

    public MobilePhoneBuilder setProcessorCellSize(int processorCellSize) {
        this.processorCellSize = processorCellSize;
        return this;
    }

    public MobilePhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }
}

