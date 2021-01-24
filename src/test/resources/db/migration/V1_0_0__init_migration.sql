CREATE TABLE IF NOT EXISTS `USER` (

    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name`          varchar(MAX),
    `personal_code` varchar(MAX),
    `address`       varchar(MAX),
    `phone`         varchar(200),
    `email`         varchar(1000),
    `notes`         varchar(200)

)ENGINE=InnoDB DEFAULT CHARSET=UTF8;