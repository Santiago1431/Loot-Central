create table users(
    id serial PRIMARY KEY,
    name varchar(255),
    document varchar(255),
    email varchar(255),
    password varchar(255),
    role ENUM("SELLER", "ADMIN", "BUYER") NOT NULL DEFAULT "BUYER"
);