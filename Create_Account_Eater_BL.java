package com.example.dharmik.example1;

public class Create_Account_Eater_BL
{
    private String name;
    private String email_id;
    private String contact;
    private String pincode;
    private String address1;
    private String address2;
    private String address3;
    private String password;
    private String foodtype;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }

    public String toString()
    {
        String str = "";

        str = "\nName : " + this.name + "\nEmail Id : " + this.email_id + "\nPassword : " + this.password + "\nContact : " + this.contact + "\nAddress 1 : " + this.address1 + "\nAddress 2 : " + this.address2 + "\nAddress 3 : " + this.address3 + "\nPincode : " + this.pincode + "\nFoodType : " + this.foodtype;

        return str;
    }
}
