package edu.dl.project01.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter @Setter
@Slf4j
public class MemberForm {

    private String id;

    private String name;

    private String email;

    private String phone;

    private String address;

    private String zipcode;
}
