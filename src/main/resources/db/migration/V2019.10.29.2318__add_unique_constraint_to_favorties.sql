SET SEARCH_PATH = hibernate;
ALTER TABLE favorites ADD CONSTRAINT user_workshop_unique UNIQUE (user_id, workshop_id);