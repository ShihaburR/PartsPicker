package com.PartsPicker.PartsPicker.services;

import com.PartsPicker.PartsPicker.domain.CollatedUser;


public interface ProfileService {

    CollatedUser getProfile(String email);

}
