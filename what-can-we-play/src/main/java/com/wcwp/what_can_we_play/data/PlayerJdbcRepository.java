package com.wcwp.what_can_we_play.data;

import org.springframework.jdbc.core.JdbcTemplate;

import com.wcwp.what_can_we_play.data.mappers.PlayerMapper;
import com.wcwp.what_can_we_play.models.Player;

public class PlayerJdbcRepository implements PlayerRepository{

    private JdbcTemplate jdbcTemplate;
    
    @Override
    public Player findById(String id){
        final String sql = "select id, name, icon_link from Player where id = ?;";
        Player player = jdbcTemplate.query(sql, new PlayerMapper(), id).stream().findFirst().orElse(null);
        //TODO: Add the fill for games list and friends list
        return player;
    }

    @Override
    public boolean create(Player user){
        //TODO: add create logic
        return true;
    }
    
}
