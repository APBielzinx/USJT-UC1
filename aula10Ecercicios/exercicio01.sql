CREATE DATABASE Universidade;
USE Universidade;


CREATE TABLE PESSOAL (
                         Id INT AUTO_INCREMENT PRIMARY KEY,
                         CPF CHAR(11) NOT NULL UNIQUE,
                         RG CHAR(9) NOT NULL UNIQUE,
                         Nome VARCHAR(100) NOT NULL,
                         DataNascimento DATE NOT NULL
);

CREATE TABLE ACADEMICO (
                           Id INT AUTO_INCREMENT PRIMARY KEY,
                           RA CHAR(10) NOT NULL UNIQUE,
                           Nome VARCHAR(100) NOT NULL,
                           NotaTeoria DECIMAL(5,2) NOT NULL,
                           NotaLab DECIMAL(5,2) NOT NULL,
                           Media DECIMAL(5,2) GENERATED ALWAYS AS ((NotaTeoria + NotaLab) / 2) STORED,
                           CPF CHAR(11) NOT NULL,
                           FOREIGN KEY (CPF) REFERENCES PESSOAL(CPF)
                               ON UPDATE CASCADE
                               ON DELETE CASCADE
);

SELECT * from PESSOAL