CREATE TABLE IF NOT EXISTS users
(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    email VARCHAR(320),
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    registration_date TIMESTAMP,
    state VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS items
(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id BIGINT,
    url VARCHAR(1000),
    resolve_url VARCHAR(1000),
    mime_type VARCHAR(100),
    title VARCHAR(255),
    has_image BOOLEAN,
    has_video BOOLEAN,
    unread BOOLEAN,
    date_resolved TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT fk_items_to_users FOREIGN KEY (user_id) REFERENCES users(id),
    UNIQUE (user_id, resolve_url)
);

CREATE TABLE IF NOT EXISTS tags
(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    item_id BIGINT,
    name VARCHAR(50),
    CONSTRAINT fk_tags_to_items FOREIGN KEY(item_id) REFERENCES items(id)
);