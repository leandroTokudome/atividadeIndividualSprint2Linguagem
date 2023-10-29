CREATE DATABASE IF NOT EXISTS atividadeIndividualSprint2;
USE atividadeIndividualSprint2;

CREATE TABLE IF NOT EXISTS usoCpu (
idCpu INT PRIMARY KEY AUTO_INCREMENT,
dataHora DATETIME,
usoCpu VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS memoriaRam (
idMemoria INT PRIMARY KEY AUTO_INCREMENT,
dataHora DATETIME,
memoriaRam VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS numeroProcessos (
idProcesso INT PRIMARY KEY AUTO_INCREMENT,
dataHora DATETIME,
numeroProcessos VARCHAR(10)
);