package edu.dl.project01.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id
    @Column(name = "member_id")
    private String id; //id와 db의 member_id와 동일

    private String name;

    private String email;

    private String phone;

    private String address;

    private String zipcode;

    @OneToMany(mappedBy = "member") //order에 있는 member에 의해 매핑되었음.
    private List<Order> orders = new ArrayList<>();

}
