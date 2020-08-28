package com.gsdn.gmall.user.controller;

import com.gsdn.gmall.user.bean.UmsMember;
import com.gsdn.gmall.user.bean.UmsMemberReceiveAddress;
import com.gsdn.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author shen_i
 * @Date: 2020/8/27 0027
 * @Time: 22:45
 * @Description:
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;


    /**
     * 查询所有UmsMember
     * @return
     */
    @ResponseBody
    @RequestMapping("findAllUser")
    public String findAllUser(){
        List<UmsMember> UserList = userService.findAllUser();
        return UserList.toString();
    }
    /**
     * 查询一个
     */
    @ResponseBody
    @RequestMapping("findOneUser")
    public String findOneUser(String id){
        UmsMember UserList = userService.findOneUser(id);
        return null;
    }

    /**
     * 增加user
     */
    @RequestMapping("addUser")
    public String addUser(UmsMember umsMember){

         userService.addUser(umsMember);

        return findAllUser();
    }
    /**
     * 删除user
     */
    @RequestMapping("delUser")
    public String delUser(String id){

        userService.delUser(id);

        return null;
    }
    /**
     * 修改/更新user
     */
    @RequestMapping("updateUser")
    public String updateUser(UmsMember umsMember){

        userService.updateUser(umsMember);

        return null;
    }



    /**
     * 根据MemberId查询UmsMemberReceiveAddress收货地址
     * @return
     */
    @ResponseBody
    @RequestMapping("findReceiveAddressByMemberId")
    public String findReceiveAddressByMemberId(String id){

        List<UmsMemberReceiveAddress> addresses = userService.findReceiveAddressByMemberId(id);
        return addresses.toString();
    }




    /**
     * 查询所有UmsMember
     * @return
     */
    @ResponseBody
    @RequestMapping("findAllReceiveAddress")
    public String findAllReceiveAddress(){
        List<UmsMember> UserList = userService.findAllReceiveAddress();
        return UserList.toString();
    }
    /**
     * 查询一个
     */
    @ResponseBody
    @RequestMapping("findOneReceiveAddress")
    public String findOneReceiveAddress(String id){
        UmsMemberReceiveAddress receiveAddressList = userService.findOneReceiveAddress(id);
        return null;
    }

    /**
     * 增加user
     */
    @RequestMapping("addReceiveAddress")
    public String addReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress){

        userService.addReceiveAddress(umsMemberReceiveAddress);

        return findAllUser();
    }
    /**
     * 删除user
     */
    @RequestMapping("delReceiveAddress")
    public String delReceiveAddress(String id){

        userService.delReceiveAddress(id);

        return null;
    }
    /**
     * 修改/更新user
     */
    @RequestMapping("updateUser")
    public String updateUser(UmsMemberReceiveAddress umsMemberReceiveAddress){

        userService.updateReceiveAddress(umsMemberReceiveAddress);

        return null;
    }

}
