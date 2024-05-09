create sequence teacher_seq start 1 increment 1;
SET SEARCH_PATH = hibernate;

create table hibernate.teachers (
    id INTEGER,
    full_name VARCHAR,
    bio VARCHAR,
    contact_info VARCHAR,
    image_url VARCHAR,

    primary key(id)
);
