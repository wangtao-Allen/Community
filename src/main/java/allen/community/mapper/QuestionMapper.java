package allen.community.mapper;

import allen.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Allen on 2019/06/23
 */
@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (${title},${description},${gmtCreate},${gmtModified},${creator},${tag})")
    void create(Question question);
}
