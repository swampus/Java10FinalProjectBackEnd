ALTER TABLE USER ADD COLUMN `status` varchar(50);
ALTER TABLE USER ADD COLUMN `create_date` TIMESTAMP DEFAULT NOW();