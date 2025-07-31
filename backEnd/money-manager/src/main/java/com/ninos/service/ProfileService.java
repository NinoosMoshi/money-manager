package com.ninos.service;

import com.ninos.dto.AuthDTO;
import com.ninos.dto.ProfileDTO;
import com.ninos.entity.ProfileEntity;

import java.util.Map;

public interface ProfileService {

    ProfileDTO registerProfile(ProfileDTO profileDTO);
    boolean activateProfile(String activationToken);
    boolean isAccountActive(String email);
    ProfileEntity getCurrentProfile();
    ProfileDTO getPublicProfile(String email);

    Map<String, Object> authenticateAndGenerateToken(AuthDTO authDTO);
}
