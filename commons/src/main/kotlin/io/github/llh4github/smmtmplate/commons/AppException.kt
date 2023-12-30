package io.github.llh4github.smmtmplate.commons

/**
 *
 * Created At 2023/12/30 20:49
 * @author llh
 */
class AppException(
    val error: ErrorConvention, cause: Throwable? = null
) : RuntimeException(error.msg, cause)
