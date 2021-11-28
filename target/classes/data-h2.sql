INSERT INTO users(id, name, password, enabled, role) VALUES (1, 'Phil', '$2a$10$kGpFhx/n7qTlTifSXqTN1uJ5dcwIM18QjBSnUXqOShFIkk.rVTYD2', true, 'ROLE_DOCTOR');
INSERT INTO doctors(name, user_id) VALUES ('Phil', 1);
