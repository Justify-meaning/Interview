package java_learn;

/**
 * @Author Justifymeaning
 * @Date 2021/3/18 17:08
 * @Version 1.0
 */
public class Sql {
//    CREATE TABLE Student
//            (
//                    id INT(4) NOT NULL PRIMARY KEY auto_increment,
//    name VARCHAR(50) NOT NULL,
//    sex VARCHAR(50) NOT NULL,
//    age INT(4) NOT NULL,
//    grade INT(5) NOT NULL,
//    birthday DATE
//);
//
//    INSERT INTO student(name,sex,age,grade,birthday) VALUES ("王五","男",22,84,"1997-01-01");
//    INSERT INTO student(name,sex,age,grade,birthday) VALUES ("张三","男",24,54,"1997-05-21");
//
//    UPDATE student SET name="李四",sex="女" where id=2;
//
//    SELECT * from student where age=22;
//
//    DELETE from student where id=2;
//
//    ALTER TABLE student ADD phone VARCHAR(10);
//
//    ALTER TABLE student ALTER sex VARCHAR(55);
//
//-- 添加索引
//    CREATE UNIQUE INDEX Sid ON student(id);
//    CREATE INDEX Sgrade ON student(grade DESC,age);
//
//-- 删除索引
//    ALTER TABLE student DROP INDEX id;
//
//-- 用as起别名
//    select Sno,Sname,2020-Sage as Date,Sdept from student;
//-- 消除取消重复的行
//    select DISTINCT Ssex FROM student;
//-- 使用where子句
//    select * from student where Sdept = '软件学院';
//-- 使用between子句
//    select * from student where Sage between 20 and 22;
//    select * from student where Sage not between 20 and 22;
//-- 使用in字句
//    select Sno,Sname,Sage from student where Sdept in ('软件学院','马克思学院');
//    select Sno,Sname,Sage from student where Sdept not in ('软件学院','马克思学院');
//-- 模糊查询
//    select * from student where Sname like '张%';
//    select * from student where Sname like '李_';
//    select * from student where Sname like '%三%';
//-- 排序
//    select * from sc order by Grade;
//    select * from sc order by Grade DESC;
//    select * from sc order by Cno,Grade DESC;
//-- 聚集函数
//    select Sno,avg(grade) as 平均分 from sc where Sno="171303";
//    select count(distinct Sno) as 选修学生总数 from sc;
//    select max(Grade) as 最高分,min(Grade)as 最低分 from sc;
//    select sum(Grade) as 总分 from sc;
//-- 分组查询
//    select Sdept,count(*) as 人数 from student group by Sdept;
//    select Sno,avg(Grade) as 均分 from sc group by Sno having avg(Grade)>60;
//-- 等值与非等值查询
//    select student.*,sc.Grade,sc.Cno from student,sc where student.Sno=sc.Sno;
//-- 自身连接查询
//    select a.Sno,a.Cno,b.Grade from sc a, sc b where a.Grade=b.Grade and a.Cno!=b.Cno;
//-- 外连接查询
//    select student.*,sc.Cno,sc.Grade from student left join sc on student.Sno=sc.Sno;
//    select student.*,sc.Cno,sc.Grade from student right join sc on student.Sno=sc.Sno;
//-- 嵌套查询
//    select * from student where Sno in (select Sno from sc where Cno="001");
//-- 视图
//    create view J_Student as select student.*,sc.Grade,sc.Cno from student,sc where student.Sno=sc.Sno;
//    select * from J_Student where Grade>70;
//    update J_Student set Sage=24 where Grade=78;
//    drop view J_Student;
}
