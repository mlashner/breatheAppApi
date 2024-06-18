create sequence notification_seq start 1 increment 1;
SET SEARCH_PATH = hibernate;

CREATE TABLE hibernate.notifications (
    id INTEGER,
    msg VARCHAR,
    user_id INTEGER,
    workshop_id INTEGER NULL,

    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (workshop_id) REFERENCES workshops (id)
);