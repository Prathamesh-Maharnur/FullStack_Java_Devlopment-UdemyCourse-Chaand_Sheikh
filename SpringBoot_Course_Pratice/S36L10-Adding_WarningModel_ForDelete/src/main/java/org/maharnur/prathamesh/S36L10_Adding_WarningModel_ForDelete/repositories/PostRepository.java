package org.maharnur.prathamesh.S36L10_Adding_WarningModel_ForDelete.repositories;

import org.maharnur.prathamesh.S36L10_Adding_WarningModel_ForDelete.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
