package com.PartsPicker.PartsPicker.domain;

import java.nio.file.attribute.UserPrincipal;

public class PCUserPrincipal implements UserPrincipal {

    private PCUser PCUser;

    public PCUserPrincipal(PCUser PCUser){
        this.PCUser = PCUser;
    }

    @Override
    public String getName() {
        return PCUser.getEmail();
    }
}
