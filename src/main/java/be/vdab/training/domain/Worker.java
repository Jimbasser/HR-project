package be.vdab.training.domain;

import be.vdab.training.enums.CXOType;
import be.vdab.training.enums.Gender;
import be.vdab.training.enums.Nationality;
import be.vdab.training.enums.Transport;

import java.util.Date;

public abstract class Worker extends BaseEntity {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    private Gender gender;
    private Transport transportType;
    private Nationality nationality;
    private CXOType cxoType;

    public Worker() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Transport getTransportType() {
        return transportType;
    }

    public void setTransportType(Transport transportType) {
        this.transportType = transportType;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public CXOType getCxoType() {
        return cxoType;
    }

    public void setCxoType(CXOType cxoType) {
        this.cxoType = cxoType;
    }

    public String getFullName() {
        return firstName.concat(" " + middleName + " " + lastName);
    }
}
