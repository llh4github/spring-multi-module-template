package io.github.llh4github.smmtmplate.commons

import io.github.oshai.kotlinlogging.KotlinLogging
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

/**
 *
 * Created At 2023/12/29 22:57
 * @author llh
 */
object DateTimeUtil {
    private val logger = KotlinLogging.logger {}
    const val YYYY_MM_DD_HH_MM_SS_STR = "yyyy-MM-dd HH:mm:ss"
    val YYYY_MM_DD_HH_MM_SS: DateTimeFormatter = DateTimeFormatter.ofPattern(YYYY_MM_DD_HH_MM_SS_STR)

    /**
     * 转换到LocalDateTime
     */
    fun toLocalDateTime(
        date: Date,
        zoneId: ZoneId = ZoneId.systemDefault()
    ): LocalDateTime {
        return date.toInstant().atZone(zoneId).toLocalDateTime()
    }
}

fun toLocalDateTime(
    date: Date,
    zoneId: ZoneId = ZoneId.systemDefault()
): LocalDateTime {
    return DateTimeUtil.toLocalDateTime(date, zoneId)
}
