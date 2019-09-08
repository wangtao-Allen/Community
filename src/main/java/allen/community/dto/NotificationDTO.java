package allen.community.dto;

import lombok.Data;

/**
 * Created by Allen on 2019/09/07
 */
@Data
public class NotificationDTO {

    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private String typeName;
    private Long outerId;
    private int type;
}
