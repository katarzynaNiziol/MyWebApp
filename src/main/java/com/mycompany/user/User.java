package com.mycompany.user;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, name = "first_name")
    private String firstName;

    @Column(length = 45, name = "last_name")
    private String lastName;

    @Column(length = 10, name = "sex")
    private String sex;

    @Column(unique = true, length = 45)
    private String email;

    @Column(length = 12)
    private String tel_number;

    @Column(unique = true, length = 45, name = "PESEL")
    private String pesel;

    @Column(length = 45, name = "nationality")
    private String nationality;

    @Column(length = 45, name = "document_number")
    private String document_number;

    @Column(length = 45, name = "bank_account_number")
    private String bank_account_number;

    @Column(length = 45, name = "move_in_date")
    private String move_in_date;

    @Column(length = 45, name = "move_out_date")
    private String move_out_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel_number() {
        return tel_number;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }


    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDocument_number() {
        return document_number;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    public String getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(String bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public String getMove_in_date() {
        return move_in_date;
    }

    public void setMove_in_date(String move_in_date) {
        this.move_in_date = move_in_date;
    }

    public String getMove_out_date() {
        return move_out_date;
    }

    public void setMove_out_date(String move_out_date) {
        this.move_out_date = move_out_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", tel_number='" + tel_number + '\'' +
                ", pesel='" + pesel + '\'' +
                ", nationality='" + nationality + '\'' +
                ", document_number='" + document_number + '\'' +
                ", bank_account_number='" + bank_account_number + '\'' +
                ", move_in_date='" + move_in_date + '\'' +
                ", move_out_date='" + move_out_date + '\'' +
                '}';
    }
}
