package com.softwaremobi.gerenciamentodevoos.Models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "portoes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PortaoModel {
    @Id
    private String id;
    @NotBlank
    private String codigo;
    @NotNull
    private boolean disponivel;
}
