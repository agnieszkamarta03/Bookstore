--liquibase formatted sql
--changeset agnieszka:1

CREATE TABLE Book
(
    id         SERIAL PRIMARY KEY,
    title      VARCHAR(50)   NOT NULL,
    author     VARCHAR(50)   NOT NULL,
    pages      INT            NOT NULL,
    cover_type VARCHAR(50),
    genre      VARCHAR(50),
    price      DECIMAL(10, 2) NOT NULL,
    img_url    VARCHAR(255),
    stock      INT            NOT NULL
);