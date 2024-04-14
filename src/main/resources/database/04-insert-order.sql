--liquibase formatted sql
--changeset agnieszka:1

INSERT INTO Orders (email, name, surname, phone_number, house_number, flat_number, street, postal_code, city, date, book_id)
VALUES
    ('jan@kowalski.com', 'Jan', 'Kowalski', '123456789', 1, NULL, 'Main Street', '12345', 'City1', '2024-04-01', 1),
    ('anna@nowak.com', 'Anna', 'Nowak', '987654321',2 , NULL, 'Park Avenue', '54321', 'City2', '2024-04-02', 2),
    ('marek@wozniak.com', 'Marek', 'Wozniak', '111222333', NULL , 13, 'Broadway', '67890', 'City3', '2024-04-03', 3),
    ('marta@dziuba.com', 'Marta', 'Dziuba', '222333444', 10, NULL, 'Wall Street', '97531', 'City10', '2024-04-10', 10);