package com.wcwp.what_can_we_play.data;

import com.wcwp.what_can_we_play.models.Player;

public interface PlayerRepository {

    /**
     * Returns a user based on the given Steam ID
     * @param id Steam ID
     * @return User associated with ID
     */
    public Player findById(String id);
    /**
     * Adds user to the user database for quick retrieval purposes
     * @param user user to be added on database
     * @return True if user added to database
     */
    public boolean create(Player user);

} 
