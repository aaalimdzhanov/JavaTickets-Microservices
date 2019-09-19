package com.beelab.intranet.models;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "USERS")
public class UserModel {

    @Id
    @Column(name = "USER_ID")
    private long userId;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "PHOTO")
    private String photo;

    @Column(name = "IMAGE_ID")
    private String imageId;

    @Column(name = "ADD_DT")
    private Timestamp addDt;

    @Column(name = "TAB_NUM")
    private String tabNum;

    @Column(name = "PL")
    private String pl;

    @Column(name = "BIRTHDATE")
    private Timestamp birthdate;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SKYPE")
    private String skype;

    @Column(name = "TELEGRAM")
    private String telegram;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "WORK_NUMBER")
    private String workNumber;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "COMPANY_ID")
    private String company_id;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Timestamp getAddDt() {
        return addDt;
    }

    public void setAddDt(Timestamp addDt) {
        this.addDt = addDt;
    }

    public String getTabNum() {
        return tabNum;
    }

    public void setTabNum(String tabNum) {
        this.tabNum = tabNum;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public Timestamp getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Timestamp birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", photo='" + photo + '\'' +
                ", imageId='" + imageId + '\'' +
                ", addDt=" + addDt +
                ", tabNum='" + tabNum + '\'' +
                ", pl='" + pl + '\'' +
                ", birthdate=" + birthdate +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", telegram='" + telegram + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", workNumber='" + workNumber + '\'' +
                ", status='" + status + '\'' +
                ", company_id='" + company_id + '\'' +
                '}';
    }
}
