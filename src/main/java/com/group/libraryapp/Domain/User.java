package com.group.libraryapp.Domain;

public class User {

    private String name;
    private Integer age;

    public User(String name, Integer age) {
        if (name==null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("name(%s)은 필수 항목입니다.", name));
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
