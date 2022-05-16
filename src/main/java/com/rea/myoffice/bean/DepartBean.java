package com.rea.myoffice.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rea.myoffice.model.Departinfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author CRR
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DepartBean extends Departinfo {
  private String branchName;

  private String username;

  @JsonProperty("userId")
  private String userId;
}
