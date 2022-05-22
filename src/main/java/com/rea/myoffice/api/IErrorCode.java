package com.rea.myoffice.api;

/** 封装API的错误码 */
public interface IErrorCode {
  long getCode();

  String getMessage();
}
