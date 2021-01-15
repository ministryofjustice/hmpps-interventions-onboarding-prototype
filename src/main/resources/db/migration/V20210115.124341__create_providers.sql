CREATE TABLE providers
(
    id         uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    name       text      not null,
    created_at timestamp not null,
    updated_at timestamp
);
