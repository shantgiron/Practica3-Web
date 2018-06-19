
CREATE TABLE IF NOT EXISTS USUARIO (
  ID            BIGINT PRIMARY KEY,
  USERNAME      VARCHAR2(255),
  NOMBRE        VARCHAR2(255),
  PASSWORD      VARCHAR2(255),
  ADMINISTRATOR BOOLEAN,
  AUTOR         BOOLEAN
);

CREATE TABLE IF NOT EXISTS ETIQUETA (
  ID       BIGINT PRIMARY KEY,
  ETIQUETA VARCHAR2(255)
);

CREATE TABLE IF NOT EXISTS ARTICULO (
  ID       BIGINT PRIMARY KEY,
  TITULO   VARCHAR2(255),
  CUERPO   VARCHAR2(255),
  AUTOR_ID BIGINT REFERENCES USUARIO (ID) ON UPDATE CASCADE,
  FECHA    DATE
);

CREATE TABLE IF NOT EXISTS COMENTARIO (
  ID          BIGINT PRIMARY KEY,
  COMENTARIO  VARCHAR2(255),
  AUTOR_ID    BIGINT REFERENCES USUARIO (ID) ON UPDATE CASCADE,
  ARTICULO_ID BIGINT REFERENCES ARTICULO (ID) ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS ARTICULO_COMENTARIOS (
  ARTICULO_ID   BIGINT REFERENCES ARTICULO (ID) ON UPDATE CASCADE,
  COMENTARIO_ID BIGINT REFERENCES COMENTARIO (ID) ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS ARTICULO_ETIQUETAS (
  ARTICULO_ID BIGINT REFERENCES ARTICULO (ID) ON UPDATE CASCADE,
  ETIQUETA_ID BIGINT REFERENCES ETIQUETA (ID) ON UPDATE CASCADE
);
