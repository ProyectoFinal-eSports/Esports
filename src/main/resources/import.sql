-- games
INSERT INTO games (genre, name, tags) VALUES ('MOBA', 'League of Legends', 'LoL,Riot Games');
INSERT INTO games (genre, name, tags) VALUES ('Sports', 'Fifa 2021',  'esports, football');
INSERT INTO games (genre, name, tags) VALUES ('FPS', 'Call of Duty', 'War, FPS');

-- teams
INSERT INTO teams (name, tags) VALUES ('Fnatic', 'team, esports');

-- players
INSERT INTO players (name, role, tags, team_id) VALUES ('Bwipo', 'Top', 'esports', 1);
INSERT INTO players (name, role, tags, team_id) VALUES ('Upset', 'Bot', 'esports', 1);

-- users
INSERT INTO users (loginname, password, admin) VALUES ('pepe','pass1', false);
INSERT INTO users (loginname, password, admin) VALUES ('admin','admin', true);
