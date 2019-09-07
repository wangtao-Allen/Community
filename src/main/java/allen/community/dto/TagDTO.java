package allen.community.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by Allen on 2019/09/07
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
