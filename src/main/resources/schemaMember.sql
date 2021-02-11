CREATE TABLE member
(
  memberId varchar(100) DEFAULT NULL ,
 memberName varchar(100) NOT NULL,
 memberPhoneNumber varchar(100) DEFAULT NULL,
 memberDateOfBirth varchar(100) DEFAULT NULL,
 memberJoiningDate DATE NOT NULL DEFAULT CURRENT_DATE,
 memberExpireDate DATE DEFAULT NULL,
 id SERIAL NOT NULL,
 PRIMARY KEY (id)
);

CREATE TABLE payment
(
  paymentId SERIAL NOT NULL ,
 paymentDate DATE NOT NULL DEFAULT CURRENT_DATE,
 amount NUMERIC(5,2) DEFAULT NULL,
 memberId INTEGER DEFAULT NULL,
 stringTest varchar(100) DEFAULT NULL,
 PRIMARY KEY (paymentId)
);


