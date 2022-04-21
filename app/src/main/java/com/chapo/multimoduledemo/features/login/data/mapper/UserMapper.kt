package com.chapo.multimoduledemo.features.login.data.mapper

import com.chapo.multimoduledemo.features.login.data.model.UserDto
import com.chapo.multimoduledemo.features.login.domain.model.User

fun UserDto.toDomain() = User(this.name)