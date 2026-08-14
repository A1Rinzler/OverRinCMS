package ru.dmitrii.OverRinCMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dmitrii.OverRinCMS.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {}
