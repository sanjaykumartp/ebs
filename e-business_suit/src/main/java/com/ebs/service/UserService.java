package com.ebs.service;


import com.ebs.entity.GroupCreation;
import com.ebs.entity.User;
import com.ebs.model.UserModel;

public interface UserService {

	User register(UserModel userModel);

	User getUserByUserName(String userName);

	GroupCreation newGroup(GroupCreation groupCreation);

	GroupCreation getGroupCreationByGroupName(String groupName);
	
	void deleteGroupbyName(String groupName);

	GroupCreation assignPrograms(String groupName, GroupCreation groupCreation);

	GroupCreation modifyGroup(String groupName, GroupCreation groupCreation);
}
