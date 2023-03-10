package com.model;

import java.io.Serializable;

public class OtpModel extends User implements Serializable {
    private String otp;

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
