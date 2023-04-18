///*
//package com.sparta.hanghaeboard.repository;
//
//import com.sparta.hanghaeboard.dto.BoardResponseDto;
//import com.sparta.hanghaeboard.entity.Board;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@Repository
//public class BoardRepositoryjava {  // 이 클래스는 데이터 베이스와 연결
//
//    private static final Map<Long, Board> table = new HashMap<>();  // 그 데이터베이스의 테이블
//    private static long ID;  //Map 의 key 값으로 들어가는 ID
//    // 게시물 저장
//    public String createBoard(Board board){  // BoardService 에서 온 데이터가 Board 타입의 board 이므로
//
//        // ID 체크 : ID 중복을 막기 위해 table 의 최대 ID + 1
//        // 브라우저는 id 를 알 수 없다
////        board.setId(++ID);
//
//        // 테이블에 생성한 Board 인스턴스를 저장
//        table.put(ID, board);
//
//        return "게시물 저장에 성공했습니다.";
//    }
//
//    // 게시물 전체 보기
//    public List<BoardResponseDto> getBoardList() {  // 데이터 베이스에 저장 된 전체 게시물 전부다 가져오는 API
//        // 테이블에 저장 되어 있는 모든 게시물 목록 조회
//        return table.values().stream().map(BoardResponseDto::new).collect(Collectors.toList());
//    }
//
//    // 게시물 하나만 보기
//    public Board getBoard(Long id)  { // 똑같은 id 를 갖고 있는 것을 가져올 것
//        return table.get(id);  // 그 테이블과 연결 되어 id 에 해당하는 Board 객체 하나를 뽑아온다.
//    }
//
//
//    //게시물 삭제
//    public void deleteBoard(Long id) {
//        table.remove(id);
//    }
//}
//
//*/
