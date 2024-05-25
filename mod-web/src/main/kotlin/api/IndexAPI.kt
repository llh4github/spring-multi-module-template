package io.github.llh4github.smmtemplate.api

import io.github.llh4github.smmtemplate.commons.JsonWrapper
import io.github.oshai.kotlinlogging.KotlinLogging
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@Tag(name = "测试接口")
@RestController
class IndexAPI {
    private val logger = KotlinLogging.logger {}

    @Operation(summary = "获取当前时间")
    @GetMapping("now")
    fun now(): JsonWrapper<LocalDateTime> {
        logger.debug { "调用测试" }
        return JsonWrapper.ok(LocalDateTime.now())
    }

}