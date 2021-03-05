package com.demo.board.controller;

import com.demo.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    public final BoardMapper boardMapper;

    @GetMapping("/read")
    public List<Map<String, Object>> read(){
        return boardMapper.read();
    }
}
