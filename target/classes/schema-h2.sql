CREATE TABLE users
(
    id       BIGINT       NOT NULL,
    name     VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    enabled  BIT(1)       NULL,
    `role`   VARCHAR(255) NULL,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

CREATE TABLE doctors
(
    id      BIGINT AUTO_INCREMENT NOT NULL,
    name    VARCHAR(255)          NULL,
    user_id BIGINT                NULL,
    CONSTRAINT pk_doctors PRIMARY KEY (id)
);

ALTER TABLE doctors
    ADD CONSTRAINT FK_DOCTORS_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);

CREATE TABLE patients
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255)          NULL,
    doctor_id     BIGINT                NULL,
    user_entry_id BIGINT                NULL,
    CONSTRAINT pk_patients PRIMARY KEY (id)
);

ALTER TABLE patients
    ADD CONSTRAINT FK_PATIENTS_ON_DOCTOR FOREIGN KEY (doctor_id) REFERENCES doctors (id);

ALTER TABLE patients
    ADD CONSTRAINT FK_PATIENTS_ON_USERENTRY FOREIGN KEY (user_entry_id) REFERENCES users (id);
