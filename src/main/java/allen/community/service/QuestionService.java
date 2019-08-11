package allen.community.service;

import allen.community.dto.PaginationDTO;

/**
 * Created by Allen on 2019/8/2
 */
public interface QuestionService {

    PaginationDTO list(Integer page, Integer size);
}
