create table depart
(
deptid int primary key,
deptName varchar(20) check(deptName in ('sales','marketing'))
)

create table emp
(
empID int primary key,
empNAME varchar(20),
age int check(age between 18 and 50),
deptID int,
constraint fk foreign key(deptID) references depart(deptid)
)

----------trigger -------

create table empBackup
(
empID int primary key,
empNAME varchar(20),
age int ,
deptID int
)

create or replace trigger emptrg
after insert
on emp
for each row
begin
insert into empBackup values(:new.empid,:new.empname,:new.age,:new.deptid);
end;

insert into depart values(1 ,'sales');
insert into emp values(1,'Sahil',23,1);

select * from empbackup;
select * from emp;
select * from empbin;

insert into emp values(2,'Aryaman',23,1);

create table empBin
(
empID int primary key,
empNAME varchar(20),
age int ,
deptID int
)

create or replace trigger deltrg
before delete
on emp
for each row
begin
insert into empBin values(:old.empid,:old.empname,:old.age,:old.deptid);
end;

DELETE FROM emp where empid=2;


-----------------DOB Table and trigger-----------

create table empdob(
empid int,
dob date
)

create or replace trigger dobcheck
before insert
on empdob
for each row
begin
dbms_output.put_line('Hello Trigger');
if :new.dob>sysdate then
    raise_application_error(-20057,'Date in Future');
    end if;
end;

insert into empdob values(1,'25-sep-2019');
insert into empdob values(1,'22-sep-2019');

select * from empdob;

set serveroutput on;



---------------constraint------
create table const(
name varchar(10) default 'Sahil',
id int
)

insert into const values(default,1);
select * from const;

select user from dual;
--------timetable-------------
create table school(
    day char(3),
    sess int,
    fac varchar(20),
    room int,
    sem int,
    sub varchar(20),
    unique(day, sess, room),
    unique(day, sess, fac),
    unique(day, sess, sem)
);
--------------------sequence-----------


create table demoSeq
(
slno int,
name varchar(20)
)


CREATE SEQUENCE seq1
 START WITH     100
 INCREMENT BY   -1
 MAXVALUE  150
 MINVALUE 50
 NOCYCLE;
 
 select seq1.nextval from dual;
 insert into demoSeq values(seq1.nextval,'abc');
 select * from demoSeq;
 
 ---------------------testing flashback---
select * from tab;

Flashback table college to before drop;

drop table college;
drop table college purge;

-----------------------joins----------

----------------
create table empSlf
(
empId int,
empName varchar(20),
ManagerId int
);


insert into empSlf values('101','JOHN','');

insert into empSlf values('102','CENA','101');
insert into empSlf values('103','ROCK','101');
insert into empSlf values('104','BROCK','101');


insert into empSlf values('105','NIRMA','');

insert into empSlf values('106','HEMA','105');
insert into empSlf values('107','REKHA','105');
insert into empSlf values('108','JAYA','105');
insert into empSlf values('109','SUSHMA','105');



select e.empName as "Employee Name",m.empName as "Manager Name"
from empslf e  join empslf m
on e.managerId=m.empid; 

select user from dual;


--------------tuesday task------

create table employee(
empFNAME varchar(20),
EmpMNAME varchar(20),
EmpLNAME varchar(20),
EmpAge int check(empage between 1 and 50),
EmpCity varchar(20) check (EmpCity like 'b%'),
empdsg varchar(20)check(empdsg like '%manager%'),
empid varchar(5) check (lengthb(empid)=5) primary key,
empdob date
);

insert into employee values('sahil','','sagar',23,'bangalore','space manager','emp01','23-feb-2019');
insert into employee values('aryman','bhosdi','sadal',23,'bangalore','lauda manager','emp02','23-oct-2019');
insert into employee values('gootam','goo','shetty',23,'bangalore','ganja manager','emp03','23-jan-2019');

commit;

delete from employee where empid='emp02';

select * from employee;

rollback;

select substr(empfname,1,1)||'.'||substr(empmname,1,1)||'.'||emplname from employee;
select to_char(empdob,'dd-mon-yyyy') from employee;

select empdob from employee;

create table testPrc(col1 varchar(20));

create or replace procedure prcMyProc(val varchar2)
as
begin
insert into testprc values(val);
end;


exec prcMyProc('world');

select * from testprc;

create or replace procedure prcoutdemo(abc out varchar2)
as 
begin
abc:='hello from proc';
end;

create or replace procedure dobplus( dob date, outdob out date)
as
begin
outdob:=dob-10;
end;
/

declare
dob date;
begin
dobplus('23-sep-2019',dob);
dbms_output.put_line(dob);
end;
/

set serveroutput on

commit;