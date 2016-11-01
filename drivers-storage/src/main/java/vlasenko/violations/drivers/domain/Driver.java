package vlasenko.violations.drivers.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Objects;

public class Driver implements Serializable {
    
    @Id
    private String licenceId;
    private String name;
    private String surname;
    private String email;
    
    public String getLicenceId() {
        return licenceId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(licenceId, driver.licenceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(licenceId);
    }
    
    @Override
    public String toString() {
        return "Driver{" +
                "licenceId='" + licenceId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
