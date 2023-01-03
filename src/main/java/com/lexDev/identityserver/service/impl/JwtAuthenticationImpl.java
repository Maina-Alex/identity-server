package com.lexDev.identityserver.service.impl;

import com.lexDev.identityserver.dto.UniversalResponse;
import com.lexDev.identityserver.service.IAuthenticationManager;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class JwtAuthenticationImpl extends IAuthenticationManager {
    @Override
    public UniversalResponse authenticateUser() {
        return null;
    }

    @Override
    public Map<String, Object> onSuccessFullAuthentication() {
        return null;
    }

    @Override
    public Map<String, Object> onFailedAuthentication() {
        return null;
    }
}
