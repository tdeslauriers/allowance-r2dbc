package world.deslauriers.service.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record RemoveTasktypeAllowanceCmd(
        Long tasktypeId,
        Long allowanceId
) {
}
