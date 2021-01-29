package models;

import java.util.Arrays;
import java.util.Date;

public class Applicant {

    private String id;
    private Date created_at;
    private Date delete_at;
    private String href;
    private String first_name;
    private String last_name;
    private String email;
    private Date dob;
    private IDnumber[] id_numbers;
    private Address address;
    private Boolean sandbox;

    public Applicant(String id, Date created_at, Date delete_at, String href, String first_name, String last_name, String email, Date dob, IDnumber[] id_numbers, Address address, Boolean sandbox) {
        this.id = id;
        this.created_at = created_at;
        this.delete_at = delete_at;
        this.href = href;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.dob = dob;
        this.id_numbers = id_numbers;
        this.address = address;
        this.sandbox = sandbox;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getDelete_at() {
        return delete_at;
    }

    public void setDelete_at(Date delete_at) {
        this.delete_at = delete_at;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public IDnumber[] getId_numbers() {
        return id_numbers;
    }

    public void setId_numbers(IDnumber[] id_numbers) {
        this.id_numbers = id_numbers;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getSandbox() {
        return sandbox;
    }

    public void setSandbox(Boolean sandbox) {
        this.sandbox = sandbox;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id='" + id + '\'' +
                ", created_at=" + created_at +
                ", delete_at=" + delete_at +
                ", href='" + href + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", id_numbers=" + Arrays.toString(id_numbers) +
                ", address=" + address +
                ", sandbox=" + sandbox +
                '}';
    }
}
