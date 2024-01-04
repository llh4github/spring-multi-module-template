package io.github.llh4github.smmtmplate.commons

/**
 * 错误约定
 *
 * Created At 2023/12/30 20:49
 * @author llh
 */
interface ErrorConvention {

    /**
     * 响应码
     */
    val code: String

    /**
     * 响应说明
     */
    val msg: String
}