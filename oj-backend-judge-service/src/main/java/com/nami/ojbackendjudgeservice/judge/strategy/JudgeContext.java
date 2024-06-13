package com.nami.ojbackendjudgeservice.judge.strategy;

import com.nami.ojbackendmodel.model.codesandbox.JudgeInfo;
import com.nami.ojbackendmodel.model.dto.question.JudgeCase;
import com.nami.ojbackendmodel.model.entity.Question;
import com.nami.ojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 * @author Nami
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
