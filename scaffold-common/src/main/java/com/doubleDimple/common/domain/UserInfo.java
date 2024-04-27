package com.doubleDimple.common.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class UserInfo implements Serializable {

    private String userId;

    private String userName;

}
