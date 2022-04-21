package com.chapo.data.mapper

import com.chapo.data.model.UserDto
import com.chapo.dom.model.User

fun UserDto.toDomain() = User(this.name)