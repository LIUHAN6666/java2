package com.hspedu.qqcommen;

import java.io.Serializable;


    public class User implements Serializable {
        private static final long serialVersionUID = 1L;
        private String userId;
        private String passwd;

        public User() {
        }
        public User(String userId, String passwd) {
            this.userId = userId;
            this.passwd = passwd;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId() {
            this.userId = userId;
        }

        public String getPasswd() {
            return passwd;
        }

        public void setPasswd() {
            this.passwd = passwd;
        }
    }

