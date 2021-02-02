CREATE TABLE member
(
 memberName varchar(100) NOT NULL,
  memberId varchar(11) NOT NULL ,
 memberPhoneNumber varchar(100) DEFAULT NULL,
 memberDateOfBirth varchar(100) DEFAULT NULL,
 PRIMARY KEY (memberId)
);
