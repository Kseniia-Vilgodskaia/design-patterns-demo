package org.example.patterns.builder;

public class UserDto {

    private String name;
    private String address;

    public UserDto(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
