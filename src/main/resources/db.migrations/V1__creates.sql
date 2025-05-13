CREATE TABLE Setor (
    id_setor INTEGER PRIMARY KEY,
    nome_setor VARCHAR2(255),
    responsavel VARCHAR2(255)
);

CREATE TABLE Equipamento (
    id_equipamento INTEGER PRIMARY KEY,
    nome VARCHAR2(255),
    tipo VARCHAR2(255),
    consumo_medio_kw FLOAT,
    id_setor INTEGER,
    FOREIGN KEY (id_setor) REFERENCES Setor(id_setor)
);

CREATE TABLE SensorIoT (
    id_sensor INTEGER PRIMARY KEY,
    tipo_sensor VARCHAR2(255),
    status VARCHAR2(255),
    id_equipamento INTEGER,
    FOREIGN KEY (id_equipamento) REFERENCES Equipamento(id_equipamento)
);

CREATE TABLE RegistroConsumo (
    id_registro INTEGER PRIMARY KEY,
    id_equipamento INTEGER,
    data_hora TIMESTAMP,
    consumo_kw FLOAT,
    FOREIGN KEY (id_equipamento) REFERENCES Equipamento(id_equipamento)
);

CREATE TABLE Alerta (
    id_alerta INTEGER PRIMARY KEY,
    tipo_alerta VARCHAR2(255),
    descricao CLOB,
    data_hora TIMESTAMP,
    id_registro INTEGER,
    FOREIGN KEY (id_registro) REFERENCES RegistroConsumo(id_registro)
);