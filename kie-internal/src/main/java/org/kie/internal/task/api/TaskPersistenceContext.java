package org.kie.internal.task.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kie.api.task.model.Attachment;
import org.kie.api.task.model.Comment;
import org.kie.api.task.model.Content;
import org.kie.api.task.model.Group;
import org.kie.api.task.model.OrganizationalEntity;
import org.kie.api.task.model.Task;
import org.kie.api.task.model.User;
import org.kie.internal.task.api.model.Deadline;

public interface TaskPersistenceContext {

	Task findTask(Long taskId);
	
	Task persistTask(Task task);
	
	Task updateTask(Task task);
	
	Task removeTask(Task task);
	
	Group findGroup(String groupId);
	
	Group persistGroup(Group group);
	
	Group updateGroup(Group group);
	
	Group removeGroup(Group group);
	
	User findUser(String userId);
	
	User persistUser(User user);
	
	User updateUser(User user);
	
	User removeUser(User user);
	
	OrganizationalEntity findOrgEntity(String orgEntityId);
	
	OrganizationalEntity persistOrgEntity(OrganizationalEntity orgEntity);
	
	OrganizationalEntity updateOrgEntity(OrganizationalEntity orgEntity);
	
	OrganizationalEntity removeOrgEntity(OrganizationalEntity orgEntity);
	
	Content findContent(Long contentId);
	
	Content persistContent(Content content);
	
	Content updateContent(Content content);
	
	Content removeContent(Content content);
	
	Attachment findAttachment(Long attachmentId);
	
	Attachment persistAttachment(Attachment attachment);
	
	Attachment updateAttachment(Attachment attachment);
	
	Attachment removeAttachment(Attachment attachment);
	
	Comment findComment(Long commentId);
	
	Comment persistComment(Comment comment);
	
	Comment updateComment(Comment comment);
	
	Comment removeComment(Comment comment);
	
	Deadline findDeadline(Long deadlineId);
	
	Deadline persistDeadline(Deadline deadline);
	
	Deadline updateDeadline(Deadline deadline);
	
	Deadline removeDeadline(Deadline deadline);
	
	/*
	 * Query related methods
	 */
	
	<T> T queryWithParametersInTransaction(String queryName, Map<String, Object> params, Class<T> clazz);
        
        <T> T queryWithParametersInTransaction(String queryName, boolean singleResult, Map<String, Object> params, Class<T> clazz);
    
	<T> T queryAndLockWithParametersInTransaction(String queryName, Map<String, Object> params, boolean singleResult, Class<T> clazz);
    
	<T> T queryInTransaction(String queryName, Class<T> clazz);
    
	<T> T queryStringInTransaction(String queryString, Class<T> clazz );
   
        <T> T queryStringWithParametersInTransaction(String queryString, boolean singleResult, Map<String, Object> params, Class<T> clazz );
        
	<T> T queryStringWithParametersInTransaction(String queryString,  Map<String, Object> params, Class<T> clazz );
    
	<T> T queryAndLockStringWithParametersInTransaction(String queryName, Map<String, Object> params, boolean singleResult, Class<T> clazz);
    
    int executeUpdateString(String updateString);
    
    HashMap<String, Object> addParametersToMap(Object ... parameterValues);
    
    /*
     * Following are optional methods that are more like extension to 
     * default data model to allow flexible add-ons
     */
	<T> T persist(T object);
	
	<T> T find(Class<T> entityClass, Object primaryKey);
	
	<T> T remove(T entity);
    
    <T> T merge(T entity);
    
    /*
     * life cycle methods 
     */
    boolean isOpen();

    void joinTransaction();

    void close();

    	/**
	 * Native query with parameters
	 * @param queryName - String, native SQL query string
	 * @param params - Map, query parameters
	 * @return List
	 * @author PTI
	 */
    List<Object[]> nativequeryWithParametersInTransaction(String queryName, Map<String, Object> params);
    /**
     * Native query the number of total rows
     * @param queryName - String, native SQL query string
     * @param params - Map, query parameters 
     * @return int, the total rows number
     * @author PTI
     */
    int nativequeryTotalRows(String queryName, Map<String, Object> params);
    
    /**
	 * Update additional process variables table
	 * 
	 * @param taskId
	 *        - Long, task id
	 * @param data
	 *        - Map
	 * @author PTI
	 */
	void updateProcessExtra(Long taskId, Map<String, Object> data);
	
	void updateProcessExtraByInstanceId(Long processInstanceId, Map<String, Object> data);
}
