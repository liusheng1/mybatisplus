package com.example.mybatisplus.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author liusheng
 * @since 2020-05-04
 */
@TableName("shop_user_token")
public class ShopUserToken implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String token;
	private String login_type;
	private String device_infor;
	private Integer is_availability;
	private Integer user_id;
	private Date create_time;
	private Date update_time;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getLogin_type() {
		return login_type;
	}

	public void setLogin_type(String login_type) {
		this.login_type = login_type;
	}

	public String getDevice_infor() {
		return device_infor;
	}

	public void setDevice_infor(String device_infor) {
		this.device_infor = device_infor;
	}

	public Integer getIs_availability() {
		return is_availability;
	}

	public void setIs_availability(Integer is_availability) {
		this.is_availability = is_availability;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

}
