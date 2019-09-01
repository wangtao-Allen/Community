package allen.community.mapper;

import allen.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment record);
}