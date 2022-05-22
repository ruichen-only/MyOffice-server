package com.rea.myoffice.service.impl;

import com.rea.myoffice.model.Userinfo;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author CRR
 */
@Data
public class UserDetailsImpl implements UserDetails {
  private final Userinfo userinfo;

  public UserDetailsImpl(Userinfo userinfo) {
    this.userinfo = userinfo;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public String getPassword() {
    return userinfo.getPassword();
  }

  @Override
  public String getUsername() {
    return userinfo.getUsername();
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
    return false;
  }
}
