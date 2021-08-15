package com.messengerapp.fos.messengerapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<UserModel, Long> {

//    @Query("SELECT * from users where users .id=id")
//    public void getUserById(int id);

}
