package com.homegrown.heresylibrary.resource

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.hateoas.ResourceSupport

open class AuthorResource @JsonCreator constructor(
        @JsonProperty("firstname") val title: String,
        @JsonProperty("lastname") val subTitle: String,
        val id: Long) : ResourceSupport()