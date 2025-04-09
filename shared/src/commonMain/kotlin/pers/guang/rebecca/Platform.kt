package pers.guang.rebecca

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform