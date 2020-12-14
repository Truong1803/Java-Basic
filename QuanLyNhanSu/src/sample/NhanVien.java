package sample;

import java.io.Serializable;

public class NhanVien  extends ChucVu implements Serializable {
    private String ID;
    private String Name;
    private String Age;
    private String Sex;
    private String Address;
    private String PhoneNumber;
    private String Gmail;
    public NhanVien(){
        super("");
    };
    public NhanVien(String ID, String name, String age,String sex, String phoneNumber,String gmail,String address, String position) {
        super(position);
        this.ID = ID;
        Name = name;
        Age = age;
        Sex = sex;
        Address = address;
        PhoneNumber = phoneNumber;
        Gmail = gmail;
    }

    public String getSex() { return Sex; }

    public void setSex(String sex) { Sex = sex; }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return String.format(getID() + "," + getName() + "," + getAge()+getSex() + "," +getPhoneNumber() + "," + getGmail()+getAddress() + "," + getPosition() + "," + getCoe_Salary());
    }
}
