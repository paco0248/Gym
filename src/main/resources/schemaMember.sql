CREATE TABLE member
(
  memberId varchar(11) NOT NULL ,
 memberName varchar(100) NOT NULL,
 memberPhoneNumber varchar(100) DEFAULT NULL,
 memberDateOfBirth varchar(100) DEFAULT NULL,
 PRIMARY KEY (memberId)
);

CREATE TABLE payment
(
  paymentId varchar(11) NOT NULL ,
 paymentDate varchar(100) NOT NULL,
 amount varchar(100) DEFAULT NULL,
 memberId varchar(100) DEFAULT NULL,
 PRIMARY KEY (paymentId)
);
