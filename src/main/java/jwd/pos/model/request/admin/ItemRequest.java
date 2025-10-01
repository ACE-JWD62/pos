package jwd.pos.model.request.admin;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequest {

    @NotBlank(message = "Item name cannot be null")
    @Size(min = 2, max = 100, message = "Item name must be between 2 and 100 characters")
    private String itemName;

    @NotNull(message = "Item price cannot be minus")
    @Min(value = 0, message = "Item price must be greater than or equal to 0")
    private Double itemPrice;

    @NotNull(message = "Item category cannot be null")
    private Integer categoryId;

    @Size(max = 500, message = "Item description cannot be more than 500 characters")
    private String itemDescription;

    private String isAttachFile;
}

