package allen.community.model;

public class Notification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.ID
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.NOTIFIER
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    private Long notifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.RECEIVER
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    private Long receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.OUTER_ID
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    private Long outerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.TYPE
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.GMT_CREATE
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.STATUS
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.NOTIFIER_NAME
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    private String notifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.OUTER_TITLE
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    private String outerTitle;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.ID
     *
     * @return the value of notification.ID
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.ID
     *
     * @param id the value for notification.ID
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.NOTIFIER
     *
     * @return the value of notification.NOTIFIER
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public Long getNotifier() {
        return notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.NOTIFIER
     *
     * @param notifier the value for notification.NOTIFIER
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public void setNotifier(Long notifier) {
        this.notifier = notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.RECEIVER
     *
     * @return the value of notification.RECEIVER
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public Long getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.RECEIVER
     *
     * @param receiver the value for notification.RECEIVER
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.OUTER_ID
     *
     * @return the value of notification.OUTER_ID
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public Long getOuterId() {
        return outerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.OUTER_ID
     *
     * @param outerId the value for notification.OUTER_ID
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public void setOuterId(Long outerId) {
        this.outerId = outerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.TYPE
     *
     * @return the value of notification.TYPE
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.TYPE
     *
     * @param type the value for notification.TYPE
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.GMT_CREATE
     *
     * @return the value of notification.GMT_CREATE
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.GMT_CREATE
     *
     * @param gmtCreate the value for notification.GMT_CREATE
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.STATUS
     *
     * @return the value of notification.STATUS
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.STATUS
     *
     * @param status the value for notification.STATUS
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.NOTIFIER_NAME
     *
     * @return the value of notification.NOTIFIER_NAME
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public String getNotifierName() {
        return notifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.NOTIFIER_NAME
     *
     * @param notifierName the value for notification.NOTIFIER_NAME
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public void setNotifierName(String notifierName) {
        this.notifierName = notifierName == null ? null : notifierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.OUTER_TITLE
     *
     * @return the value of notification.OUTER_TITLE
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public String getOuterTitle() {
        return outerTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.OUTER_TITLE
     *
     * @param outerTitle the value for notification.OUTER_TITLE
     *
     * @mbg.generated Sat Sep 07 18:06:26 CST 2019
     */
    public void setOuterTitle(String outerTitle) {
        this.outerTitle = outerTitle == null ? null : outerTitle.trim();
    }
}