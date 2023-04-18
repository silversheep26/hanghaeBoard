package com.sparta.hanghaeboard.dto;
// 필요 없을 듯
import com.sparta.hanghaeboard.entity.Board;
import lombok.Getter;

@Getter
public class BoardPasswordDto {
    private String password;

    public BoardPasswordDto(Board board) {
        this.password = board.getPassword();
    }
}
