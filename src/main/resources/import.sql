-- games
INSERT INTO games (genre, name, tags) VALUES ('MOBA', 'League of Legends', 'LoL,Riot Games');
INSERT INTO games (genre, name, tags) VALUES ('Sports', 'Fifa 2021',  'esports, football');
INSERT INTO games (genre, name, tags) VALUES ('FPS', 'Call of Duty', 'War, FPS');

-- teams
INSERT INTO teams (name, tags, players) VALUES ('Fnatic', 'team, esports', null);

-- players
INSERT INTO players (name, role, tags) VALUES ('Bwipo', 'Top', 'esports');
INSERT INTO players (name, role, tags) VALUES ('Upset', 'Bot', 'esports');

-- users
INSERT INTO users (loginname, password, admin) VALUES ('pepe','pass1', false);
INSERT INTO users (loginname, password, admin) VALUES ('admin','admin', true);
