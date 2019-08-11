package allen.community.controller;

import allen.community.dto.QuestionDTO;
import allen.community.mapper.QuestionMapper;
import allen.community.service.impl.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Allen on 2019/08/11
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionServiceImpl questionService;
    @Autowired
    private QuestionMapper questionMapper;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);
        model.addAttribute("question",questionDTO);
        return "question";
    }
}
