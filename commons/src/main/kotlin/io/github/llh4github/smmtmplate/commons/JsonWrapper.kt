package io.github.llh4github.smmtmplate.commons

import io.swagger.v3.oas.annotations.media.Schema

/**
 *
 * Created At 2023/12/30 20:51
 * @author llh
 */
@Schema(title = "通用响应结构（JSON）")
data class JsonWrapper<T>(
    @Schema(title = "响应码")
    val code: String,
    @Schema(title = "响应消息")
    val msg: String,
    @Schema(title = "响应数据")
    val data: T? = null,
) {
    companion object {
        @JvmStatic
        fun <T> response(error: ErrorConvention, data: T? = null): JsonWrapper<T> {
            return JsonWrapper(error.code, error.msg, data)
        }
    }

}
