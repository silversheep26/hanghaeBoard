package com.sparta.hanghaeboard.controller;

public class 주석 {

// @RequestBody Course course : 받아온 body 를 Course 에 있는 필드에 맞춰 넣는다.
// @PathVariable

//    private final BoardService boardService;
//    @GetMapping("/write")
//    public String boardWriteForm() {
//     return null;
//    }
//
//    @PostMapping("/board")
//    public Board createBoard(@RequestBody BoardRequestDto requestDto) {
//        return boardService.createBoard(requestDto);
//    }
//
//    @GetMapping("/board")
//    public List<Board> getBoards(){
//        return boardService.getBoards();
//    }



/*
버전 1
- Controller , entity, dto 만 있을 때 이렇게 사용하였다.
@RestController
@RequiredArgsConstructor  // final 이라고 붙어 있는 애들을 찾아서 생성자를 만들어준다 여러개 잇으면 여려개 만들어준다.
@RequestMapping("/board")
public class BoardController {
    private static final Map<Long, Board> table = new HashMap<>();
    private static long ID;  //Map 의 key 값으로 들어가는 ID
    // 게시물 저장
    @PostMapping("/create")  // post 는 body 가 있음
    public String createBoard(@RequestBody BoardRequestDto requestDto){
        // 브라우저에서 받아온 데이터 저장하기 위해서 Board 객체로 변환
        // Board 의 매개변수가 있는 생성자를 만들었다.
        // 그래서 없으면 Board 에 가서 만들어 줘야함
        // 이 것을 해주므로써 데이터베이스에 저장하기 위한 인스턴스 하나 만들었다.
        Board board = new Board(requestDto);
        // ID 체크 : ID 중복을 막기 위해 table 의 최대 ID + 1
        // 브라우저는 id 를 알 수 없다
        board.setId(++ID);
        // 테이블에 생성한 Board 인스턴스를 저장
        table.put(ID, board);
        return "게시물 저장에 성공했습니다.";
    }
    // 게시물 전체 보기
    @GetMapping("/list")  // get 은 body 가 없다
    public List<BoardResponseDto> getBoardList() {  // 데이터 베이스에 저장 된 전체 게시물 전부다 가져오는 API
        // 테이블에 저장 되어 있는 모든 게시물 목록 조회
        return table.values().stream().map(BoardResponseDto::new).collect(Collectors.toList());
    }
    // 게시물 하나만 보기
    @GetMapping("/{id}")  // http://localhost:8080/board/{id}
    public BoardResponseDto getBoard(@PathVariable Long id)  { // 똑같은 id 를 갖고 있는 것을 가져올 것
        // 조회하기 위해 받아온 course 의 id 를 사용하여 해당 course 인스턴스가 테이블에 존재하는지 확인하고 가져오기
        Board board = table.get(id);
        if (board != null){  // 게시물이 있다면
            return new BoardResponseDto(board);  // board를 사용하여 board~Dto 타입으로 변환하여 반환 : 왜냐 위에서 Board board 로 반환타입을 Board 정했기 때문에
        } else {
            return new BoardResponseDto(); // 아무것도 없는 경우 빈 벌 반환
        }
    }
    // 게시물 수정  = post + get(게시물하나보기)
    @PutMapping("/update/{id}")
    public BoardResponseDto updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto){
        // 수정하기 위해 받아온 board 의 id 를 사용하여 해당 board 인스턴스가 존재하는지 확인 후 가져오기
        Board board = table.get(id);
        if (board != null){  // 수정하고 싶으면 해당 게시물이 반드시 있어야한다.
            board.update(requestDto);
            return new BoardResponseDto(board);
        } else {
            return new BoardResponseDto();
        }
    }
    //게시물 삭제
    @DeleteMapping("/delete/{id}")
    public String deleteBoard(@PathVariable Long id) {
        // 삭제하기 위해 받아온 board 의 id 를 사용하여 해당 board 인스턴스가 존재하는지 확인 후 가져오기
        Board board = table.get(id);  // 삭제하기 위해 테이블에 있는지 확인하기 위해  받아오는 것
        if (board != null){
            table.remove(id); // id 와 일치하는 애들을 지워준다.
            return "게시물 삭제에 성공했습니다. ";
        } else {
            return "삭제할 게시물이 없습니다.";
        }
    }
}
 */

}
