package allen.community.model;

import lombok.Data;

/**
 * Created by Allen on 2019/06/23
 */
@Data
public class User {

    private Integer id;
    private String accountId;
    private String name;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String bio;
    private String avatarUrl;

}
