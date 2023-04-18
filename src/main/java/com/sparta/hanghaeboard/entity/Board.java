package com.sparta.hanghaeboard.entity;

import com.sparta.hanghaeboard.dto.BoardPasswordDto;
import com.sparta.hanghaeboard.dto.BoardRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// 이 정보대로 데이터 베이스에 저장 된다.
@Getter
@Entity
@NoArgsConstructor
public class Board extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column(nullable = false)
    private String userName;

//    @Column(nullable = false)
    private String contents;

//    @Column(nullable = false)
    private String title;

//    @JsonIgnore  // 컨트롤러에서 리턴할 때 이 부분만 빼고 보내준다.
//    // 또한 데이터 받아올 때에도 빼고 받아온다. -> 그래서 Dto 에도 password 필드 넣을 것
//    @Column(nullable = false)
    private String password;


//    public void setId(Long id) {
//        this.id = id;
//    }

    public Board(BoardRequestDto requestDto){
        this.userName = requestDto.getUserName();
        this.contents = requestDto.getContent();
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
    }


    public void update(BoardRequestDto requestDto) {
        this.userName = requestDto.getUserName();
        this.contents = requestDto.getContent();
        this.title = requestDto.getTitle();
    }


}