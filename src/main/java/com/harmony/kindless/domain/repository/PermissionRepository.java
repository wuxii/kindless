package com.harmony.kindless.domain.repository;

import org.springframework.stereotype.Repository;

import com.harmony.kindless.domain.domain.Permission;
import com.harmony.umbrella.data.repository.QueryableRepository;

/**
 * @author wuxii@foxmail.com
 */
@Repository
public interface PermissionRepository extends QueryableRepository<Permission, String> {

}
