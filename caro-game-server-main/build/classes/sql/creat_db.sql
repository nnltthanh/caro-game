CREATE TABLE `player`(
    ID int AUTO_INCREMENT PRIMARY KEY,
    `username` varchar(255) UNIQUE,
    `password` varchar(255),
    nickname varchar(255),
    avatar varchar(255),
    numberOfGame int DEFAULT 0,
    numberOfWin int DEFAULT 0,
    numberOfDraw int DEFAULT 0,
    IsOnline int DEFAULT 0,
    IsPlaying int DEFAULT 0,
    role int DEFAULT 0
);

CREATE TABLE `admin`(
    ID int AUTO_INCREMENT PRIMARY KEY,
    `username` varchar(255) UNIQUE,
    `password` varchar(255),
    nickname varchar(255),
    role int DEFAULT 1
);

INSERT INTO admin(username,password,nickname) VALUES('admin','admin123','admin');

CREATE TABLE friend(
    ID_Player1 int NOT NULL,
    ID_Player2 int NOT NULL,
    FOREIGN KEY (ID_Player1) REFERENCES `player`(ID),
    FOREIGN KEY (ID_Player2) REFERENCES `player`(ID),
    CONSTRAINT PK_friend PRIMARY KEY (ID_Player1,ID_Player2)
);
CREATE TABLE BANNED_PLAYER(
    ID_Player int PRIMARY KEY NOT NULL,
    FOREIGN KEY (ID_Player) REFERENCES `player`(ID)
);