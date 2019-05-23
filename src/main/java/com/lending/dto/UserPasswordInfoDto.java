package com.lending.dto;

public class UserPasswordInfoDto {

    private String oldPassword;
    private String newPassword;
    private String repeatNewPassword;

    public UserPasswordInfoDto() {

    }

    public UserPasswordInfoDto(String oldPassword, String newPassword, String repeatNewPassword) {
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.repeatNewPassword = repeatNewPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getRepeatNewPassword() {
        return repeatNewPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void setRepeatNewPassword(String repeatNewPassword) {
        this.repeatNewPassword = repeatNewPassword;
    }

    public boolean checkIfNewPasswordsMatch() {
        return newPassword.equals(repeatNewPassword);
    }

    public boolean checkIfOldAndNewAreDifferent() {
        return !oldPassword.equals(newPassword);
    }
}
