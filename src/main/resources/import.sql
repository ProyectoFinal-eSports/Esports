-- games
INSERT INTO games (genre, name, tags, img_url) VALUES ('MOBA', 'League of Legends', 'LoL, Riot Games', '../img/game.png');
INSERT INTO games (genre, name, tags, img_url) VALUES ('Sports', 'Fifa 2021', 'Football, FIFA', '../img/game.png');
INSERT INTO games (genre, name, tags, img_url) VALUES ('FPS', 'Call of Duty', 'War, Activision', '../img/game.png');

-- teams
INSERT INTO teams (name, tags) VALUES ('Fnatic', 'Fnatic LoL, LEC');

-- players
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Adam Maanane', 'Adam', 'Top Laner', 'Jugador LoL,', 1);
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Gabriel Rau', 'Bwipo', 'Jungler', 'Jugador LoL', 1);
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Yasin Dinçer', 'Nisqy', 'Mid Laner', 'Jugador LoL', 1);
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Elias Lipp', 'Upset', 'Bot Laner', 'Jugador LoL', 1);
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Zdravets Galabov','Hylissang', 'Support', 'Jugador LoL', 1);

-- users
INSERT INTO users (loginname, password, admin) VALUES ('pepe','pass1', false);
INSERT INTO users (loginname, password, admin) VALUES ('admin','admin', true);
