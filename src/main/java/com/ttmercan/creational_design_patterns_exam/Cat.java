package com.ttmercan.creational_design_patterns_exam;

public class Cat implements IAnimal {
    private String type;
    private Boolean voice;
    private Boolean flyable;
    private Boolean canSwim;

    @Override
    public Boolean getCanSwim() {
        return false;
    }

    @Override
    public Boolean getFlyable() {
        return false;
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public Boolean getVoice() {
        return true;
    }
}
