package allen.community.exception;

/**
 * Created by Allen on 2019/08/17
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001, "您找的问题不在了，要不要换个试试?"),
    TARGET_PARAM_NOT_FOUND(2002, "为选中任何问题或评论进行回复"),
    NOT_LOGIN(2003, "当前操作需要登录，请登录后重试"),
    SYSTEM_ERROR(2004, "服务冒烟了，要不您稍后再试试！！！"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006, "回复的评论不存在了，要不要换个试试？");

    private Integer code;
    private String message;

    @Override
    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
