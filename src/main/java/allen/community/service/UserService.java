package allen.community.service;

import allen.community.mapper.UserMapper;
import allen.community.model.User;
import allen.community.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Allen on 2019/08/11
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public void createOrUpdate(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andAccountIdEqualTo(user.getAccountId());
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() != 0) {
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            userMapper.insert(user);
        } else {
            User dbUser = userList.get(0);
            dbUser.setGmtModified(System.currentTimeMillis());
            dbUser.setAvatarUrl(dbUser.getAvatarUrl());
            dbUser.setName(dbUser.getName());
            dbUser.setToken(dbUser.getToken());
            userMapper.updateByPrimaryKeySelective(dbUser);
        }
    }
}
