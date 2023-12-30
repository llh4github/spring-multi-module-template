package io.github.llh4github.smmtmplate.commons

/**
 *
 * Created At 2023/12/30 20:49
 * @author llh
 */
class AppException(
    val cod: String,
    val msg: String,
    cause: Throwable? = null
) : RuntimeException(msg, cause) {
    fun errorMsg(): ErrorMsg {
        return ErrorMsg(cod, msg)
    }

}
