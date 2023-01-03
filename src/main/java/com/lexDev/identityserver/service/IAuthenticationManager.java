package com.lexDev.identityserver.service;

import com.lexDev.identityserver.dto.UniversalResponse;

import java.util.Map;

public abstract class IAuthenticationManager {
    public abstract UniversalResponse authenticateUser();
    public abstract Map<String,Object> onSuccessFullAuthentication();
    public abstract Map<String,Object> onFailedAuthentication();
}
