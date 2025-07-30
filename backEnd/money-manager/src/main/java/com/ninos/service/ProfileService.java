package com.ninos.service;

import com.ninos.dto.ProfileDTO;

public interface ProfileService {

    ProfileDTO registerProfile(ProfileDTO profileDTO);
    boolean activateProfile(String activationToken);

}
