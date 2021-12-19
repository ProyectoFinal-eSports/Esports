-- games
INSERT INTO games (name, genre, developer, gameplay, img_url) VALUES ('League of Legends', 'MOBA', 'Riot Games', 'League of Legends, popularmente conocido como LoL, es un juego de estrategia por equipos en el que dos equipos de cinco jugadores se enfrentan para ver quién destruye antes la base del otro. Los jugadores compiten en partidas, que duran entre 15 y 50 minutos en promedio. En cada modo de juego, los equipos trabajan juntos para lograr una condición de victoria, normalmente destruyendo la estructura central (llamado Nexo) en la base del equipo enemigo después de pasar por alto una línea de estructuras defensivas llamadas Torretas. En todos los modos de juego, los jugadores controlan personajes llamados «campeones», elegidos o asignados en cada partida, que tienen un conjunto de habilidades únicas, con los cuales jugarán toda la partida hasta su conclusión.', '/upload/img/game/game.png');
INSERT INTO games (name, genre, developer, gameplay, img_url) VALUES ('FIFA 2022', 'Deportes', 'Electronic Arts', 'FIFA 22 es un videojuego de simulación de fútbol con la licencia oficial de la FIFA, disponible en todas las plataformas. Los usuarios pueden disfrutar de sus equipos favoritos repletos de estrellas y conquistar las competiciones nacionales e internacionales de todo el mundo. Este año, muestra la nueva tecnología Hypermotion que brindará una experiencia más realista disponibles exclusivamente en la nueva generación de consolas (Xbox Series X/S, PlayStation 5).', '/upload/img/game/game.png');
INSERT INTO games (name, genre, developer, gameplay, img_url) VALUES ('Call of Duty', 'FPS', 'Infinity Ward', 'Call of Duty es una serie de videojuegos de disparos en primera persona, de estilo bélico, desarrollada principal e inicialmente por Infinity Ward, Treyarch, Sledgehammer Games y en menor proporción Raven Software y distribuida por Activision. La serie inicialmente se ambientaba en la Segunda Guerra Mundial, relatando personajes y combates acaecidos durante dicho conflicto bélico. Esto fue cambiando hasta la actualidad, donde los argumentos suceden en ambientes contemporáneos y ficticios.', '/upload/img/game/game.png');
INSERT INTO games (name, genre, developer, gameplay, img_url) VALUES ('Valorant', 'FPS', 'Riot Games', 'Valorant es un videojuego de disparos táctico en equipo y en primera persona ambientado en un futuro próximo. Los jugadores asumen el control de agentes, personajes que provienen de una gran cantidad de países y culturas de todo el mundo. En el modo de juego principal, los jugadores se unen al equipo atacante o defensor con cada equipo que tiene cinco jugadores. Los agentes tienen habilidades únicas y usan un sistema económico para comprar sus habilidades y armas. El videojuego tiene una variedad de armas que incluyen pistolas, subfusiles, escopetas, ametralladoras, fusiles de asalto y fusiles de francotirador. Cada arma tiene un patrón de retroceso que debe ser controlado por el jugador para poder disparar con precisión. El equipo atacante tiene una bomba, llamada Spike, que necesitan plantar en un sitio. Si el equipo atacante protege con éxito la Spike durante 40 segundos y detona, obtendrán un punto. Si el equipo defensor desactiva con éxito la Spike, o el temporizador de la ronda de 100 segundos expira, el equipo defensor obtiene un punto. Si se eliminan todos los miembros de un equipo, el equipo contrario gana un punto. Después de doce rondas, el equipo atacante cambia al equipo defensor y viceversa. El primer equipo en ganar 13 rondas gana la partida. Exceptuando el tiempo extra, donde deberás conseguir 2 victorias/rondas seguidas.', '/upload/img/game/game.png');

