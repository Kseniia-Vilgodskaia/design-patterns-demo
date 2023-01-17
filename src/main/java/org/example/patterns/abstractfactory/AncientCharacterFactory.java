package org.example.patterns.abstractfactory;

public class AncientCharacterFactory extends CharacterFactory{
    @Override
    public AncientSoldier createSoldier() {
        return new AncientSoldier();
    }

    @Override
    public AncientWizard createWizard() {
        return new AncientWizard();
    }
}
