package com.qubo.learning.common.service;

import com.qubo.learning.common.model.ROLE;
import com.qubo.learning.common.model.SysUser;
import com.qubo.learning.common.model.SysUserRole;

import java.util.List;

/**
 * Created by Qubo_Song on 2/27/14.
 */
public interface UserDao {

    public SysUser getUserByName(String username);

    public List<SysUserRole> getUserRolesByUserID(int id);

    public List<SysUser> getAllUsers();

    public void setUserOnlineByName(String username);

    public void setUserOfflineByName(String username);

    public int getOnlineUserCount();

    public void addUser(String userName, String password, String userRole);

}
