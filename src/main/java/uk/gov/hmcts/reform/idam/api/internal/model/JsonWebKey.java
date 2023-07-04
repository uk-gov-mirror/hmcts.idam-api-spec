package uk.gov.hmcts.reform.idam.api.internal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * JsonWebKey
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-07-04T00:25:50.979+01:00")

public class JsonWebKey   {
  @JsonProperty("alg")
  private String alg = null;

  @JsonProperty("kty")
  private String kty = null;

  @JsonProperty("use")
  private String use = null;

  @JsonProperty("kid")
  private String kid = null;

  @JsonProperty("n")
  private String n = null;

  @JsonProperty("e")
  private String e = null;

  @JsonProperty("x5c")
  @Valid
  private List<String> x5c = null;

  @JsonProperty("x5t")
  private String x5t = null;

  @JsonProperty("crv")
  private String crv = null;

  @JsonProperty("d")
  private String d = null;

  @JsonProperty("dp")
  private String dp = null;

  @JsonProperty("dq")
  private String dq = null;

  @JsonProperty("k")
  private String k = null;

  @JsonProperty("p")
  private String p = null;

  @JsonProperty("q")
  private String q = null;

  @JsonProperty("qi")
  private String qi = null;

  @JsonProperty("x")
  private String x = null;

  @JsonProperty("y")
  private String y = null;

