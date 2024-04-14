--liquibase formatted sql
--changeset agnieszka:1
INSERT INTO Book (title, author, pages, cover_type, genre, price, img_url, stock) VALUES
-- ROMANCE
('Pride and Prejudice', 'Jane Austen', 300, 'Paperback', 'ROMANCE', 20.00, 'https://example.com/pride_and_prejudice.jpg', 100),
('Jane Eyre', 'Charlotte Bronte', 400, 'Hardcover', 'ROMANCE', 25.00, 'https://example.com/jane_eyre.jpg', 80),
('Wuthering Heights', 'Emily Bronte', 350, 'Paperback', 'ROMANCE', 22.00, 'https://example.com/wuthering_heights.jpg', 90),
('Sense and Sensibility', 'Jane Austen', 320, 'Hardcover', 'ROMANCE', 28.00, 'https://example.com/sense_and_sensibility.jpg', 70),
('Gone with the Wind', 'Margaret Mitchell', 500, 'Paperback', 'ROMANCE', 30.00, 'https://example.com/gone_with_the_wind.jpg', 110),
('The Notebook', 'Nicholas Sparks', 280, 'Paperback', 'ROMANCE', 18.00, 'https://example.com/the_notebook.jpg', 95),
('Outlander', 'Diana Gabaldon', 600, 'Hardcover', 'ROMANCE', 35.00, 'https://example.com/outlander.jpg', 105),
('The Fault in Our Stars', 'John Green', 320, 'Paperback', 'ROMANCE', 19.00, 'https://example.com/the_fault_in_our_stars.jpg', 85),
('Me Before You', 'Jojo Moyes', 350, 'Hardcover', 'ROMANCE', 24.00, 'https://example.com/me_before_you.jpg', 115),
('A Walk to Remember', 'Nicholas Sparks', 310, 'Paperback', 'ROMANCE', 21.00, 'https://example.com/a_walk_to_remember.jpg', 75),

-- HORROR
('Dracula', 'Bram Stoker', 400, 'Hardcover', 'HORROR', 25.00, 'https://example.com/dracula.jpg', 80),
('The Shining', 'Stephen King', 500, 'Hardcover', 'HORROR', 30.00, 'https://example.com/the_shining.jpg', 70),
('The Exorcist', 'William Peter Blatty', 360, 'Paperback', 'HORROR', 23.00, 'https://example.com/the_exorcist.jpg', 90),
('Frankenstein', 'Mary Shelley', 350, 'Paperback', 'HORROR', 22.00, 'https://example.com/frankenstein.jpg', 100),
('Pet Sematary', 'Stephen King', 320, 'Paperback', 'HORROR', 21.00, 'https://example.com/pet_sematary.jpg', 85),
('It', 'Stephen King', 600, 'Hardcover', 'HORROR', 35.00, 'https://example.com/it.jpg', 95),
('The Haunting of Hill House', 'Shirley Jackson', 280, 'Paperback', 'HORROR', 19.00, 'https://example.com/haunting_of_hill_house.jpg', 105),
('The Silence of the Lambs', 'Thomas Harris', 400, 'Hardcover', 'HORROR', 28.00, 'https://example.com/silence_of_the_lambs.jpg', 75),
('Carrie', 'Stephen King', 300, 'Paperback', 'HORROR', 20.00, 'https://example.com/carrie.jpg', 110),
('The Woman in Black', 'Susan Hill', 320, 'Paperback', 'HORROR', 21.00, 'https://example.com/woman_in_black.jpg', 80),

