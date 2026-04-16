package org.maharnur.prathamesh.S36L05_Add_WYSIWYG_TextEditor.repositories;

import org.maharnur.prathamesh.S36L05_Add_WYSIWYG_TextEditor.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
