package com.sparta.hanghaeboard.dto;

import lombok.Getter;
// Dto : 임시 데이터
// client to server
@Getter
public class BoardRequestDto{
    private String title;
    private String userName;
    private String content;
    private String password;
}
