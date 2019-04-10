package org.qlm.resource.repository;


import org.qlm.resource.bean.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,String> {


    /*根据url找对应的菜单*/
    Menu findByUrl(String url);
}
