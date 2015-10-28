
/**
 * @class  User
 * @author Pulkit
 * @since  26th October 15
 * This class defines the model class for the user.
 */

package com.meta.vehicledekho.model;

import lombok.Data;
import com.meta.vehicledekho.helper.UserTypeEnum;

@Data
public class User {
	private int userId;
	private String username;
	private String password;
	private UserTypeEnum role;
}
