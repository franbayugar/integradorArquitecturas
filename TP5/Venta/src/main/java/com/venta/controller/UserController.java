package com.venta.controller;


import com.venta.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    final static String userNameLog = "manganeta";
    final static String userPassLog = "1234";
    @PostMapping("user")
    public User login(@RequestBody User u) {
        // los keys del JSON q mandemos tienen q ser igual q los atributos de User
        String nameUser = u.getUser();
        String pwdUser = u.getPwd();
        if(nameUser.equals(userNameLog) && pwdUser.equals(userPassLog)){
            String token = getJWTToken(u.getUser());
            u.setToken(token);
            return u;
        }
        return null;

    }
    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("softtekJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }
}
