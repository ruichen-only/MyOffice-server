package com.rea.myoffice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CRR
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
  private Long code;
  private String message;
  private Object data;

  /**
   * 成功返回结果 静态方法使用static
   *
   * @param message 消息内容
   * @return
   */
  public static RespBean success(String message) {
    return new RespBean(200L, message, null);
  }

  /**
   * 成功返回结果 静态方法使用static
   *
   * @param message 消息内容
   * @param obj
   * @return
   */
  public static RespBean success(String message, Object obj) {
    return new RespBean(200L, message, obj);
  }

  /**
   * 失败返回
   *
   * @param message 消息内容
   * @return
   */
  public static RespBean error(String message) {
    return new RespBean(500L, message, null);
  }

  /**
   * 失败返回
   *
   * @param message 消息内容
   * @param obj
   * @return
   */
  public static RespBean error(String message, Object obj) {
    return new RespBean(500L, message, obj);
  }
}
