package com.rea.myoffice.util;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author CRR
 */
@Component
public class JwtTokenUtil {
  /** 创建秘钥 */
  private static final byte[] SECRET = "6MNSobBRCHGIO0fS6MNSobBRCHGIO0fS".getBytes();

  /** 过期时间5秒 */
  private static final long EXPIRE_TIME = 1000 * 5;

  /**
   * 生成Token
   *
   * @param account
   * @return
   */
  public static String buildjwt(String account) {
    try {
      // 创建一个32-byte的密匙
      MACSigner macSigner = new MACSigner(SECRET);
      // 建立payload 载体
      JWTClaimsSet claimsSet =
          new JWTClaimsSet.Builder()
              .subject("doi")
              .issuer("http://www.doiduoyi.com")
              .expirationTime(new Date(System.currentTimeMillis() + EXPIRE_TIME))
              .claim("ACCOUNT", account)
              .build();
      // 建立签名
      SignedJWT signedjwt = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);
      signedjwt.sign(macSigner);

      // 生成token
      return signedjwt.serialize();
    } catch (JOSEException e) {
      e.printStackTrace();
    }
    return null;
  }
}
