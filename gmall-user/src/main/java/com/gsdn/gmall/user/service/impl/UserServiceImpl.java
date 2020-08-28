package com.gsdn.gmall.user.service.impl;


import com.gsdn.gmall.user.bean.UmsMember;
import com.gsdn.gmall.user.bean.UmsMemberReceiveAddress;
import com.gsdn.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gsdn.gmall.user.mapper.UserMapper;
import com.gsdn.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author shen_i
 * @Date: 2020/8/27 0027
 * @Time: 22:47
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<UmsMember> findAllUser() {
        List list = userMapper.selectAll();
        return list;
    }

    /**
     * 根据MemberId查询UmsMemberReceiveAddress
     * @param id
     * @return
     */
    @Override
    public List<UmsMemberReceiveAddress> findReceiveAddressByMemberId(String id) {
        UmsMemberReceiveAddress usMemberReceiveAddress = new UmsMemberReceiveAddress();
        usMemberReceiveAddress.setMemberId(id);
        List<UmsMemberReceiveAddress> list = umsMemberReceiveAddressMapper.select(usMemberReceiveAddress);

        return list;
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delUser(String id) {

        userMapper.deleteByPrimaryKey(String.valueOf(id));

    }

    /**
     * 增加
     * @param umsMember
     */
    @Override
    public void addUser(UmsMember umsMember) {
        userMapper.insert(umsMember);
    }


    /**
     * 更新
     * @param umsMember
     */
    @Override
    public void updateUser(UmsMember umsMember) {

//        UmsMember umsMember1 = new UmsMember();
//        umsMember1.setId(String.valueOf(11));
//        umsMember1.setUsername("xff");
//        umsMember1.setPassword("232323");
        userMapper.updateByPrimaryKey(umsMember);

    }

    @Override
    public UmsMember findOneUser(String id) {
        UmsMember umsMember = userMapper.selectByPrimaryKey(id);
        return umsMember;
    }




    /**
     * 查询所有
     * @return
     */
    @Override
    public List<UmsMember> findAllReceiveAddress() {
        List list = umsMemberReceiveAddressMapper.selectAll();
        return list;
    }


    /**
     * 删除
     * @param id
     */
    @Override
    public void delReceiveAddress(String id) {

        umsMemberReceiveAddressMapper.deleteByPrimaryKey(String.valueOf(id));

    }

    /**
     * 增加
     * @param umsMemberReceiveAddress
     */
    @Override
    public void addReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        umsMemberReceiveAddressMapper.insert(umsMemberReceiveAddress);
    }


    /**
     * 更新
     * @param umsMemberReceiveAddress
     */
    @Override
    public void updateReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress) {

//        UmsMember umsMember1 = new UmsMember();
//        umsMember1.setId(String.valueOf(11));
//        umsMember1.setUsername("xff");
//        umsMember1.setPassword("232323");
        umsMemberReceiveAddressMapper.updateByPrimaryKey(umsMemberReceiveAddress);

    }

    @Override
    public UmsMemberReceiveAddress findOneReceiveAddress(String id) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = umsMemberReceiveAddressMapper.selectByPrimaryKey(id);
        return umsMemberReceiveAddress;
    }


}
