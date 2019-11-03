package com.cofridge.cofridgeserver.security

object SecurityConstants {
    public val AUTH_LOGIN_URL : String = "/api/authenticate"

    public val JWT_SECRET : String = "n2r5u8x/A%D*G-KaPdSgVkYp3s6v9y4B&E(H+MbQeThWmZq4t7w!z%C*F-J@NcRf"

    // JWT token defaults
    public val TOKEN_HEADER : String = "Authorization"
    public val TOKEN_PREFIX : String = "Bearer "
    public val TOKEN_TYPE : String = "JWT"
    public val TOKEN_ISSUER = "secure-cofridge-api"
    public val TOKEN_AUDIENCE = "secure-cofridge-app"
}