package org.example.patterns.builder;

public class BuilderDemoApp {
    public static void main(String[] args) {
        Address address = new Address("USA", "Los Angeles", "Briton Street");
        User user = new User("Peter", "Parker", address);

        UserDtoBuilder dtoBuilder = new UserDtoBuilder();

        System.out.println(dtoBuilder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .build());
    }
}
