package com.fun.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.fun.core.generic.GenericServiceImpl;
import com.fun.web.service.PermissionService;
import org.springframework.stereotype.Service;
import com.fun.core.generic.GenericDao;
import com.fun.web.dao.PermissionMapper;
import com.fun.web.model.Permission;

/**
 * 权限Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午12:05:03
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
