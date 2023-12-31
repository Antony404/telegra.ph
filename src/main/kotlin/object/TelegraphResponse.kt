package `object`

import com.fasterxml.jackson.annotation.JsonProperty

data class TelegraphResponse<T>(
    @field:JsonProperty("ok")
    val ok: Boolean,
    @field:JsonProperty("error")
    val error: String?,
    @field:JsonProperty("result")
    val result: T?,
)
