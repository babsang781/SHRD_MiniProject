select * from member
select * from rank

update clue set clue ='��� : pbk���� �����ִ� ����, �������� �Ѵ޵��� �Ϸ� 6�ð��� �ٹ�' where clue_id = 10
update clue set clue ='���� : pbk�� �ذ��Ϸ��� ��, �ֱٿ� ����ǿ��� ������' where clue_id = 11
update clue set clue ='���� : pbk�� �׸����, pbk�� ���� ������' where clue_id = 12
update clue set clue ='�϶� : ���� ������ ���� ������(�ᱹ pbk�� �Ŵ����� ����), ��ҿ��� ���� ����' where clue_id = 13
update clue set clue ='���� : pbk�� ǥ�������� ���� ����, 2������ �Ի�, ����Ŀ     ' where clue_id = 14

update clue set clue ='��� : 8:40pm~10:20pm ȥ�� �ްԽǿ��� ��Ʈ������ ����Ƽ ������(pbk�� �������)' where clue_id = 15

update clue set clue ='���� : 9:15pm~10:20pm ����ǿ��� �����λ�� ������' where clue_id = 16

update clue set clue ='���� : 9:30pm~10:00pm 1������ 4������ ����, ���϶� �������� ª�� ��ȭ ����' where clue_id = 17

update clue set clue ='�϶� : 18 8:59pm~9:47pm 3������ 4�� �߰� ��ܿ��� ģ�� ģ���� ��ȭ��' where clue_id = 18

update clue set clue ='���� : 9:25pm�濡 �����ڿ��� ����(�ð�) ���� �� �ٷ� �����Ƿ� ���ƿ� 10:30���� ȥ�� �۾�, �������� ������ �����' where clue_id = 19

insert into rank(member_id, nickname, count, cluecount) values ('pny', 'nayoung', 4, (select count(clue_id) from getclue where member_id = 'pny'))

select count(clue_id) from getclue where member_id = 'pny'

select * from rank

insert into getclue (member_id, clue_id)
values('gm', 3)
insert into getclue (member_id, clue_id)
values('gm', 4);
insert into getclue (member_id, clue_id)
values('gm', 5);
insert into getclue (member_id, clue_id)
values('gm', 6);
insert into getclue (member_id, clue_id)
values('gm', 7);
insert into getclue (member_id, clue_id)
values('gm', 8);
insert into getclue (member_id, clue_id)
values('gm', 9);
insert into getclue (member_id, clue_id)
values('gm', 10);
insert into getclue (member_id, clue_id)
values('gm', 11);
insert into getclue (member_id, clue_id)
values('gm', 12);
insert into getclue (member_id, clue_id)
values('gm', 13);
insert into getclue (member_id, clue_id)
values('gm', 14);
insert into getclue (member_id, clue_id)
values('gm', 15);
insert into getclue (member_id, clue_id)
values('gm', 16);
insert into getclue (member_id, clue_id)
values('gm', 17);
insert into getclue (member_id, clue_id)
values('gm', 18);
insert into getclue (member_id, clue_id)
values('gm', 19);

drop table rank cascade constraint
select * from getclue

delete from getclue where clue_id in(1,2)

create table rank
(member_id varchar2(20),
nickname varchar2(20) not null,
count number(5) not null,
cluecount number(5) not null,
constraint rank_memberid_fk foreign key (member_id)
references member (member_id)
select * from suspect
update suspect set job ='AI�� ���� ' where name = '���϶�'
update suspect set job ='DB�� ���� ' where name = '������'
update suspect set job ='������ ����' where name = '�ڳ���'
update suspect set job ='������ �л�' where name = '�ڻ��'
update suspect set job ='������ ���' where name = '������'
update suspect set feature ='�Ҹ��� �� ��, �������� ��Ҹ�, ���� ���� �Ӹ� ' where name = '���϶�'
)