  public JsonWebKey alg(String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * Algorithm intended for use with the key
   * @return alg
  **/
  @ApiModelProperty(value = "Algorithm intended for use with the key")


  public String getAlg() {
    return alg;
  }

  public void setAlg(String alg) {
    this.alg = alg;
  }

  public JsonWebKey kty(String kty) {
    this.kty = kty;
    return this;
  }

  /**
   * The cryptographic algorithm family used with the key, such as \"RSA\" or \"EC\"
   * @return kty
  **/
  @ApiModelProperty(value = "The cryptographic algorithm family used with the key, such as \"RSA\" or \"EC\"")


  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public JsonWebKey use(String use) {
    this.use = use;
    return this;
  }

  /**
   * The intended use of the public key, such as \"sig\" (signature), \"enc\" (encryption)
   * @return use
  **/
  @ApiModelProperty(value = "The intended use of the public key, such as \"sig\" (signature), \"enc\" (encryption)")


  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public JsonWebKey kid(String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * Unique identifier for the key. It is used to match a specific key.
   * @return kid
  **/
  @ApiModelProperty(value = "Unique identifier for the key. It is used to match a specific key.")


  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public JsonWebKey n(String n) {
    this.n = n;
    return this;
  }

  /**
   * The modulus for a standard pem
   * @return n
  **/
  @ApiModelProperty(value = "The modulus for a standard pem")


  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public JsonWebKey e(String e) {
    this.e = e;
    return this;
  }

  /**
   * The exponent for a standard pem
   * @return e
  **/
  @ApiModelProperty(value = "The exponent for a standard pem")


  public String getE() {
    return e;
  }

  public void setE(String e) {
    this.e = e;
  }

  public JsonWebKey x5c(List<String> x5c) {
    this.x5c = x5c;
    return this;
  }

  public JsonWebKey addX5cItem(String x5cItem) {
    if (this.x5c == null) {
      this.x5c = new ArrayList<>();
    }
    this.x5c.add(x5cItem);
    return this;
  }

  /**
   * The x.509 certificate chain
   * @return x5c
  **/
  @ApiModelProperty(value = "The x.509 certificate chain")


  public List<String> getX5c() {
    return x5c;
  }

  public void setX5c(List<String> x5c) {
    this.x5c = x5c;
  }

  public JsonWebKey x5t(String x5t) {
    this.x5t = x5t;
    return this;
  }

  /**
   * The thumbprint of the x.509 cert (SHA-1 thumbprint)
   * @return x5t
  **/
  @ApiModelProperty(value = "The thumbprint of the x.509 cert (SHA-1 thumbprint)")


  public String getX5t() {
    return x5t;
  }

  public void setX5t(String x5t) {
    this.x5t = x5t;
  }

  public JsonWebKey crv(String crv) {
    this.crv = crv;
    return this;
  }

  /**
   * The cryptographic curve used with the key (one of P-256, P-384, P-521)
   * @return crv
  **/
  @ApiModelProperty(value = "The cryptographic curve used with the key (one of P-256, P-384, P-521)")


  public String getCrv() {
    return crv;
  }

  public void setCrv(String crv) {
    this.crv = crv;
  }

  public JsonWebKey d(String d) {
    this.d = d;
    return this;
  }

  /**
   * The Elliptic Curve private key value or the private exponent value for the RSA private key
   * @return d
  **/
  @ApiModelProperty(value = "The Elliptic Curve private key value or the private exponent value for the RSA private key")


  public String getD() {
    return d;
  }

  public void setD(String d) {
    this.d = d;
  }

  public JsonWebKey dp(String dp) {
    this.dp = dp;
    return this;
  }

  /**
   * For an RSA private key, contains the Chinese Remainder Theorem (CRT) exponent of the first factor
   * @return dp
  **/
  @ApiModelProperty(value = "For an RSA private key, contains the Chinese Remainder Theorem (CRT) exponent of the first factor")


  public String getDp() {
    return dp;
  }

  public void setDp(String dp) {
    this.dp = dp;
  }

  public JsonWebKey dq(String dq) {
    this.dq = dq;
    return this;
  }

  /**
   * For an RSA private key, contains the CRT exponent of the second factor
   * @return dq
  **/
  @ApiModelProperty(value = "For an RSA private key, contains the CRT exponent of the second factor")


  public String getDq() {
    return dq;
  }

  public void setDq(String dq) {
    this.dq = dq;
  }

  public JsonWebKey k(String k) {
    this.k = k;
    return this;
  }

  /**
   * Contains the value of the symmetric (or other single-valued) key
   * @return k
  **/
  @ApiModelProperty(value = "Contains the value of the symmetric (or other single-valued) key")


  public String getK() {
    return k;
  }

  public void setK(String k) {
    this.k = k;
  }

  public JsonWebKey p(String p) {
    this.p = p;
    return this;
  }

  /**
   * For an RSA private key, contains the first prime factor.
   * @return p
  **/
  @ApiModelProperty(value = "For an RSA private key, contains the first prime factor.")


  public String getP() {
    return p;
  }

  public void setP(String p) {
    this.p = p;
  }

  public JsonWebKey q(String q) {
    this.q = q;
    return this;
  }

  /**
   * For an RSA private key, contains the second prime factor.
   * @return q
  **/
  @ApiModelProperty(value = "For an RSA private key, contains the second prime factor.")


  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public JsonWebKey qi(String qi) {
    this.qi = qi;
    return this;
  }

  /**
   * For an RSA private key, contains the CRT coefficient of the second factor
   * @return qi
  **/
  @ApiModelProperty(value = "For an RSA private key, contains the CRT coefficient of the second factor")


  public String getQi() {
    return qi;
  }

  public void setQi(String qi) {
    this.qi = qi;
  }

  public JsonWebKey x(String x) {
    this.x = x;
    return this;
  }

  /**
   * The x coordinate for the Elliptic Curve point
   * @return x
  **/
  @ApiModelProperty(value = "The x coordinate for the Elliptic Curve point")


  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public JsonWebKey y(String y) {
    this.y = y;
    return this;
  }

  /**
   * The y coordinate for the Elliptic Curve point
   * @return y
  **/
  @ApiModelProperty(value = "The y coordinate for the Elliptic Curve point")


  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonWebKey jsonWebKey = (JsonWebKey) o;
    return Objects.equals(this.alg, jsonWebKey.alg) &&
        Objects.equals(this.kty, jsonWebKey.kty) &&
        Objects.equals(this.use, jsonWebKey.use) &&
        Objects.equals(this.kid, jsonWebKey.kid) &&
        Objects.equals(this.n, jsonWebKey.n) &&
        Objects.equals(this.e, jsonWebKey.e) &&
        Objects.equals(this.x5c, jsonWebKey.x5c) &&
        Objects.equals(this.x5t, jsonWebKey.x5t) &&
        Objects.equals(this.crv, jsonWebKey.crv) &&
        Objects.equals(this.d, jsonWebKey.d) &&
        Objects.equals(this.dp, jsonWebKey.dp) &&
        Objects.equals(this.dq, jsonWebKey.dq) &&
        Objects.equals(this.k, jsonWebKey.k) &&
        Objects.equals(this.p, jsonWebKey.p) &&
        Objects.equals(this.q, jsonWebKey.q) &&
        Objects.equals(this.qi, jsonWebKey.qi) &&
        Objects.equals(this.x, jsonWebKey.x) &&
        Objects.equals(this.y, jsonWebKey.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, kty, use, kid, n, e, x5c, x5t, crv, d, dp, dq, k, p, q, qi, x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonWebKey {\n");
    
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    x5t: ").append(toIndentedString(x5t)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    dp: ").append(toIndentedString(dp)).append("\n");
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    qi: ").append(toIndentedString(qi)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

