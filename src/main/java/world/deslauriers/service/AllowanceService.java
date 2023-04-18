package world.deslauriers.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import world.deslauriers.domain.Allowance;
import world.deslauriers.service.dto.MetricsDto;

public interface AllowanceService {
    Flux<Allowance> findAll();

    Mono<Allowance> save(Allowance cmd);

    Mono<Allowance> findTasktypesByAllowanceId(Long id);

    Mono<Allowance> findById(Long allowanceId);

    Mono<Allowance> getByUuid(String uuid);

    Flux<Allowance> conductRemittance();

    Mono<MetricsDto> getAllowanceMetrics(String uuid);

}
