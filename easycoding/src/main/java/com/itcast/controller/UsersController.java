package com.itcast.controller;

import com.itcast.entity.Users;
import com.itcast.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2020-02-24 18:43:34
 */
@RestController
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Users selectOne(String id) {
        return this.usersService.queryById(id);
    }

}