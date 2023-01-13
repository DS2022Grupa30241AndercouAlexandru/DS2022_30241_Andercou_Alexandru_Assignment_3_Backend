package ro.tuc.ds2022.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
@Entity
@Data
public class UserAccount implements  UserDetails{

   public UserAccount()
    {

        devices=new ArrayList<Device>();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String name;
    @OneToOne(fetch= FetchType.EAGER)
    private Role role;
    @OneToMany(fetch= FetchType.EAGER)
    @JoinColumn(name="owner")
    private List<Device> devices;

 @Override
 public Collection<? extends GrantedAuthority> getAuthorities() {

   GrantedAuthority grantedAuthority= new GrantedAuthority() {
    @Override
    public String getAuthority() {
     return role.getType().toString();
    }
   };
  Collection<GrantedAuthority> collection=new ArrayList<GrantedAuthority>();
  collection.add(grantedAuthority);

  return collection;
 }

 @Override
 public String getPassword() {
  return role.getPassword();
 }

 @Override
 public String getUsername() {
  return role.getUsername();
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
