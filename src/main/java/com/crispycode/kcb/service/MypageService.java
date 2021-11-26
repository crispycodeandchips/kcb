package com.crispycode.kcb.service;

import com.crispycode.kcb.dto.MypageResponseDto;
import com.crispycode.kcb.mapper.CommentMapper;
import com.crispycode.kcb.model.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MypageService {
    private final CommentMapper commentMapper;

    public List<MypageResponseDto> getList(String writer) {
        List<Comment> commentList = commentMapper.selectCommentByWriter(writer);
        List<MypageResponseDto> dtoList = commentList.stream()
                .map(comment -> new MypageResponseDto(
                        comment.getCommentDate(), comment.getRate(), comment.getContent(), comment.getSubjectType()))
                .collect(Collectors.toList());
        return dtoList;
    }
}



