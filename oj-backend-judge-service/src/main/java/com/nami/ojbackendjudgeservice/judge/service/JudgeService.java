package com.nami.ojbackendjudgeservice.judge.service;


import com.nami.ojbackendmodel.model.entity.QuestionSubmit;

/**
 * 判题服务 ：执行代码
 *
 * @author Nami
 */
public interface JudgeService {
    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