-- posts
INSERT INTO posts (title, date, registered, short_text, long_text, tags, author, img_url) VALUES ('De Gea presenta Rebels Gaming, su club de esports', '2021-12-01', false, 'El club del futbolista español cuenta con equipos en League of Legends, VALORANT y Rainbow Six: Siege y ha desvelado, por fin, su logo.', 'David de Gea, futbolista del Manchester United y de la selección española, ha anunciado la creación de su propio club de deportes electrónicos, Rebels Gaming, con el que comenzará compitiendo en tres títulos de forma simultánea. "Queremos que Rebels Gaming sea uno de los clubs de referencia global, no solo por su nivel competitivo, sino por esa apuesta por el talento y por la capacidad de inspirar a los más jóvenes a la hora de buscar nuevas oportunidades y tener un impacto positivo en la sociedad", afirma en la nota de prensa enviada por el club. Lo cierto es que el club venía compitiendo desde hace un tiempo ya, aunque hasta el momento solo se conocía el nombre y no se conocía el escudo ni, oficialmente, la vinculación del popular guardameta con él. Pero donde más ruido han hecho ha sido, probablemente, en League of Legends. Y es que Rebels Gaming jugará en la segunda división de la Superliga, una categoría de reciente creación en la que han entrado proyectos potentes y que promete tener un gran seguimiento por la posibilidad de ascender a Superliga.', 'Esports', 'Álvaro Guiñón', '/upload/img/post/post.png');
INSERT INTO posts (title, date, registered, short_text, long_text, tags, author, img_url) VALUES ('Lo que queremos ver en Call of Duty: Vanguard', '2021-08-28', false, 'La próxima entrega de la franquicia Call of Duty se acerca rápidamente, pero tiene mucho que mejorar.', 'Call of Duty ha agregado constantemente cuotas a la franquicia desde 2003, y ahora tiene un total de 24 juegos en su haber. Ahora ampliamente conocido como una de las franquicias de juegos globales más populares del mundo, cada juego de CoD tiene expectativas trascendentales que cumplir. Aún así, cada juego de CoD nos brinda mucho para disfrutar, pero también espacio para construir en el próximo. Con Vanguard acercándose rápidamente, que se lanzará el 5 de noviembre, esto es lo que queremos ver en el juego.' ,'Call of Duty, Activision', 'Blaine Polhamus', '/upload/img/post/post.png');
INSERT INTO posts (title, date, registered, short_text, long_text, tags, author) VALUES ('Entrenadores, managers, psicólogos: las otras profesiones que se abren paso en los deportes electrónicos', '2021-11-30', false, 'El sector, que emplea ya a unas 800 personas en España, se profesionaliza y atrae a trabajadores procedentes de otros ámbitos.', 'A David Rodríguez le dolía mucho el antebrazo cuando jugaba dos o tres partidas. Pronto tuvo claro que esa epicondilitis le impediría competir, pero los deportes electrónicos ―competiciones de videojuegos― a los que se dedicaba, le dieron otra oportunidad. Empezó a asesorar a amigos y a otros jugadores, al principio de forma casual, luego con regularidad. “Se fue corriendo la voz de que yo hacía ese tipo de sesiones hasta que un día llegó hasta Mad Lions y me ficharon, porque sabían ya cómo trabajaba”, cuenta. Con solo 22 años —una edad aún para ser jugador— es segundo entrenador del popular videojuego League of Legends en este club con sede en Madrid. Su caso demuestra que la incipiente industria de los deportes electrónicos puede dar trabajo a más personas, aparte de los jugadores. El sector moverá 1.084 millones de dólares en 2021, según las previsiones de la analista especializada Newzoo, un 14,5% de incremento respecto a 2020. La audiencia también crecerá, un 10% hasta los 728,8 millones de espectadores. Y parte de esta actividad económica está arropada por esas nuevas profesiones, como director deportivo de un club, managers, personal médico, psicólogo deportivo o representante de jugadores.','Esports', 'Pablo G. Bejerano');
INSERT INTO posts (title, date, registered, short_text, long_text, tags, author) VALUES ('Lorem Ipsum is simply dummy text', '2021-12-09', true, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.','strategy games', 'Blaine Polhamus');
INSERT INTO posts (title, date, registered, short_text, long_text, tags, author) VALUES ('It is a long established fact that a reader will be distracted', '2021-12-10', true, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.','call_of_duty, activision, war_game', 'Dom Sacco');

-- teams
INSERT INTO teams (name, history, img_url) VALUES ('Fnatic', 'Fnatic es una organización profesional de deportes electrónicos con sede en Londres, Reino Unido. Fundado el 23 de julio de 2004, el equipo tiene jugadores de todo el mundo, en una variedad de juegos, como Counter-Strike: Global Offensive, FIFA, League of Legends, Valorant y Rainbow Six: Siege.', '/upload/img/team/fnatic.png');
INSERT INTO teams (name, history, img_url) VALUES ('G2 Esports', 'G2 Esports (antes conocido como Gamers2) es una organización de origen español dedicada a los deportes electrónicos fundada en 2014 por Carlos "Ocelote" Rodríguez Santiago y con sede en Berlín, Alemania. La organización compite en diversos videojuegos, entre los que se incluyen League of Legends, Counter-Strike: Global Offensive, Rainbow Six: Siege, Valorant.', '/upload/img/team/g2esports.png');

-- roles
INSERT INTO roles (name) VALUES ('Top Laner');
INSERT INTO roles (name) VALUES ('Jungler');
INSERT INTO roles (name) VALUES ('Mid Laner');
INSERT INTO roles (name) VALUES ('Bot Laner');
INSERT INTO roles (name) VALUES ('Support');
INSERT INTO roles (name) VALUES ('Jugador');

-- players
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Martin Hansen', 'Wunder', 1, 'League of Legends', 1);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Iván Martín', 'Razork', 2, 'League of Legends', 1);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Marek Brázda', 'Humanoid', 3, 'League of Legends', 1);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Elias Lipp', 'Upset', 4, 'League of Legends', 1);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Zdravets Galabov','Hylissang', 5, 'League of Legends', 1);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Sergen Çelik','Broken Blade', 1, 'League of Legends', 2);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Marcin Jankowski','Jankos', 2, 'League of Legends', 2);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Rasmus Winther','caPs', 3, 'League of Legends', 2);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Víctor Lirola','Flakked', 4, 'League of Legends', 2);
INSERT INTO players (player_name, name, role_id, tags, team_id) VALUES ('Raphaël Crabbé','Targamas', 5, 'League of Legends', 2);

-- tournaments
INSERT INTO tournaments (name, region, game_id) VALUES ('League of Legends European Championship (LEC)', 'Europa', 1);
INSERT INTO tournaments (name, region, game_id) VALUES ('League Championship Series (LCS)', 'Norteamérica', 1);
INSERT INTO tournaments (name, region, game_id) VALUES ('FIFA 21 Global Series', 'Internacional', 2);
INSERT INTO tournaments (name, region, game_id) VALUES ('Call of Duty League', 'Internacional', 3);
INSERT INTO tournaments (name, region, game_id) VALUES ('Valorant Champions Tour Berlín 2021', 'Internacional', 4);


-- teams_tournaments
INSERT INTO teams_tournaments (team_id, tournament_id) VALUES (1, 1);
INSERT INTO teams_tournaments (team_id, tournament_id) VALUES (2, 1);

-- users
INSERT INTO users (loginname, password, security_role) VALUES ('pepe','pass1', 0);
INSERT INTO users (loginname, password, security_role) VALUES ('admin','admin', 1);
