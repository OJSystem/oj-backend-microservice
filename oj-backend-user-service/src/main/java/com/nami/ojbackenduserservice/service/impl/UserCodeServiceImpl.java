package com.nami.ojbackenduserservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nami.ojbackendcommon.common.ErrorCode;
import com.nami.ojbackendcommon.exception.BusinessException;
import com.nami.ojbackendcommon.exception.ThrowUtils;
import com.nami.ojbackendmodel.model.entity.UserCode;
import com.nami.ojbackenduserservice.mapper.UserCodeMapper;
import com.nami.ojbackenduserservice.service.UserCodeService;
import org.springframework.stereotype.Service;

/**
 * @author Nami
 * @description 针对表【user_code(用户)】的数据库操作Service实现
 */
@Service
public class UserCodeServiceImpl extends ServiceImpl<UserCodeMapper, UserCode>
        implements UserCodeService {

    @Override
    public UserCode getUserCodeByUserId(long userId) {
        if (userId < 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<UserCode> wrapper = new QueryWrapper<>();
        wrapper.eq("userId", userId);
        UserCode userCode = this.getOne(wrapper);
        ThrowUtils.throwIf(userCode == null, ErrorCode.NULL_ERROR, "此用户不存在");
        return userCode;
    }
}




