package allen.community.dto;

import allen.community.model.User;
import lombok.Data;

/**
 * Created by Allen on 2019/08/31
 */
@Data
public class CommentDTO {

    private Long id;

    private Long parentId;

    private Integer type;

    private Long commentator;

    private Long gmtCreate;

    private Long gmtModified;

    private Integer likeCount;

    private String content;

    private User user;
}
