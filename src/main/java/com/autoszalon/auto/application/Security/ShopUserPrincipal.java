/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.application.Security;

import com.autoszalon.auto.application.domains.User;
import com.autoszalon.auto.application.domains.UserBalance;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


/**
 *
 * @author zacco
 */

public class ShopUserPrincipal implements UserDetails {
    
    final private User user;
    
    public ShopUserPrincipal(User user){
    
    this.user=user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }
    
    public UserBalance GetUserbalance(){
    
    return user.getUserbalance();
    }

    @Override
    public boolean isAccountNonExpired() {
           return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    

    @Override
    public boolean isEnabled() {
        return true;
    }
    
    
}
