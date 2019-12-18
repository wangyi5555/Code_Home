package com.wangyi.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Component;



public class ShiroRealm extends AuthenticatingRealm {

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;

        System.out.println("Shiro Realm");

        String username = upToken.getUsername();

        if("unknow".equals(username)){
            throw new UnknownAccountException("用户不存在");
        }
        if("monster".equals(username)){
            throw new LockedAccountException("用户被锁定");
        }

        Object principal = username;
        Object credentials = null;

        if("admin".equals(username)){
            credentials = "c41d7c66e1b8404545aa3a0ece2006ac";
        }else if("user".equals(username)){
            credentials = "2bbffae8c52dd2532dfe629cecfb2c85";
        }


        // 123 md5加密1024次
//        Object credentials = "64c8b1e43d8ba3115ab40bcea57f010b";
        String realmName = getName();
        ByteSource byteSource = ByteSource.Util.bytes(username);

        return new SimpleAuthenticationInfo(principal,credentials,byteSource,realmName);
    }

//    public static void main(String[] args) {
//        System.out.println(new SimpleHash("MD5", "123", ByteSource.Util.bytes("user"), 1024));
//    }
}
