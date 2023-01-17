package org.example.patterns.abstractfactory;

public class MedievalCharacterFactory extends CharacterFactory {
    @Override
    public MedievalSoldier createSoldier() {
        return new MedievalSoldier();
    }

    @Override
    public MedievalWizard createWizard() {
        return new MedievalWizard();
    }
}
