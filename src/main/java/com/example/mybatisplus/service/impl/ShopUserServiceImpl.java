package com.example.mybatisplus.service.impl;

import com.example.mybatisplus.entity.ShopUser;
import com.example.mybatisplus.mapper.ShopUserMapper;
import com.example.mybatisplus.service.IShopUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户会员表 服务实现类
 * </p>
 *
 * @author liusheng
 * @since 2020-05-04
 */
@Service
public class ShopUserServiceImpl extends ServiceImpl<ShopUserMapper, ShopUser> implements IShopUserService {
	
}
