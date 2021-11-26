package com.crispycode.kcb.mapper;

import com.crispycode.kcb.model.Brewpub;
import com.crispycode.kcb.model.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> selectCommentByWriter(String writer);
}
