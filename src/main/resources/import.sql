-- games
INSERT INTO games (genre, name, gameplay, img_url) VALUES ('MOBA', 'League of Legends', 'Juego de estrategia por equipos en el que dos equipos de cinco jugadores se enfrentan para ver quién destruye antes la base del otro.', '../img/game.png');
INSERT INTO games (genre, name, gameplay, img_url) VALUES ('Sports', 'FIFA 2021', 'Football, FIFA', '../img/game.png');
INSERT INTO games (genre, name, gameplay, img_url) VALUES ('FPS', 'Call of Duty', 'War, Activision', '../img/game.png');

-- posts
INSERT INTO posts (title, date, short_text, long_text, tags, author, img_url) VALUES ('De Gea presenta Rebels Gaming, su club de esports', '2021-12-01', 'El club del futbolista español cuenta con equipos en League of Legends, VALORANT y Rainbow Six: Siege y ha desvelado, por fin, su logo.', 'David de Gea, futbolista del Manchester United y de la selección española, ha anunciado la creación de su propio club de deportes electrónicos, Rebels Gaming, con el que comenzará compitiendo en tres títulos de forma simultánea. "Queremos que Rebels Gaming sea uno de los clubs de referencia global, no solo por su nivel competitivo, sino por esa apuesta por el talento y por la capacidad de inspirar a los más jóvenes a la hora de buscar nuevas oportunidades y tener un impacto positivo en la sociedad", afirma en la nota de prensa enviada por el club. Lo cierto es que el club venía compitiendo desde hace un tiempo ya, aunque hasta el momento solo se conocía el nombre y no se conocía el escudo ni, oficialmente, la vinculación del popular guardameta con él.', 'League of Legends, League of Runeterra', 'esports.com', '../img/game.png');
INSERT INTO posts (title, date, short_text, long_text, tags, author, img_url) VALUES ('Next year’s Call of Duty to be sequel to 2019 Modern Warfare', '2020-10-08', 'Though Call of Duty Vanguard has yet to release, there are some big plans for the next installment in the franchise.', 'Call of Duty Vangaurd is set to release on November 5th. Returning to World War II, Vanguard features a drastically new campaign, multiplayer, zombies, as well as additions to Warzone. Though fans typically can expect a new Call of Duty released annually, Activision is already making plans for the next installment in the storied franchise. This next CoD will reportedly continue the Modern Warfare saga, picking up where the 2019 title left off.' ,'Call of Duty', 'Activision Blizzard', '../img/game.png');

-- teams
INSERT INTO teams (name, history, tags) VALUES ('Fnatic', 'Fnatic es una organización profesional de deportes electrónicos con sede en Londres, Reino Unido. Fundado el 23 de julio de 2004, el equipo tiene jugadores de todo el mundo, en una variedad de juegos, como Counter-Strike: Global Offensive, FIFA, League of Legends, Valorant y Rainbow Six: Siege.', 'Fnatic');
INSERT INTO teams (name, history, tags) VALUES ('G2', 'G2 Esports (antes conocido como Gamers2) es una organización de origen español dedicada a los deportes electrónicos fundada en 2014 por Carlos "Ocelote" Rodríguez Santiago y con sede en Berlín, Alemania. La organización compite en diversos videojuegos, entre los que se incluyen League of Legends, Counter-Strike: Global Offensive, Rainbow Six: Siege, Valorant.', 'G2 Esports');

-- roles
INSERT INTO roles (name) VALUES ('Top Laner');
INSERT INTO roles (name) VALUES ('Jungler');
INSERT INTO roles (name) VALUES ('Mid Laner');
INSERT INTO roles (name) VALUES ('Bot Laner');
INSERT INTO roles (name) VALUES ('Support');
INSERT INTO roles (name) VALUES ('Jugador');

-- players
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Adam Maanane', 'Adam', 1, 'Jugador LoL,', 1);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Gabriel Rau', 'Bwipo', 2, 'Jugador LoL', 1);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Yasin Dinçer', 'Nisqy', 3, 'Jugador LoL', 1);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Elias Lipp', 'Upset', 4, 'Jugador LoL', 1);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Zdravets Galabov','Hylissang', 5, 'Jugador LoL', 1);

-- tournaments
INSERT INTO tournaments (name, region, img_url, game_id) VALUES ('League of Legends European Championship', 'Europa', '../img/game.png', 1);
INSERT INTO tournaments (name, region, img_url, game_id) VALUES ('League Championship Series', 'Norteamérica', '../img/game.png', 1);

-- teams_tournaments
INSERT INTO teams_tournaments (team_id, tournament_id) VALUES (1, 1);
INSERT INTO teams_tournaments (team_id, tournament_id) VALUES (2, 1);

-- users
INSERT INTO users (loginname, password, admin) VALUES ('pepe','pass1', false);
INSERT INTO users (loginname, password, admin) VALUES ('admin','admin', true);
