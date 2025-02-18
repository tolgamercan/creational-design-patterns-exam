package com.ttmercan.creational_design_patterns_exam;

public class Hamsi implements IAnimal{
    private String type;
    private Boolean voice;
    private Boolean flyable;
    private Boolean canSwim;

    @Override
    public Boolean getCanSwim() {
        return true;
    }

    @Override
    public Boolean getFlyable() {
        return false;
    }

    @Override
    public String getType() {
        return "Fish";
    }

    @Override
    public Boolean getVoice() {
        return false;
    }
}
