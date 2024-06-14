-- Create table message
CREATE TABLE IF NOT EXISTS message (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	message_id VARCHAR(50),
	message_text VARCHAR(500)
);