package com.sparta.hanghaeboard.controller;

import com.sparta.hanghaeboard.dto.BoardRequestDto;
import com.sparta.hanghaeboard.dto.BoardResponseDto;
import com.sparta.hanghaeboard.dto.deleteDto;
import com.sparta.hanghaeboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 브라우저에서 요청한 데이터를 잘 받고 던져주기만 하면 된다. 로직을 여기서 수행할 필요가 없다

// 싱글톤 패턴 : 생성자를 private 으로 만들고, new 를 사용하여 만들어지지 않게끔 한다.
// 모든 클래스를 싱글톤 패턴으로 만들어서 사용 -> RestController 이 그러한 기능을 지원해준다.

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 게시물 저장
    @PostMapping("/create")  // post 는 body 가 있음
    public BoardResponseDto createBoard(@RequestBody BoardRequestDto requestDto) {
//        BoardService boardService = new BoardService();  // 다른 클래스의 메소드를 부르기 위해서 인스턴스 생성 -> 각 메소드에 넣으면 여러번 해야하기 때문에 전역에 놓으면 된다.
        return boardService.createBoard(requestDto);  // 만든 인스턴스를 이용하여 메소드 부르기
    }

    // 게시물 전체 보기
    @GetMapping("/list")  // get 은 body 가 없다
    public List<BoardResponseDto> getBoardList() { // 데이터 베이스에 저장 된 전체 게시물 전부다 가져오는 API
        return boardService.getBoardList();
    }

    // 게시물 하나만 보기
    @GetMapping("/{id}")  // http://localhost:8080/board/{id}
    public BoardResponseDto getBoard(@PathVariable Long id) { // 똑같은 id 를 갖고 있는 것을 가져올 것
        return boardService.getBoard(id);
    }

    // 게시물 수정  = post + get(게시물하나보기)
    @PutMapping("/update/{id}")
    public BoardResponseDto updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.updateBoard(id, requestDto);
    }

    //게시물 삭제
    @DeleteMapping("/delete/{id}")
    public deleteDto deleteBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.deleteBoard(id, requestDto);
    }
}

