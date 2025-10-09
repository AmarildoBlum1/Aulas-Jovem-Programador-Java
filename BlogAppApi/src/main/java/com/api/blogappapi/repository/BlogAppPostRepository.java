package com.api.blogappapi.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.blogappapi.model.BlogAppPostModel;

public interface BlogAppPostRepository extends JpaRepository<BlogAppPostModel, UUID> {

}
