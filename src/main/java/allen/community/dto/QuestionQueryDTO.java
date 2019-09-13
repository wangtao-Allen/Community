package allen.community.dto;

import lombok.Data;

/**
 * Created by Allen on 2019/09/13
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
