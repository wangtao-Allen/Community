package allen.community.dto;

import lombok.Data;

/**
 * Created by Allen on 2019/08/17
 */
@Data
public class CommentCreateDTO {

    private Long parentId;
    private String content;
    private Integer type;
}
