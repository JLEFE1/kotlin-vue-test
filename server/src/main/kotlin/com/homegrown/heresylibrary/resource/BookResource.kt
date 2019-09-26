package com.homegrown.heresylibrary.resource

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.hateoas.ResourceSupport

open class BookResource @JsonCreator constructor(
        @JsonProperty("title") val title: String,
        @JsonProperty("subTitle") val subTitle: String,
        val id: Long) : ResourceSupport()