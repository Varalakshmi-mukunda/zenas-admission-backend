package com.school.admission.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "enquiries")
public class Enquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentFirstName;
    private String studentLastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String currentClass;
    private String previousSchool;

    private String parentFirstName;
    private String parentLastName;
    private String relationship;
    private String phone;
    private String email;

    private String address;
    private String city;
    private String state;
    private String postalCode;

    private String academicYear;
    private String source;

    private Boolean schoolVisit;
    private LocalDate visitDate;

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentFirstName() { return studentFirstName; }
    public void setStudentFirstName(String studentFirstName) { this.studentFirstName = studentFirstName; }

    public String getStudentLastName() { return studentLastName; }
    public void setStudentLastName(String studentLastName) { this.studentLastName = studentLastName; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getCurrentClass() { return currentClass; }
    public void setCurrentClass(String currentClass) { this.currentClass = currentClass; }

    public String getPreviousSchool() { return previousSchool; }
    public void setPreviousSchool(String previousSchool) { this.previousSchool = previousSchool; }

    public String getParentFirstName() { return parentFirstName; }
    public void setParentFirstName(String parentFirstName) { this.parentFirstName = parentFirstName; }

    public String getParentLastName() { return parentLastName; }
    public void setParentLastName(String parentLastName) { this.parentLastName = parentLastName; }

    public String getRelationship() { return relationship; }
    public void setRelationship(String relationship) { this.relationship = relationship; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public Boolean getSchoolVisit() { return schoolVisit; }
    public void setSchoolVisit(Boolean schoolVisit) { this.schoolVisit = schoolVisit; }

    public LocalDate getVisitDate() { return visitDate; }
    public void setVisitDate(LocalDate visitDate) { this.visitDate = visitDate; }

}