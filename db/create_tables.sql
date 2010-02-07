CREATE  TABLE users (
  `id` INT NOT NULL PRIMARY KEY ,
  `username` VARCHAR(45) NOT NULL ,
  `password` VARCHAR(45) NOT NULL
  `fname` VARCHAR(20) NOT NULL,
  `lname' VARCHAR(20) NOT NULL);


CREATE  TABLE event (
  id INT NOT NULL PRIMARY KEY ,
  eventName VARCHAR(45) NOT NULL ,
  ranHash VARCHAR(45)NOT NULL ,
  description VARCHAR(45),
  finalized_date TIMESTAMP,
  club VARCHAR(45),
  initiator_ID INT NOT NULL,
   FOREIGN KEY(initiator_ID) REFERENCES users(id));



CREATE  TABLE availabilities (
        id INT NOT NULL PRIMARY KEY,
  	eventid INT NOT NULL,
	day_of_week INT,
        start_time TIME,
        end_time TIME ,
	userid INT NOT NULL,
  FOREIGN KEY(eventid) REFERENCES event(id),
 FOREIGN KEY(userid) REFERENCES users(id));