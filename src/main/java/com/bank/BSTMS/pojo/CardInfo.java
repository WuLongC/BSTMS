package com.bank.BSTMS.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table card_info
 */
public class CardInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_info.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_info.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_info.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table card_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_info.id
     *
     * @return the value of card_info.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_info.id
     *
     * @param id the value for card_info.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_info.username
     *
     * @return the value of card_info.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_info.username
     *
     * @param username the value for card_info.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_info.password
     *
     * @return the value of card_info.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_info.password
     *
     * @param password the value for card_info.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }
}