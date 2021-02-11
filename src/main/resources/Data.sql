insert into member(memberId, memberName, memberPhoneNumber, memberDateOfBirth, memberJoiningDate, memberExpireDate)
values('1','Jack','3921112222','15, enero, 1999', '31-01-2019', '31-01-2021');

insert into payment(paymentId, paymentDate, amount, memberId) values('15feb2021','500','1');

insert into payment(paymentId, paymentDate, amount, memberId) values('2','1feb021','50','1');

insert into payment(paymentId, paymentDate, amount, memberId, stringTest) values('1feb021','50','1', 'STRINGTEST');

insert into member(memberId, memberName, memberPhoneNumber, memberDateOfBirth)
values('2','Jacko','3921112222', 'putamadre');