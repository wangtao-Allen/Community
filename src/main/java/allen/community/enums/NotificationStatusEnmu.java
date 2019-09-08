package allen.community.enums;

/**
 * Created by Allen on 2019/09/07
 */
public enum NotificationStatusEnmu {
    UNREAD(0), READ(1);

    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnmu(int status) {
        this.status = status;
    }
}
