CREATE TABLE Students (
student_id SERIAL PRIMARY KEY,
full_name VARCHAR(50) NOT NULL,
right_answers_count INTEGER,
wrong_answers_count INTEGER);

INSERT INTO Students (full_name, right_answers_count, wrong_answers_count) VALUES
('Иванов Иван Иванович', 3, 0),
('Сидорова Маргарита Васильевна', 0, 3),
('Петров Петр Петрович', 2, 1);

SELECT St.student_id, St.full_name, St.right_answers_count, St.wrong_answers_count FROM Students AS St;

CREATE TABLE Questions (
question_id SERIAL PRIMARY KEY,
question VARCHAR(100) UNIQUE,
answer_id INTEGER NOT NULL
);

INSERT INTO Questions (question, answer_id) VALUES 
('Кем разрабатывался язык Java?', 1),
('Чему равно ускорение свободного падения?', 6),
('Что такое десница?', 8);

DELETE FROM Questions WHERE question_id = 3;

SELECT Q.question_id, Q.question, Q.answer_id FROM Questions AS Q;


CREATE TABLE Answers (
answer_id SERIAL PRIMARY KEY,
answer VARCHAR(20) NOT NULL,
question_id INTEGER NOT NULL REFERENCES Questions(question_id) ON DELETE CASCADE
);

INSERT INTO Answers (answer, question_id) VALUES
('Джеймс Гослинг', 1),
('Ди Каприо', 1),
('Архимед', 1),
('Железный Человек', 1),
(15, 2),
('9,8', 2),
(5, 2),
('Рука', 3),
('Нога', 3),
('Бровь', 3),
('Глаз', 3),
('Голова', 3);

SELECT Ans.answer_id, Ans.answer, Ans.question_id FROM Answers AS Ans;


SELECT Q.question_id, Q.question, Ans.answer AS right_answer FROM Questions AS Q INNER JOIN Answers AS Ans ON Q.answer_id = Ans.answer_id;

SELECT Ans.answer_id, Q.question, Ans.answer FROM Answers AS Ans, Questions AS Q WHERE Ans.question_id = Q.question_id;

DROP TABLE Students;
DROP TABLE Questions;
DROP TABLE Answers;