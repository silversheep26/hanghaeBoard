package com.sparta.hanghaeboard.dto;

import com.sparta.hanghaeboard.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

// server to client
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardResponseDto {
    private Long id;
    private String title;
    private String userName;
    private String content;
//    @CreatedDate
    private LocalDateTime createdAt;
//    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.userName = board.getUserName();
        this.content = board.getContents();
        this.createdAt = board.getCreatedAt();
        this.modifiedAt = board.getModifiedAt();
    }

    // board 필드를 dto 로 변경
    public static BoardResponseDto from(Board board) {
        return new BoardResponseDto(
                board.getId(),
                board.getTitle(),
                board.getUserName(),
                board.getContents(),
                board.getCreatedAt(),
                board.getModifiedAt());
    }

}