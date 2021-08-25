package com.alv.liferay.exercise.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExForm extends BaseEntity {


    public ExForm(Long id, String name, String surname, String birthdate, String email, String captcha) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.email = email;
        this.captcha = captcha;
    }

    private String name;
    private String surname;
    private String birthdate;
    private String email;
    private String captcha;

}
