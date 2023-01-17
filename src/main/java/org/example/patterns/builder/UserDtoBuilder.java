package org.example.patterns.builder;

public class UserDtoBuilder {
    private String firstName;
    private String lastName;
    private String address;

    private UserDto dto;

    public UserDtoBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserDtoBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserDtoBuilder withAddress(Address address) {
        this.address = address.getCountry() + ", " + address.getCity() + ", " + address.getStreet();
        return this;
    }

    public UserDto build() {
        dto = new UserDto(firstName + " " + lastName, address);
        return dto;
    }

    public UserDto getDto() {
        return dto;
    }
}