-- COMEDY
('The Hitchhiker''s Guide to the Galaxy', 'Douglas Adams', 250, 'Paperback', 'COMEDY', 18.00, 'https://example.com/hitchhikers_guide.jpg', 120),
('Good Omens', 'Neil Gaiman, Terry Pratchett', 400, 'Paperback', 'COMEDY', 24.00, 'https://example.com/good_omens.jpg', 110),
('Bridget Jones''s Diary', 'Helen Fielding', 320, 'Paperback', 'COMEDY', 20.00, 'https://example.com/bridget_jones_diary.jpg', 100),
('The Rosie Project', 'Graeme Simsion', 300, 'Paperback', 'COMEDY', 19.00, 'https://example.com/rosie_project.jpg', 90),
('Crazy Rich Asians', 'Kevin Kwan', 350, 'Hardcover', 'COMEDY', 25.00, 'https://example.com/crazy_rich_asians.jpg', 80),
('Where''d You Go, Bernadette', 'Maria Semple', 330, 'Paperback', 'COMEDY', 22.00, 'https://example.com/whered_you_go_bernadette.jpg', 95),
('The Importance of Being Earnest', 'Oscar Wilde', 260, 'Paperback', 'COMEDY', 17.00, 'https://example.com/importance_of_being_earnest.jpg', 85),
('My Sister, the Serial Killer', 'Oyinkan Braithwaite', 240, 'Paperback', 'COMEDY', 16.00, 'https://example.com/my_sister_the_serial_killer.jpg', 75),
('Less', 'Andrew Sean Greer', 270, 'Paperback', 'COMEDY', 18.00, 'https://example.com/less.jpg', 105),
('Eleanor Oliphant Is Completely Fine', 'Gail Honeyman', 320, 'Paperback', 'COMEDY', 20.00, 'https://example.com/eleanor_oliphant.jpg', 115),

-- SCI_FI
('Dune', 'Frank Herbert', 700, 'Hardcover', 'SCI_FI', 40.00, 'https://example.com/dune.jpg', 90),
('Neuromancer', 'William Gibson', 320, 'Paperback', 'SCI_FI', 22.00, 'https://example.com/neuromancer.jpg', 85),
('Foundation', 'Isaac Asimov', 400, 'Hardcover', 'SCI_FI', 28.00, 'https://example.com/foundation.jpg', 95),
('Snow Crash', 'Neal Stephenson', 440, 'Paperback', 'SCI_FI', 30.00, 'https://example.com/snow_crash.jpg', 80),
('The Left Hand of Darkness', 'Ursula K. Le Guin', 350, 'Paperback', 'SCI_FI', 24.00, 'https://example.com/left_hand_of_darkness.jpg', 105),
('Hyperion', 'Dan Simmons', 480, 'Paperback', 'SCI_FI', 32.00, 'https://example.com/hyperion.jpg', 75),
('Altered Carbon', 'Richard K. Morgan', 400, 'Paperback', 'SCI_FI', 26.00, 'https://example.com/altered_carbon.jpg', 110),
('Ready Player One', 'Ernest Cline', 370, 'Paperback', 'SCI_FI', 25.00, 'https://example.com/ready_player_one.jpg', 100),
('The Three-Body Problem', 'Liu Cixin', 400, 'Hardcover', 'SCI_FI', 28.00, 'https://example.com/three_body_problem.jpg', 115),
('The Martian', 'Andy Weir', 400, 'Paperback', 'SCI_FI', 24.00, 'https://example.com/the_martian.jpg', 105),

-- BIOGRAPHY
('Steve Jobs', 'Walter Isaacson', 600, 'Hardcover', 'BIOGRAPHY', 35.00, 'https://example.com/steve_jobs.jpg', 70),
('Becoming', 'Michelle Obama', 450, 'Hardcover', 'BIOGRAPHY', 30.00, 'https://example.com/becoming.jpg', 75),
('Educated', 'Tara Westover', 340, 'Paperback', 'BIOGRAPHY', 23.00, 'https://example.com/educated.jpg', 80),
('Leonardo da Vinci', 'Walter Isaacson', 550, 'Hardcover', 'BIOGRAPHY', 32.00, 'https://example.com/leonardo_da_vinci.jpg', 85),
('The Diary of a Young Girl', 'Anne Frank', 320, 'Paperback', 'BIOGRAPHY', 21.00, 'https://example.com/diary_of_a_young_girl.jpg', 90),
('Bossypants', 'Tina Fey', 280, 'Paperback', 'BIOGRAPHY', 19.00, 'https://example.com/bossypants.jpg', 95),
('Elon Musk', 'Ashlee Vance', 400, 'Paperback', 'BIOGRAPHY', 25.00, 'https://example.com/elon_musk.jpg', 100),
('I Am Malala', 'Malala Yousafzai', 320, 'Paperback', 'BIOGRAPHY', 22.00, 'https://example.com/i_am_malala.jpg', 105),
('Born a Crime', 'Trevor Noah', 320, 'Paperback', 'BIOGRAPHY', 22.00, 'https://example.com/born_a_crime.jpg', 110),
('Hillbilly Elegy', 'J.D. Vance', 270, 'Paperback', 'BIOGRAPHY', 18.00, 'https://example.com/hillbilly_elegy.jpg', 115),

