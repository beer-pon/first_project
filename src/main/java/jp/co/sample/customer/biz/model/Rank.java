package jp.co.sample.customer.biz.model;

import java.util.Date;

public class Rank {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.id
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.name
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.time
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    private String time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rank.ins_datetime
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    private Date insDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.id
     *
     * @return the value of rank.id
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.id
     *
     * @param id the value for rank.id
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.name
     *
     * @return the value of rank.name
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.name
     *
     * @param name the value for rank.name
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.time
     *
     * @return the value of rank.time
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.time
     *
     * @param time the value for rank.time
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rank.ins_datetime
     *
     * @return the value of rank.ins_datetime
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    public Date getInsDatetime() {
        return insDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rank.ins_datetime
     *
     * @param insDatetime the value for rank.ins_datetime
     *
     * @mbggenerated Sat Aug 15 02:45:59 JST 2015
     */
    public void setInsDatetime(Date insDatetime) {
        this.insDatetime = insDatetime;
    }
}