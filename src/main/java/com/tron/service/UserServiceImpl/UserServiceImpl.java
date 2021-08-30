package com.tron.service.UserServiceImpl;

import com.tron.Dao.UserDao;
import com.tron.domain.User;
import com.tron.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

//    @Service
//    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;
//
//    @Autowired
//    private RoleDao roleDao;
//
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Autowired
//    private AccountService accountService;

    public void save(User user) {
        userDao.save(user);
    }

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }


//    public User createUser(User user, Set<UserRole> userRoles) {
//        User localUser = userDao.findByUsername(user.getUsername());
//
//        if (localUser != null) {
//            LOG.info("User with username {} already exist. Nothing will be done. ", user.getUsername());
//        } else {
//            String encryptedPassword = passwordEncoder.encode(user.getPassword());
//            user.setPassword(encryptedPassword);
//
//            for (UserRole ur : userRoles) {
//                roleDao.save(ur.getRole());
//            }
//
//            user.getUserRoles().addAll(userRoles);
//
//            user.setPrimaryAccount(accountService.createPrimaryAccount());
//            user.setSavingsAccount(accountService.createSavingsAccount());
//
//            localUser = userDao.save(user);
//        }
//
//        return localUser;
//    }

    public boolean checkUserExists(String username, String email) {
        return checkUsernameExists(username) || checkEmailExists(username);
    }

    public boolean checkUsernameExists(String username) {
        return null != findByUsername(username);
    }

    public boolean checkEmailExists(String email) {
        return null != findByEmail(email);
    }

}