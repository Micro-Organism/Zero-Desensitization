package com.zero.desensitization.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import red.zyc.desensitization.annotation.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemUserEntity {

    private Integer id;

    @ChineseNameSensitive
    private String name;

    @IdCardNumberSensitive
    private String idCard;

    @PhoneNumberSensitive
    private String tel;

    @EmailSensitive
    private String email;

    @PasswordSensitive
    private String password;

}
