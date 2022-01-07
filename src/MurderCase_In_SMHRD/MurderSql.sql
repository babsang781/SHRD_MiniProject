select * from member
select * from rank

update clue set clue ='상민 : pbk연구 도와주는 조수, 무급으로 한달동안 하루 6시간씩 근무' where clue_id = 10
update clue set clue ='나영 : pbk를 해고하려고 함, 최근에 원장실에서 한판함' where clue_id = 11
update clue set clue ='현도 : pbk와 죽마고우, pbk에 의해 취직함' where clue_id = 12
update clue set clue ='하라 : 승진 문제로 다툼 경쟁함(결국 pbk가 매니저로 승진), 평소에도 자주 논쟁' where clue_id = 13
update clue set clue ='지은 : pbk와 표면적으로 좋은 사이, 2년전에 입사, 스토커     ' where clue_id = 14

update clue set clue ='상민 : 8:40pm~10:20pm 혼자 휴게실에서 노트북으로 피피티 제작중(pbk의 명령으로)' where clue_id = 15

update clue set clue ='나영 : 9:15pm~10:20pm 원장실에서 정부인사와 미팅중' where clue_id = 16

update clue set clue ='현도 : 9:30pm~10:00pm 1층부터 4층까지 순찰, 서하라 김지은과 짧은 대화 나눔' where clue_id = 17

update clue set clue ='하라 : 18 8:59pm~9:47pm 3층에서 4층 중간 계단에서 친한 친구와 통화중' where clue_id = 18

update clue set clue ='지은 : 9:25pm경에 피해자에게 선물(시계) 전달 후 바로 교무실로 돌아와 10:30까지 혼자 작업, 피해자의 마지막 목격자' where clue_id = 19

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
update suspect set job ='AI반 담임 ' where name = '서하라'
update suspect set job ='DB반 담임 ' where name = '김지은'
update suspect set job ='스인재 원장' where name = '박나영'
update suspect set job ='스인재 학생' where name = '박상민'
update suspect set job ='스앤재 경비' where name = '장현도'
update suspect set feature ='불만에 찬 얼굴, 퉁명스러운 목소리, 질끈 묶은 머리 ' where name = '서하라'
)