CREATE TABLE IF NOT EXISTS attendee(
    id SERIAL,
    email VARCHAR(100) NOT NULL,
    nombres VARCHAR(100) NOT NULL,
    institucion VARCHAR(100),
    cargo VARCHAR(100),
    PRIMARY KEY(id),
    UNIQUE(email)
    );