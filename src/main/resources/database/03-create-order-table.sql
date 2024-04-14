--liquibase formatted sql
--changeset agnieszka:2

CREATE TABLE Orders
(
    order_id    SERIAL PRIMARY KEY,
    email       VARCHAR(50) NOT NULL,
    name        VARCHAR(50) NOT NULL,
    surname     VARCHAR(50) NOT NULL,
    phone_number VARCHAR(15) NOT NULL,
    house_number INT,
    flat_number  INT,
    street      VARCHAR(50) NOT NULL,
    postal_code  VARCHAR(50) NOT NULL,
    city        VARCHAR(50) NOT NULL,
    date        DATE,
    book_id      INT         NOT NULL
);