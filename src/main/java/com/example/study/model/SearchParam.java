package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // 기본 생성자부터 get set 메소드 등을 모두 생성해줌
@AllArgsConstructor // 모든 argument를 가지는 변수에 대해서 생성자를 추가
public class SearchParam {

    private String account;
    private String email;
    private int page;

    // { "account" : "", "email" : "", "page" : 0 }

}
