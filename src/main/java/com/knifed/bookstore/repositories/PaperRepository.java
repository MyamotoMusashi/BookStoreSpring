package com.knifed.bookstore.repositories;

import com.knifed.bookstore.entities.Paper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperRepository extends JpaRepository<Paper, Integer> {
     Page<Paper> findAllByOrderById(PageRequest of);

    //List<Paper> findAllById(Pageable page);
}
