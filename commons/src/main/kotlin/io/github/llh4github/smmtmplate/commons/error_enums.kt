package io.github.llh4github.smmtmplate.commons

enum class AppErrorEnums(
    override val code: String,
    override val msg: String
) : ErrorConvention {
    Error("UNKNOWN", "未知错误"),
    AUTH_ERROR("401001", "未登录"),
    NO_PERMISSION_ERROR("401002", "无权限"),
    DATA_NO_FOUND("501001", "数据不存在"),
    DATA_EXISTED_FOUND("501002", "数据已存在"),
    LIB_ERROR("701001", "工具库错误"),
    THIRD_PARTY_ERROR("801001", "第三方服务出错"),

}

enum class NoErrorEnums(
    override val code: String,
    override val msg: String
) : ErrorConvention {
    OK("200", "ok"),
    UPDATED("200", "更新成功"),
    CREATED("200", "创建成功"),
    DELETED("200", "删除成功"),
    OPERATED("200", "操作成功"),
}

data class ErrorMsg(override val code: String, override val msg: String) : ErrorConvention

