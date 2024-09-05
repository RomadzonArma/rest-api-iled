package com.enigma.Instructor_Led.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBatchRequest {
    @NotBlank(message = "Batch name is required")
    private String batchName;
}