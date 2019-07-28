package allen.community.dto;

import lombok.Data;

/**
 * Created by Allen on 2019/6/12
 */
@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
