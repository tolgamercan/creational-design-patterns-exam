package com.ttmercan.creational_design_patterns_exam;

public class AnimalFactory {

    public static IAnimal createAnimal(Boolean hasVoice){
        IAnimal animal;
        if(hasVoice){
            animal=new Cat();
        }else{
            animal=new Hamsi();
        }
        return animal;
    }
}
