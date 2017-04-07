package com.asimes.websocket.pojo;

/**
 * 用户信息vo
 *
 * @author 汪俊
 * @date 2016-10-26
 */

public class UserInfo {

    private String name;
    private int gender;
    private int age;
    private String personalSign;
    private String birthDate;
    private String telephone;

    public String getName() {
        return name;
    }

    public UserInfo setName(String name) {
        this.name = name;
        return this;
    }

    public int getGender() {
        return gender;
    }

    public UserInfo setGender(int gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserInfo setAge(int age) {
        this.age = age;
        return this;
    }

    public String getPersonalSign() {
        return personalSign;
    }

    public UserInfo setPersonalSign(String personalSign) {
        this.personalSign = personalSign;
        return this;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public UserInfo setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public UserInfo setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", personalSign='" + personalSign + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
