package com.qubo.learning.rest.util;

import com.qubo.learning.common.model.ROLE;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Qubo_Song on 3/5/14.
 */


@ScriptAssert(
        lang = "javascript",
        script = "_this.confirmPassword.equals(_this.password)",
        message = "Your passwords don't match.")
public class AddUserForm {
    private String userName, password, confirmPassword;
    private ROLE userRole;

    @NotNull
    @Size(min = 4, max = 20, message = "User name is required, length must be 4-20 characters.")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @NotNull
    @Size(min = 4, max = 20, message = "Password is required, length must be 6-20 characters.")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public ROLE getUserRole() {
        return userRole;
    }

    public void setUserRole(ROLE userRole) {
        this.userRole = userRole;
    }

}
