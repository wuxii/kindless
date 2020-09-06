package com.kindless.user.service.impl;

import com.kindless.core.service.ServiceSupport;
import com.kindless.domain.user.UserAccount;
import com.kindless.user.repository.UserAccountRepository;
import com.kindless.user.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

/**
 * @author wuxii
 */
@RequiredArgsConstructor
@Service
public class UserAccountServiceImpl extends ServiceSupport<UserAccount> implements UserAccountService {

    private final UserAccountRepository userAccountRepository;

    @Override
    public UserAccount bind(Long userId, String openId) {
        return null;
    }

    @Override
    protected PagingAndSortingRepository<UserAccount, Long> getRepository() {
        return userAccountRepository;
    }
}
