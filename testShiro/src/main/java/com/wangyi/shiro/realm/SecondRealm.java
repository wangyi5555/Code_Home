package com.wangyi.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.HashSet;
import java.util.Set;


public class SecondRealm extends AuthorizingRealm {

//   信息校对
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;


        System.out.println("Second Realm");

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
            credentials = "49d9fbf007fd95343492e607aa34455eeb062b26";
        }else if("user".equals(username)){
            credentials = "16962ca194c20f8a1616c521318c37de8efeb537";
        }


        // 123 md5加密1024次
//        Object credentials = "64c8b1e43d8ba3115ab40bcea57f010b";
        String realmName = getName();
        ByteSource byteSource = ByteSource.Util.bytes(username);

        return new SimpleAuthenticationInfo(principal,credentials,byteSource,realmName);
    }

//    授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        System.out.println("second rolecheck");

        Object principal = principalCollection.getPrimaryPrincipal();

        Set<String> roles = new HashSet<>();
        roles.add("user");
        if("admin".equals(principal)){
            roles.add("admin");
        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
        return info;
    }

//    public static void main(String[] args) {
//        System.out.println(new SimpleHash("SHA1", "123", ByteSource.Util.bytes("admin"), 1024));
//    }
}
