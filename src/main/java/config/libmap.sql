drop  table libmap;

create table libmap(
mart varchar2(2000),
p_num varchar2(2000),
area varchar2(2000),
address varchar2(2000),
latitude varchar2(2000),
longitude varchar2(2000));



insert into libmap values('??Έ ??κ΄?','02-2122-0300','??Έ','??Έ μ€κ΅¬ ?Έμ’λ‘ 110','37.566134','126.977808');
insert into libmap values('μ§??? ?²','031-711-8905','κ²½κΈ°','κ²½κΈ°? ?±?¨? λΆλΉκ΅? κΈκ³‘? 206','37.386396','127.101900');
commit;

select count(*) from libmap where area='??Έ';

delete from libbmap where p_num=2

select * from libmap





