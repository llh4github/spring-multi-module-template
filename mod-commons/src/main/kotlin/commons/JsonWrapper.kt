package io.github.llh4github.smmtemplate.commons

import io.swagger.v3.oas.annotations.media.Schema

@Schema(title = "通用响应结构（JSON）")
data class JsonWrapper<T>(
    @Schema(title = "响应码")
    val code: String = "200",
    @Schema(title = "响应消息")
    val msg: String = "OK",
    @Schema(title = "响应数据")
    val data: T? = null,
) {
    @Schema(title = "是否成功")
    fun getSuccess(): Boolean {
        return code == "200"
    }

    @Schema(title = "响应时间戳")
    fun getTimestamp(): Long {
        return System.currentTimeMillis()
    }

    companion object {
        @JvmStatic
        fun <T> ok(data: T? = null): JsonWrapper<T> {
            return JsonWrapper(data = data)
        }

        @JvmStatic
        fun <T> fail(code: String = "9999", msg: String = "未知错误", data: T? = null): JsonWrapper<T> {
            return JsonWrapper(code = code, msg = msg, data = data)
        }
    }
}

