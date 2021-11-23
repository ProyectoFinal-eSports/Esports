-- games
INSERT INTO games (genre, name, gameplay, img_url) VALUES ('MOBA', 'League of Legends', 'Juego de estrategia por equipos en el que dos equipos de cinco jugadores se enfrentan para ver quién destruye antes la base del otro.', '../img/game.png');
INSERT INTO games (genre, name, gameplay, img_url) VALUES ('Sports', 'FIFA 2021', 'Football, FIFA', '../img/game.png');
INSERT INTO games (genre, name, gameplay, img_url) VALUES ('FPS', 'Call of Duty', 'War, Activision', '../img/game.png');

-- posts
INSERT INTO posts (title, date, short_text, tags, author, img_url) VALUES ('Riot Games announce they’ve reached 180 million active users across all Runeterra titles', '2021-11-10', 'Riot Games has announced their active player base across all titles, which has hit an all-time high for the company.', 'League of Legends, League of Runeterra', 'esports.com', '../img/game.png');
INSERT INTO posts (title, date, short_text, tags, author, img_url) VALUES ('Next year’s Call of Duty to be sequel to 2019 Modern Warfare', '2020-10-08', 'Though Call of Duty Vanguard has yet to release, there are some big plans for the next installment in the franchise.', 'Call of Duty', 'Activision Blizzard', '../img/game.png');

-- teams
INSERT INTO teams (name, tags) VALUES ('Fnatic', 'Fnatic LoL, LEC');

-- players
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Adam Maanane', 'Adam', 'Top Laner', 'Jugador LoL,', 1);
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Gabriel Rau', 'Bwipo', 'Jungler', 'Jugador LoL', 1);
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Yasin Dinçer', 'Nisqy', 'Mid Laner', 'Jugador LoL', 1);
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Elias Lipp', 'Upset', 'Bot Laner', 'Jugador LoL', 1);
INSERT INTO players (player_name, name, role, tags, team_id) VALUES ('Zdravets Galabov','Hylissang', 'Support', 'Jugador LoL', 1);

-- tournaments
INSERT INTO tournaments (name, region, img_url, game_id) VALUES ('League of Legends European Championship', 'Europa', '../img/game.png', 1);
INSERT INTO tournaments (name, region, img_url, game_id) VALUES ('League Championship Series', 'Norteamérica', '../img/game.png', 1);

-- users
INSERT INTO users (loginname, password, admin) VALUES ('pepe','pass1', false);
INSERT INTO users (loginname, password, admin) VALUES ('admin','admin', true);
