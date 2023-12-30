package io.github.llh4github.smmtmplate.utilities

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.text.SimpleDateFormat
import java.time.LocalDateTime

/**
 *
 * Created At 2023/12/30 10:11
 * @author llh
 */
class DateTimeUtilTest {

    @Test
    fun toLocalDateTimeTest() {
        val dateString = "2023-12-31 10:30:00"
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val date = sdf.parse(dateString)
        val rs = LocalDateTime.parse(dateString, DateTimeUtil.YYYY_MM_DD_HH_MM_SS)
        assertEquals(DateTimeUtil.toLocalDateTime(date), rs)
    }
}