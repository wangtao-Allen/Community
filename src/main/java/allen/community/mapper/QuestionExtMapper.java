package allen.community.mapper;

import allen.community.model.Question;

public interface QuestionExtMapper {

    int incView(Question record);

    int incCommentCount(Question record);

}