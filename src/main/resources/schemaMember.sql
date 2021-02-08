CREATE TABLE member
(
  memberId varchar(100) DEFAULT NULL ,
 memberName varchar(100) NOT NULL,
 memberPhoneNumber varchar(100) DEFAULT NULL,
 memberDateOfBirth varchar(100) DEFAULT NULL,
 memberJoiningDate varchar(100) DEFAULT NULL,
 memberExpireDate varchar(100) DEFAULT NULL,
 id SERIAL NOT NULL,
 PRIMARY KEY (id)
);

CREATE TABLE payment
(
  paymentId varchar(11) DEFAULT NULL ,
 paymentDate varchar(100)  DEFAULT NULL,
 paymentDateDate varchar(100) DEFAULT NULL,
 amount varchar(100) DEFAULT NULL,
 memberId varchar(100) DEFAULT NULL,
 id SERIAL NOT NULL,
 PRIMARY KEY (id)
);


