package com.nami.ojbackendjudgeservice.judge;

import com.nami.ojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.nami.ojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.nami.ojbackendjudgeservice.judge.strategy.JudgeContext;
import com.nami.ojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.nami.ojbackendmodel.model.codesandbox.JudgeInfo;
import com.nami.ojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 *
 * @author Nami
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    public JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getSubmitLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}