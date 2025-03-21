package org.example.expert.domain.manager.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ManagerSaveRequest {

    @NotNull
    private Long managerUserId;
}
