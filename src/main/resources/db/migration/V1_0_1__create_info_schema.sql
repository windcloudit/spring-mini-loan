CREATE TABLE IF NOT EXISTS `loan_registers` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `user_id` bigint,
    `document_date` date,
    `interest_rate` float,
    `amount` integer,
    `loan_term` integer,
    `approve` boolean,
    `created_at` date,
    `created_by` int,
    `updated_at` date,
    `updated_by` int
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;