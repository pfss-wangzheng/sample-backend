package com.pfss.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pfss.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserResponse
 */
@Validated
@NotUndefined



public class UserResponse   {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String status = null;

  @JsonProperty("message")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String message = null;

  @JsonProperty("user")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private User user = null;


  public UserResponse status(String status) { 

    this.status = status;
    return this;
  }

  /**
   * The status of the user creation request
   * @return status
   **/
  
  @Schema(example = "success", description = "The status of the user creation request")
  
  public String getStatus() {  
    return status;
  }



  public void setStatus(String status) { 
    this.status = status;
  }

  public UserResponse message(String message) { 

    this.message = message;
    return this;
  }

  /**
   * create status message
   * @return message
   **/
  
  @Schema(example = "User created successfully", description = "create status message")
  
  public String getMessage() {  
    return message;
  }



  public void setMessage(String message) { 
    this.message = message;
  }

  public UserResponse user(User user) { 

    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  
  @Schema(description = "")
  
@Valid
  public User getUser() {  
    return user;
  }



  public void setUser(User user) { 
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.status, userResponse.status) &&
        Objects.equals(this.message, userResponse.message) &&
        Objects.equals(this.user, userResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
