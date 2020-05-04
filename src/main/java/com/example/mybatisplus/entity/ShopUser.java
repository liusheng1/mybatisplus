package com.example.mybatisplus.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 用户会员表
 * </p>
 *
 * @author liusheng
 * @since 2020-05-04
 */
@TableName("shop_user")
public class ShopUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * user_id
     */
	private Integer USER_ID;
    /**
     * 手机号
     */
	private String MOBILE;
    /**
     * 邮箱号
     */
	private String EMAIL;
    /**
     * 密码
     */
	private String PASSWORD;
    /**
     * 用户名
     */
	private String USER_NAME;
    /**
     * 性别  1男  2女
     */
	private Integer SEX;
    /**
     * 年龄
     */
	private Integer AGE;
    /**
     * 注册时间
     */
	private Date CREATE_TIME;
    /**
     * 是否可用 1正常  2冻结
     */
	private Integer IS_AVALIBLE;
    /**
     * 用户头像
     */
	private String PIC_IMG;
    /**
     * QQ联合登陆id
     */
	private String QQ_OPENID;
    /**
     * 微信公众号关注id
     */
	private String WX_OPENID;


	public Integer getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(Integer USER_ID) {
		this.USER_ID = USER_ID;
	}

	public String getMOBILE() {
		return MOBILE;
	}

	public void setMOBILE(String MOBILE) {
		this.MOBILE = MOBILE;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String USER_NAME) {
		this.USER_NAME = USER_NAME;
	}

	public Integer getSEX() {
		return SEX;
	}

	public void setSEX(Integer SEX) {
		this.SEX = SEX;
	}

	public Integer getAGE() {
		return AGE;
	}

	public void setAGE(Integer AGE) {
		this.AGE = AGE;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date CREATE_TIME) {
		this.CREATE_TIME = CREATE_TIME;
	}

	public Integer getIS_AVALIBLE() {
		return IS_AVALIBLE;
	}

	public void setIS_AVALIBLE(Integer IS_AVALIBLE) {
		this.IS_AVALIBLE = IS_AVALIBLE;
	}

	public String getPIC_IMG() {
		return PIC_IMG;
	}

	public void setPIC_IMG(String PIC_IMG) {
		this.PIC_IMG = PIC_IMG;
	}

	public String getQQ_OPENID() {
		return QQ_OPENID;
	}

	public void setQQ_OPENID(String QQ_OPENID) {
		this.QQ_OPENID = QQ_OPENID;
	}

	public String getWX_OPENID() {
		return WX_OPENID;
	}

	public void setWX_OPENID(String WX_OPENID) {
		this.WX_OPENID = WX_OPENID;
	}

}
