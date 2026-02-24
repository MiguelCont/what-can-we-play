package com.wcwp.what_can_we_play.data.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jspecify.annotations.NonNull;
import org.springframework.jdbc.core.RowMapper;

import com.wcwp.what_can_we_play.models.Player;

public class PlayerMapper implements RowMapper<Player> {

    @Override
    public Player mapRow(@SuppressWarnings("null") @NonNull ResultSet resultSet, int i) throws SQLException{
        Player user = new Player();
        
        
        return user;
    }
}