-- THRILLER
('The Girl on the Train', 'Paula Hawkins', 320, 'Paperback', 'THRILLER', 21.00, 'https://example.com/girl_on_the_train.jpg', 95),
('Gone Girl', 'Gillian Flynn', 400, 'Hardcover', 'THRILLER', 28.00, 'https://example.com/gone_girl.jpg', 85),
('The Da Vinci Code', 'Dan Brown', 450, 'Hardcover', 'THRILLER', 30.00, 'https://example.com/da_vinci_code.jpg', 100),
('The Silent Patient', 'Alex Michaelides', 320, 'Paperback', 'THRILLER', 22.00, 'https://example.com/silent_patient.jpg', 90),
('The Girl with the Dragon Tattoo', 'Stieg Larsson', 500, 'Paperback', 'THRILLER', 35.00, 'https://example.com/girl_with_dragon_tattoo.jpg', 80),
('The Woman in the Window', 'A.J. Finn', 350, 'Paperback', 'THRILLER', 24.00, 'https://example.com/woman_in_the_window.jpg', 110),
('Before I Go to Sleep', 'S.J. Watson', 320, 'Paperback', 'THRILLER', 21.00, 'https://example.com/before_i_go_to_sleep.jpg', 105),
('Sharp Objects', 'Gillian Flynn', 380, 'Paperback', 'THRILLER', 26.00, 'https://example.com/sharp_objects.jpg', 95),
('Behind Closed Doors', 'B.A. Paris', 320, 'Paperback', 'THRILLER', 22.00, 'https://example.com/behind_closed_doors.jpg', 115),
('The Couple Next Door', 'Shari Lapena', 320, 'Paperback', 'THRILLER', 22.00, 'https://example.com/couple_next_door.jpg', 100),

-- DRAMA
('The Great Gatsby', 'F. Scott Fitzgerald', 280, 'Paperback', 'DRAMA', 19.00, 'https://example.com/the_great_gatsby.jpg', 105),
('To Kill a Mockingbird', 'Harper Lee', 350, 'Hardcover', 'DRAMA', 23.00, 'https://example.com/to_kill_a_mockingbird.jpg', 85),
('The Catcher in the Rye', 'J.D. Salinger', 320, 'Paperback', 'DRAMA', 21.00, 'https://example.com/the_catcher_in_the_rye.jpg', 95),
('The Picture of Dorian Gray', 'Oscar Wilde', 300, 'Paperback', 'DRAMA', 20.00, 'https://example.com/picture_of_dorian_gray.jpg', 100),
('Of Mice and Men', 'John Steinbeck', 320, 'Paperback', 'DRAMA', 22.00, 'https://example.com/of_mice_and_men.jpg', 110),
('The Grapes of Wrath', 'John Steinbeck', 400, 'Paperback', 'DRAMA', 24.00, 'https://example.com/grapes_of_wrath.jpg', 115),
('A Streetcar Named Desire', 'Tennessee Williams', 320, 'Paperback', 'DRAMA', 21.00, 'https://example.com/streetcar_named_desire.jpg', 105),
('The Bell Jar', 'Sylvia Plath', 320, 'Paperback', 'DRAMA', 22.00, 'https://example.com/the_bell_jar.jpg', 95),
('The Kite Runner', 'Khaled Hosseini', 400, 'Paperback', 'DRAMA', 26.00, 'https://example.com/the_kite_runner.jpg', 90),
('The Color Purple', 'Alice Walker', 330, 'Paperback', 'DRAMA', 23.00, 'https://example.com/the_color_purple.jpg', 80);