package io.github.llh4github.smmtemplate.api.api

import io.github.llh4github.smmtmplate.commons.ErrorConvention
import io.github.llh4github.smmtmplate.commons.JsonWrapper
import io.github.llh4github.smmtmplate.commons.NoErrorEnums

/**
 * 接口类的基类，包含一些通用方法
 *
 * Created At 2023/12/30 21:20
 * @author llh
 */
abstract class BaseApi {
    fun <T> ok(
        data: T? = null,
        ok: ErrorConvention = NoErrorEnums.OK,
    ): JsonWrapper<T> {
        return JsonWrapper.response(ok, data)
    }

    fun <T> error(
        error: ErrorConvention,
        data: T? = null
    ): JsonWrapper<T> {
        return JsonWrapper.response(error, data)
    }
}