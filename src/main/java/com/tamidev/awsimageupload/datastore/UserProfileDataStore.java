package com.tamidev.awsimageupload.datastore;

import com.tamidev.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "tamigill", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "chrisgill", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "olangill", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "cassiegill", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "parkergill", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }

}
