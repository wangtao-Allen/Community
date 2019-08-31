package allen.community.dto;

import lombok.Data;

/**
 * Created by Allen on 2019/08/17
 */
@Data
public class CommentDTO {

    private Long parentId;
    private String content;
    private Integer type;
}
