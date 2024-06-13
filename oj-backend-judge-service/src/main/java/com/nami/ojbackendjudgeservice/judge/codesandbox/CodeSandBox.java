package com.nami.ojbackendjudgeservice.judge.codesandbox;

import com.nami.ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.nami.ojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * @author Nami
 * 代码沙箱接口定义
 */
public interface CodeSandBox {

    /**
     * 代码沙箱执行代码接口
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
