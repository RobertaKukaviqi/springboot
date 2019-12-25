package com.twowheelsrace.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.twowheelsrace.entity.User;

@Repository
public interface UserRepository extends CrudRepository <User, String>{
	
	public User findByUserName(String userName);
	
	@Query (nativeQuery=true, value = "SELECT * FROM user_ u WHERE u.user_name = :username AND u.password = :password")
	public User findUser(@Param("username") String userName, @Param("password") String password);

	@Query(nativeQuery=true, value = "SELECT * FROM user_ u WHERE u.role_ ='garues'")
	public Iterable<User> userList();

	@Query(nativeQuery=true, value= "UPDATE user_ SET status = :status WHERE nid = :nid" )
	public void validateUser (@Param("status") String status, @Param("nid") String nId);
	
	@Modifying
	@Transactional
	@Query(nativeQuery=true, value = "INSERT INTO users_tracks VALUES(:nid, :track_id, :date_create)")
	public void insertUserTrack (@Param ("nid") String nid, @Param ("track_id") int track_id, @Param("date_create") String date_create );
}
