package com.rea.myoffice.bean;

import com.rea.myoffice.model.Userinfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author CRR
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserBean extends Userinfo {
  private String roleName;
  private String deptName;
  private String branchId;
  private String branchName;
}
