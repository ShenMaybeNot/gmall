package com.gsdn.gmall.user.service;

import com.gsdn.gmall.user.bean.UmsMember;
import com.gsdn.gmall.user.bean.UmsMemberReceiveAddress;
import com.gsdn.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shen_i
 * @Date: 2020/8/27 0027
 * @Time: 22:45
 * @Description:
 */


public interface UserService {


    List<UmsMember> findAllUser();

    List<UmsMemberReceiveAddress> findReceiveAddressByMemberId(String id);

    void delUser(String umsMemberId);

    void addUser(UmsMember umsMember);

    void updateUser(UmsMember umsMember);

    UmsMember findOneUser(String id);




    List<UmsMember> findAllReceiveAddress();


    void delReceiveAddress(String id);

    void addReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    void updateReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);


    UmsMemberReceiveAddress findOneReceiveAddress(String id);


}
