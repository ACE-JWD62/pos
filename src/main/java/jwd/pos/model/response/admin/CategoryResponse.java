package jwd.pos.model.response.admin;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResponse {
    private long id;
    private String categoryName;
}
