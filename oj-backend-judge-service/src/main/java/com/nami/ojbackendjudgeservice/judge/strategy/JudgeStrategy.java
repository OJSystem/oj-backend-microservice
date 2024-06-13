package com.nami.ojbackendjudgeservice.judge.strategy;


import com.nami.ojbackendmodel.model.codesandbox.JudgeInfo;

/**
 * 判题策略
 * @author Nami
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}