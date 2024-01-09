package com.cydeo.entity;

import com.cydeo.enums.CompanyStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Address;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Where(clause = "is_deleted = false")
@Table(name = "companies")
public class Company extends BaseEntity{

    @Column(unique = true)
    private String  title;

    private String phone;

    private String website;

    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
