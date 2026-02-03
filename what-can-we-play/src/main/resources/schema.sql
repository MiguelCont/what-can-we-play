-- Table: Game
CREATE TABLE IF NOT EXISTS Game (
    id INTEGER PRIMARY KEY,        -- Primary key, large numbers
    name TEXT NOT NULL,            -- Game name
    icon_link TEXT                 -- URL or path to the game icon
);

-- Table: Player
CREATE TABLE IF NOT EXISTS Player (
    id INTEGER PRIMARY KEY,        -- Primary key, large numbers
    name TEXT NOT NULL,            -- Player name
    avatar_link TEXT               -- URL or path to player's avatar
);

-- Table: PlayerGame (join table with extra info)
CREATE TABLE IF NOT EXISTS PlayerGame (
    id INTEGER PRIMARY KEY,           -- Unique identifier
    player_id INTEGER NOT NULL,       -- Foreign key to Player
    game_id INTEGER NOT NULL,         -- Foreign key to Game
    playtime REAL DEFAULT 0,          -- Playtime in hours
    last_played DATE,                 -- Last played date
    FOREIGN KEY (player_id) REFERENCES Player(id) ON DELETE CASCADE,
    FOREIGN KEY (game_id) REFERENCES Game(id) ON DELETE CASCADE,
    UNIQUE(player_id, game_id)        -- Ensure no duplicate entries per player/game
);

-- Table: PlayerFriends (many-to-many self-reference)
CREATE TABLE IF NOT EXISTS PlayerFriends (
    player_id INTEGER NOT NULL,
    friend_id INTEGER NOT NULL,
    PRIMARY KEY (player_id, friend_id),
    FOREIGN KEY (player_id) REFERENCES Player(id) ON DELETE CASCADE,
    FOREIGN KEY (friend_id) REFERENCES Player(id) ON DELETE CASCADE
);