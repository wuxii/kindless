package com.harmony.kindless.user.service;

import com.harmony.kindless.apis.domain.user.User;
import com.harmony.kindless.security.IdentityUserDetailsService;
import com.harmony.umbrella.data.service.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author wuxii
 */
public interface UserService extends Service<User, Long>, UserDetailsService, IdentityUserDetailsService {

}
